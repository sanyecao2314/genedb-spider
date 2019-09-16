package com.novelbio.genedb.ricexpro.allrice.rxp006;

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

@PipelineName("rxp006SignalPipelines")
public class Rxp006SignalPipelines implements Pipeline<EntireBean> {

	public void process(EntireBean entireBean) {
		TxtReadandWrite trw = null;
		TxtReadandWrite succTrw = null;
		try {
			System.out.println(entireBean.getRxp() + entireBean.getFeatureNum() + "Si).append(l抓取成功");
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
				if (rawBean.getL70() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("17:00:").append(rawBean.getL70()).append("\t")
						.append("17:10:").append(rawBean.getL71()).append("\t").append("17:20:")
						.append(rawBean.getL72()).append("\t").append("17:30:").append(rawBean.getL73()).append("\t")
						.append("17:40:").append(rawBean.getL74()).append("\t").append("17:50").append(rawBean.getL75())
						.append("\t").append("18:00:").append(rawBean.getL80()).append("\t").append("18:10:")
						.append(rawBean.getL81()).append("\t").append("18:20:").append(rawBean.getL82()).append("\t")
						.append("18:30:").append(rawBean.getL83()).append("\t").append("18:40:")
						.append(rawBean.getL84()).append("\t").append("18:50:").append(rawBean.getL85()).append("\t")
						.append("19:00:").append(rawBean.getL90()).append("\t").append("19:10:")
						.append(rawBean.getL91()).append("\t").append("19:20:").append(rawBean.getL92()).append("\t")
						.append("19:30:").append(rawBean.getL93()).append("\t").append("19:40:")
						.append(rawBean.getL94()).append("\t").append("19:50:").append(rawBean.getL95()).append("\t")
						.append("20:00:").append(rawBean.getL20());

				trw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getL70() == null) {
					continue;
				}
				StringBuffer nrmContext = new StringBuffer();
				nrmContext.append(nrmBean.getRep()).append("\t").append("17:00:").append(nrmBean.getL70()).append("\t")
						.append("17:10:").append(nrmBean.getL71()).append("\t").append("17:20:")
						.append(nrmBean.getL72()).append("\t").append("17:30:").append(nrmBean.getL73()).append("\t")
						.append("17:40:").append(nrmBean.getL74()).append("\t").append("17:50").append(nrmBean.getL75())
						.append("\t").append("18:00:").append(nrmBean.getL80()).append("\t").append("18:10:")
						.append(nrmBean.getL81()).append("\t").append("18:20:").append(nrmBean.getL82()).append("\t")
						.append("18:30:").append(nrmBean.getL83()).append("\t").append("18:40:")
						.append(nrmBean.getL84()).append("\t").append("18:50:").append(nrmBean.getL85()).append("\t")
						.append("19:00:").append(nrmBean.getL90()).append("\t").append("19:10:")
						.append(nrmBean.getL91()).append("\t").append("19:20:").append(nrmBean.getL92()).append("\t")
						.append("19:30:").append(nrmBean.getL93()).append("\t").append("19:40:" + nrmBean.getL94())
						.append("\t").append("19:50:").append(nrmBean.getL95()).append("\t").append("20:00:")
						.append(nrmBean.getL20());
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
