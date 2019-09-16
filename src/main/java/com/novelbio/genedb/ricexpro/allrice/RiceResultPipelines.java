package com.novelbio.genedb.ricexpro.allrice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.novelbio.base.dataOperate.TxtReadandWrite;

@PipelineName("riceResultPipelines")
public class RiceResultPipelines implements Pipeline<RiceBeanList> {

	public static List<HttpRequest> featureRequests = new ArrayList<HttpRequest>();

	public void process(RiceBeanList riceBeanList) {
		TxtReadandWrite trw = null;
		TxtReadandWrite succTrw = null;
		try {
			System.out.println(riceBeanList.getRxp() + "第" + riceBeanList.getCurrPage() + "页，抓取成功");
			Properties properties = new Properties();
			// 使用ClassLoader加载properties配置文件生成对应的输入流
			InputStream in = RiceResultPipelines.class.getClassLoader().getResourceAsStream("ricexpro/path.properties");
			// 使用properties对象加载输入流
			properties.load(in);

			// 获取key对应的value值
			String path = properties.getProperty("path");
			String signalPath = path;

			path = path + riceBeanList.getRxp() + ".csv";
			// 将抓取成功的url写入成功文本
			String succPath = properties.getProperty("succPath");
			succTrw = new TxtReadandWrite(new FileOutputStream(new File(succPath + "succUrl.txt"), true));
			succTrw.writefile(riceBeanList.getCurrRequest().getUrl() + "\n", true);

			trw = new TxtReadandWrite(new FileOutputStream(new File(path), true));

			// 获得所有正常行对象的集合
			List<RiceBean> ricBeans = riceBeanList.getRiceBeans();
			// 获得所有特殊行对象的集合
			List<RiceSpecBean> specBeans = riceBeanList.getRiceSpecBeans();
			for (int i = 0; i < ricBeans.size(); i++) {
				RiceBean riceBean = ricBeans.get(i);
				// 对表格合并行进行处理
				if (riceBean.getLocusID() == null) {
					RiceSpecBean specBean = specBeans.get(i);
					riceBean.setLocusID(ricBeans.get(i - 1).getLocusID());
					riceBean.setLocusID(riceBean.getLocusID());
					riceBean.setFeatureNum(specBean.getFeatureNum());
					riceBean.setAccession(specBean.getAccession());
					riceBean.setSequenceID(specBean.getSequenceID());
					riceBean.setDescription(specBean.getDescription());
					riceBean.setMsuID(specBean.getMsuID());
				}

				// 将行对象内容按格式写入文档
				StringBuffer result = new StringBuffer();
				result.append(riceBean.getLocusID()).append("\t").append(riceBean.getFeatureNum()).append("\t")
						.append(riceBean.getAccession()).append("\t").append(riceBean.getSequenceID()).append("\t")
						.append(riceBean.getDescription()).append("\t").append(riceBean.getMsuID());
				trw.writefile(result.append("\n").toString(), true);

			}

			// 深度抓取
			String rxp = riceBeanList.getRxp();
			if (!"RXP_1000".equals(rxp) && !"RXP_3001".equals(rxp) && !"RXP_3002".equals(rxp)
					&& !"RXP_3003".equals(rxp))
				process(riceBeanList, ricBeans, signalPath);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (trw != null)
				trw.close();
			if (succTrw != null) {
				succTrw.close();
			}
		}
	}

	private void process(RiceBeanList riceBeanList, List<RiceBean> ricBeans, String signalPath) {

		if (ricBeans == null) {
			return;
		}
		for (RiceBean riceBean : ricBeans) {
			String featureNum = riceBean.getFeatureNum();
			if (featureNum != null) {
				String featureUrl = "http://ricexpro.dna.affrc.go.jp/" + riceBeanList.getRxp()
						+ "/view-plot-data.php?featurenum=" + featureNum;
				HttpRequest currRequest = riceBeanList.getCurrRequest(); //
				// featureRequests.add(currRequest.subRequest(featureUrl));
				// System.out.println(featureRequests.size());

				// 加入爬虫队列
				// DeriveSchedulerContext.into(currRequest.subRequest(featureUrl));

				// 将地址写入文件
				TxtReadandWrite trw = null;
				try {
					trw = new TxtReadandWrite(new FileOutputStream(new File(signalPath + "child.txt"), true));
					trw.writefile(featureUrl + "\n", true);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} finally {
					// 释放资源
					if (trw != null)
						trw.close();
				}
			}
		}
	}
}
