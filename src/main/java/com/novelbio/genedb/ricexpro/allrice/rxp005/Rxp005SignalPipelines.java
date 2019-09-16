package com.novelbio.genedb.ricexpro.allrice.rxp005;

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

@PipelineName("rxp005SignalPipelines")
public class Rxp005SignalPipelines implements Pipeline<EntireBean> {

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
				if (rawBean.getL35() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("3:50:").append(rawBean.getL35()).append("\t")
						.append("4:00:").append(rawBean.getL40()).append("\t").append("4:10:").append(rawBean.getL41())
						.append("\t").append("4:20:").append(rawBean.getL42()).append("\t").append("4:30:")
						.append(rawBean.getL43()).append("\t").append("4:40:").append(rawBean.getL44()).append("\t")
						.append("4:50:").append(rawBean.getL45()).append("\t").append("5:00:").append(rawBean.getL50())
						.append("\t").append("5:10:").append(rawBean.getL51()).append("\t").append("5:20:")
						.append(rawBean.getL52()).append("\t").append("5:30:").append(rawBean.getL53()).append("\t")
						.append("5:40:").append(rawBean.getL54()).append("\t").append("5:50:").append(rawBean.getL55())
						.append("\t").append("6:00:").append(rawBean.getL60());

				trw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getL35() == null) {
					continue;
				}
				StringBuffer nrmContext = new StringBuffer();
				nrmContext.append(nrmBean.getRep()).append("\t").append("3:50:").append(nrmBean.getL35()).append("\t")
						.append("4:00:").append(nrmBean.getL40()).append("\t").append("4:10:").append(nrmBean.getL41())
						.append("\t").append("4:20:").append(nrmBean.getL42()).append("\t").append("4:30:")
						.append(nrmBean.getL43()).append("\t").append("4:40:").append(nrmBean.getL44()).append("\t")
						.append("4:50:").append(nrmBean.getL45()).append("\t").append("5:00:").append(nrmBean.getL50())
						.append("\t").append("5:10:").append(nrmBean.getL51()).append("\t").append("5:20:")
						.append(nrmBean.getL52()).append("\t").append("5:30:").append(nrmBean.getL53()).append("\t")
						.append("5:40:").append(nrmBean.getL54()).append("\t").append("5:50:").append(nrmBean.getL55())
						.append("\t").append("6:00:").append(nrmBean.getL60());
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
