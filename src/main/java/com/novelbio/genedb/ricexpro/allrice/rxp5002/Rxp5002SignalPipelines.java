package com.novelbio.genedb.ricexpro.allrice.rxp5002;

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

@PipelineName("rxp5002SignalPipelines")
public class Rxp5002SignalPipelines implements Pipeline<EntireBean> {

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
				if (rawBean.getH6c() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("6h-Control_6h:").append(rawBean.getH6c())
						.append("\t").append("6h--N_6h:").append(rawBean.getH6n()).append("\t").append("6h--P_6h:")
						.append(rawBean.getH6p()).append("\t").append("6h--K_6h:").append(rawBean.getH6k()).append("\t")
						.append("24h-Control_24h:").append(rawBean.getH24c()).append("\t").append("24h--N_24h:")
						.append(rawBean.getH24n()).append("\t").append("24h--P_24h:").append(rawBean.getH24p())
						.append("\t").append("24h--K_24h:").append(rawBean.getH24k());
				trw.writefile(rawContext.toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getH6c() == null) {
					continue;
				}
				StringBuffer nrmContext = new StringBuffer();
				nrmContext.append(nrmBean.getRep()).append("\t").append("6h-Control_6h:").append(nrmBean.getH6c())
						.append("\t").append("6h--N_6h:").append(nrmBean.getH6n()).append("\t").append("6h--P_6h:")
						.append(nrmBean.getH6p()).append("\t").append("6h--K_6h:").append(nrmBean.getH6k()).append("\t")
						.append("24h-Control_24h:").append(nrmBean.getH24c()).append("\t").append("24h--N_24h:")
						.append(nrmBean.getH24n()).append("\t").append("24h--P_24h:").append(nrmBean.getH24p())
						.append("\t").append("24h--K_24h:").append(nrmBean.getH24k());
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
