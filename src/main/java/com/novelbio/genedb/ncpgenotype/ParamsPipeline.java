package com.novelbio.genedb.ncpgenotype;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;

@PipelineName("paramsPipeline")
public class ParamsPipeline implements Pipeline<ParamsBean> {


	public void process(ParamsBean paramsBean) {

		String jsonStr = JSON.toJSONString(paramsBean);
		System.out.println(jsonStr);
		TxtReadandWrite tw = null;
		TxtReadandWrite trw = null;
		TxtReadandWrite trwSucc = null;
		try {
			String twPath = "/home/novelbio/data/VariationGene/VariationGene.txt";
			String trwPath = "/home/novelbio/data/VariationGene/1.csv";
			String trwSuccPath = "/home/novelbio/data/VariationGene/succ.csv";
			tw = new TxtReadandWrite(new FileOutputStream(new File(twPath), true));

			trw = new TxtReadandWrite(new FileInputStream(new File(trwPath)));
			//trwSucc = new TxtReadandWrite(new File(trwSuccPath), true);

			//读取已成功位点
			Iterable<String> succSit = trwSucc.readlines(-1);
			HashSet<String> succSiteSet = new HashSet<String>();
			for (String site : succSit) {
				succSiteSet.add(site);
			}
			
			writeTitle(paramsBean, tw);
			Iterable<String> readlines = trw.readlines(-1);

			String sites = "";
			int i = 5;
			for (String site : readlines) {
				//添加未抓取的位点
				//if(!succSiteSet.contains(site)) {
					sites += site + ",";
					i--;
				//}
				
				if (i == 0) {
					// 抓取网页
					String html = spider(paramsBean, sites, trwSucc);
					// 解析网页
					parseHtml(html, tw);
					i = 5;
					sites = "";
				}
			}
			// 抓取网页
			String html = spider(paramsBean, sites, trwSucc);
			// 解析网页
			parseHtml(html, tw);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			tw.close();
			trw.close();
		}

	}

	private void writeTitle(ParamsBean paramsBean, TxtReadandWrite tw) {
		// 抓取网页
		String html = spider(paramsBean, "vg1209999434", null);
		Document document = Jsoup.parse(html);
		Elements ths = document.getElementsByTag("th");
		for (Element th : ths) {
			if(!"vg1209999434".equals(th.text())) {
				tw.writefile(th.text() + "\t", true);
			}
		}
		tw.writefile("\n", true);
	}

	private void parseHtml(String html, TxtReadandWrite tw) {
		// 解析网页
		Document document = Jsoup.parse(html);
		Elements elements = document.getElementsByTag("a");
		Elements tds = document.getElementsByTag("td");
		Element th1 = elements.get(25);
		String t1 = th1.text();
		if (t1.contains("vg")) {
			tw.writefile(t1 + "\t", true);
			for (int i = 0; i < tds.size(); i += 5) {
				tw.writefile(tds.get(i).text() + "\t", true);
			}
			tw.writefile("\n", true);
		}

		Element th2 = elements.get(26);
		String t2 = th2.text();
		if (t2.contains("vg")) {
			tw.writefile(t2 + "\t", true);
			for (int i = 1; i < tds.size(); i += 5) {
				tw.writefile(tds.get(i).text() + "\t", true);
			}
			tw.writefile("\n", true);
		}

		Element th3 = elements.get(27);
		String t3 = th3.text();
		if (t3.contains("vg")) {
			tw.writefile(t3 + "\t", true);
			for (int i = 2; i < tds.size(); i += 5) {
				tw.writefile(tds.get(i).text() + "\t", true);
			}
			tw.writefile("\n", true);
		}

		Element th4 = elements.get(28);
		String t4 = th4.text();
		if (t4.contains("vg")) {
			tw.writefile(t4 + "\t", true);
			for (int i = 3; i < tds.size(); i += 5) {
				tw.writefile(tds.get(i).text() + "\t", true);
			}
			tw.writefile("\n", true);
		}

		Element th5 = elements.get(29);
		String t5 = th5.text();
		if (t4.contains("vg")) {
			tw.writefile(t5 + "\t", true);
			for (int i = 4; i < tds.size(); i += 5) {
				tw.writefile(tds.get(i).text() + "\t", true);
			}
			tw.writefile("\n", true);
		}
	}

	private static int i = 1;
	private String spider(ParamsBean paramsBean, String site, TxtReadandWrite trwSucc) {
		
		
		// 我们可以使用一个Builder来设置UA字段，然后再创建HttpClient对象
		HttpClientBuilder builder = HttpClients.custom();

		// 对照UA字串的标准格式理解一下每部分的意思
		builder.setUserAgent(
				"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
		final CloseableHttpClient httpclient = builder.build();

		HttpPost httpPost = new HttpPost("http://ricevarmap.ncpgr.cn/v2/vars_genotype/");

		httpPost.setHeader("Accept-Language", "zh-CN,zh;q=0.9");
		httpPost.setHeader("Accept",
				"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
		httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");
		httpPost.setHeader("Cache-Control", "no-cache");
		httpPost.setHeader("Referer", "http://ricevarmap.ncpgr.cn/v2/vars_genotype/");
		httpPost.setHeader("Cookie",
				"_ga=GA1.2.812008125.1530608646; csrftoken=KX3DATw23pd2mKV08hEjCs7woQAC66HL3gtpSskAEsRITyJNjtS9hu9i5ks7N3Hn; __utmz=64146604.1530608881.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utma=64146604.812008125.1530608646.1530616951.1530689861.4; _gid=GA1.2.410927198.1533625074; _gat=1");

		List<BasicNameValuePair> nvps = new ArrayList<>();

		// 传递2个参数 name和password
		nvps.add(new BasicNameValuePair("csrfmiddlewaretoken",
				"zGu4Kjd2cTP93qiHsrEcrYpaiimmno36SZUQ2S1ANWtPAe6uDDS260rWZMeR4l3I")); // vNTZyAYudFwMLYWGqHmlAKlAIoO0sR4tltCeAMBJRGn1B43FzL2N6QdW5XwozFwV
		nvps.add(new BasicNameValuePair("q", ""));
		nvps.add(new BasicNameValuePair("q", ""));
		List<String> options = paramsBean.getOptions();
		for (int i = 0; i < options.size(); i++) {
			nvps.add(new BasicNameValuePair("to[]", options.get(i)));
		}
		nvps.add(new BasicNameValuePair("var_ids", site));
		nvps.add(new BasicNameValuePair("type", "all"));

		// 转码 封装成请求实体
		HttpEntity reqEntity = new UrlEncodedFormEntity(nvps, Consts.UTF_8);

		httpPost.setEntity(reqEntity);
		CloseableHttpResponse response;

		try {
			response = httpclient.execute(httpPost);
			System.out.println(response.getStatusLine());
			HttpEntity resEntity = response.getEntity();
			if (resEntity != null) {
				System.out.println("Response content length: " + resEntity.getContentLength());
				String context = IOUtils.toString(resEntity.getContent());
				System.out.println("已抓取" + i++ * 5 + "个位点数据");
				//将已抓取的位点写入文件
				String[] sites = site.split(",");
				for (String sit : sites) {
					if(trwSucc != null) {
						trwSucc.writefile(sit + "\n");
					}
				}
				return context;
			}
			EntityUtils.consume(resEntity);
			response.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
