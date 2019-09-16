package com.novelbio.genedb.ricexpro.allrice.rxp004;

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

@PipelineName("rxp004SignalPipelines")
public class Rxp004SignalPipelines implements Pipeline<EntireBean> {

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
				if (rawBean.getDat14() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("14-DAT:").append(rawBean.getDat14())
						.append("\t").append("21-DAT:").append(rawBean.getDat21()).append("\t").append("28-DAT:")
						.append(rawBean.getDat28()).append("\t").append("35-DAT:").append(rawBean.getDat35())
						.append("\t").append("42-DAT:").append(rawBean.getDat42()).append("\t").append("49-DAT:")
						.append(rawBean.getDat49()).append("\t").append("56-DAT:").append(rawBean.getDat56())
						.append("\t").append("63-DAT:").append(rawBean.getDat63()).append("\t").append("70-DAT:")
						.append(rawBean.getDat70()).append("\t").append("77-DAT:").append(rawBean.getDat77())
						.append("\t").append("84-DAT:").append(rawBean.getDat84()).append("\t").append("91-DAT:")
						.append(rawBean.getDat91()).append("\t").append("98-DAT:").append(rawBean.getDat98())
						.append("\t").append("105-DAT:").append(rawBean.getDat105()).append("\t").append("112-DAT:")
						.append(rawBean.getDat112()).append("\t").append("119-DAT:").append(rawBean.getDat119())
						.append("\t").append("126-DAT:").append(rawBean.getDat126());

				trw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getDat14() == null) {
					continue;
				}
				StringBuffer nrmContext = new StringBuffer();
				nrmContext.append(nrmBean.getRep()).append("\t").append("14-DAT:").append(nrmBean.getDat14())
						.append("\t").append("21-DAT:").append(nrmBean.getDat21()).append("\t").append("28-DAT:")
						.append(nrmBean.getDat28()).append("\t").append("35-DAT:").append(nrmBean.getDat35())
						.append("\t").append("42-DAT:").append(nrmBean.getDat42()).append("\t").append("49-DAT:")
						.append(nrmBean.getDat49()).append("\t").append("56-DAT:").append(nrmBean.getDat56())
						.append("\t").append("63-DAT:").append(nrmBean.getDat63()).append("\t").append("70-DAT:")
						.append(nrmBean.getDat70()).append("\t").append("77-DAT:").append(nrmBean.getDat77())
						.append("\t").append("84-DAT:").append(nrmBean.getDat84()).append("\t").append("91-DAT:")
						.append(nrmBean.getDat91()).append("\t").append("98-DAT:").append(nrmBean.getDat98())
						.append("\t").append("105-DAT:").append(nrmBean.getDat105()).append("\t").append("112-DAT:")
						.append(nrmBean.getDat112()).append("\t").append("119-DAT:").append(nrmBean.getDat119())
						.append("\t").append("126-DAT:").append(nrmBean.getDat126());
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
