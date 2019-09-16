package com.novelbio.genedb.ricexpro.allrice.rxp4002;

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

@PipelineName("rxp4002SignalPipelines")
public class Rxp4002SignalPipelines implements Pipeline<EntireBean> {

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
				if (rawBean.getT2() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("Temporal-2DAT:").append(rawBean.getT2())
						.append("\t").append("Temporal-3DAT:").append(rawBean.getT3()).append("\t").append("\t")
						.append("Temporal-4DAT:").append(rawBean.getT4()).append("\t").append("\t")
						.append("Spatial-3DAP_Apical:").append(rawBean.getS3a()).append("\t").append("\t")
						.append("Spatial-3DAP_Basal:").append(rawBean.getS3b()).append("\t").append("\t")
						.append("Spatial-3DAP_Ventral	:").append(rawBean.getS3v()).append("\t").append("\t")
						.append("Spatial-3DAP_Dorsal:").append(rawBean.getS3d());

				trw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getT2() == null) {
					continue;
				}
				StringBuffer nrmContext = new StringBuffer();
				nrmContext.append(nrmBean.getRep()).append("\t").append("Temporal-2DAT:").append(nrmBean.getT2())
						.append("\t" + "Temporal-3DAT:").append(nrmBean.getT3()).append("\t").append("\t")
						.append("Temporal-4DAT:").append(nrmBean.getT4()).append("\t").append("\t")
						.append("Spatial-3DAP_Apical:").append(nrmBean.getS3a()).append("\t").append("\t")
						.append("Spatial-3DAP_Basal:").append(nrmBean.getS3b()).append("\t").append("\t")
						.append("Spatial-3DAP_Ventral	:").append(nrmBean.getS3v()).append("\t").append("\t")
						.append("Spatial-3DAP_Dorsal:").append(nrmBean.getS3d());
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
