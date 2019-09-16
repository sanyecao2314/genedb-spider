package com.novelbio.genedb.ricexpro.allrice.rxp010;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.genedb.ricexpro.allrice.RiceResultPipelines;

@PipelineName("rXP010_SignalPipelines")
public class RXP010_SignalPipelines implements Pipeline<EntireBean> {

	public void process(EntireBean entireBean) {
		TxtReadandWrite trw = null;
		TxtReadandWrite succTrw = null;
		try {
			System.out.println(entireBean.getRxp() + entireBean.getFeatureNum() + "Signal抓取成功");
			Properties properties = new Properties();
			// 使用ClassLoader加载properties配置文件生成对应的输入流
			InputStream in = RiceResultPipelines.class.getClassLoader().getResourceAsStream("ricexpro/path.properties");
			// 使用properties对象加载输入流
			properties.load(in);
			// 获取key对应的value值
			String path = properties.getProperty("path");
			path = path + entireBean.getRxp() + "Signal.csv";

			//将抓取成功的url写入成功文本
			String succPath = properties.getProperty("succPath");
			succTrw = new TxtReadandWrite(new FileOutputStream(new File(succPath + "succUrl.txt"), true));
			succTrw.writefile(entireBean.getCurrRequest().getUrl() + "\n", true);
			
			trw = new TxtReadandWrite(new FileOutputStream(new File(path), true));
			trw.writefile(entireBean.getFeatureNum() + "Raw" + "\n", true);
			List<RawBean> rawBeans = entireBean.getRawBeans();

			for (RawBean rawBean : rawBeans) {
				if (rawBean.getIn06() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("Inflorescence-0.6-1.0mm:")
						.append(rawBean.getIn06()).append("\t").append("Inflorescence-1.0-1.5mm:")
						.append(rawBean.getIn10()).append("\t").append("Inflorescence-1.5-2.0mm:")
						.append(rawBean.getIn15()).append("\t").append("Inflorescence-2.0-2.5mm:")
						.append(rawBean.getIn20()).append("\t").append("Inflorescence-2.5-3.0mm:")
						.append(rawBean.getIn25()).append("\t").append("Inflorescence-3.0-4.0mm:")
						.append(rawBean.getIn30()).append("\t").append("Inflorescence-4.0-5.0mm:")
						.append(rawBean.getIn40()).append("\t").append("Inflorescence-5.0-10mm:")
						.append(rawBean.getIn50()).append("\t").append("Anther-0.3-0.6mm:").append(rawBean.getAn03())
						.append("\t").append("Anther-0.7-1.0mm:").append(rawBean.getAn07()).append("\t")
						.append("Anther-1.2-1.5mm:").append(rawBean.getAn12()).append("\t").append("Anther-1.6-2.0mm:")
						.append(rawBean.getAn16()).append("\t").append("Pistil-5-10cm-panicle:")
						.append(rawBean.getPi5()).append("\t").append("Pistil-10-14cm-panicle:")
						.append(rawBean.getPi10()).append("\t").append("Pistil-14-18 cm-panicle:")
						.append(rawBean.getPi14()).append("\t").append("Lemma,Palea-Lemma-1.5-2.0cm-floret:")
						.append(rawBean.getLpl15()).append("\t").append("Lemma,Palea-Palea-1.5-2.0cm-floret:")
						.append(rawBean.getLpp15()).append("\t").append("Lemma,Palea-Lemma-4.0-5.0cm-floret:")
						.append(rawBean.getLpl40()).append("\t").append("Lemma,Palea-Palea-4.0-5.0cm-floret:")
						.append(rawBean.getLpp40()).append("\t").append("Lemma,Palea-Lemma-7.0cm-floret:")
						.append(rawBean.getLpl70()).append("\t").append("Lemma,Palea-Palea-7.0cm-floret:")
						.append(rawBean.getLpp70());

				trw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getIn06() == null) {
					continue;
				}
				StringBuffer nrmContext = new StringBuffer();
				nrmContext.append(nrmBean.getRep()).append("\t").append("Inflorescence-0.6-1.0mm:")
						.append(nrmBean.getIn06()).append("\t").append("Inflorescence-1.0-1.5mm:")
						.append(nrmBean.getIn10()).append("\t").append("Inflorescence-1.5-2.0mm:")
						.append(nrmBean.getIn15()).append("\t").append("Inflorescence-2.0-2.5mm:")
						.append(nrmBean.getIn20()).append("\t").append("Inflorescence-2.5-3.0mm:")
						.append(nrmBean.getIn25()).append("\t").append("Inflorescence-3.0-4.0mm:")
						.append(nrmBean.getIn30()).append("\t").append("Inflorescence-4.0-5.0mm:")
						.append(nrmBean.getIn40()).append("\t").append("Inflorescence-5.0-10mm:")
						.append(nrmBean.getIn50()).append("\t").append("Anther-0.3-0.6mm:").append(nrmBean.getAn03())
						.append("\t").append("Anther-0.7-1.0mm:").append(nrmBean.getAn07()).append("\t")
						.append("Anther-1.2-1.5mm:").append(nrmBean.getAn12()).append("\t").append("Anther-1.6-2.0mm:")
						.append(nrmBean.getAn16()).append("\t").append("Pistil-5-10cm-panicle:")
						.append(nrmBean.getPi5()).append("\t").append("Pistil-10-14cm-panicle:")
						.append(nrmBean.getPi10()).append("\t").append("Pistil-14-18 cm-panicle:")
						.append(nrmBean.getPi14()).append("\t").append("Lemma,Palea-Lemma-1.5-2.0cm-floret:")
						.append(nrmBean.getLpl15()).append("\t").append("Lemma,Palea-Palea-1.5-2.0cm-floret:")
						.append(nrmBean.getLpp15()).append("\t").append("Lemma,Palea-Lemma-4.0-5.0cm-floret:")
						.append(nrmBean.getLpl40()).append("\t").append("Lemma,Palea-Palea-4.0-5.0cm-floret:")
						.append(nrmBean.getLpp40()).append("\t").append("Lemma,Palea-Lemma-7.0cm-floret:")
						.append(nrmBean.getLpl70()).append("\t").append("Lemma,Palea-Palea-7.0cm-floret:")
						.append(nrmBean.getLpp70());
				trw.writefile(nrmContext.append("\n").toString(), true);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			if (trw != null)
				trw.close();
			if (succTrw != null)
				succTrw.close();
		}
	}

}
