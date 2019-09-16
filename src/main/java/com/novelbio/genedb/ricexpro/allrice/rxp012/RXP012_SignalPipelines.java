package com.novelbio.genedb.ricexpro.allrice.rxp012;

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

@PipelineName("rXP012_SignalPipelines")
public class RXP012_SignalPipelines implements Pipeline<EntireBean> {

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
				if (rawBean.getEm07() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("Embryo-07-DAF:").append(rawBean.getEm07())
						.append("\t").append("Embryo-10-DAF:").append(rawBean.getEm10()).append("\t")
						.append("Embryo-14-DAF:").append(rawBean.getEm14()).append("\t").append("Embryo-21-DAF:")
						.append(rawBean.getEm21()).append("\t").append("Embryo-28-DAF:").append(rawBean.getEm28())
						.append("\t").append("Embryo-42-DAF:").append(rawBean.getEm42()).append("\t")
						.append("Endosperm-07-DAF:").append(rawBean.getEn07()).append("\t").append("Endosperm-10-DAF:")
						.append(rawBean.getEn10()).append("\t").append("Endosperm-14-DAF:").append(rawBean.getEn14())
						.append("\t").append("Endosperm-21-DAF:").append(rawBean.getEn21()).append("\t")
						.append("Endosperm-28-DAF:").append(rawBean.getEn28()).append("\t").append("Endosperm-42-DAF:")
						.append(rawBean.getEn42());

				trw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getEm07() == null) {
					continue;
				}
				StringBuffer nrmContext = new StringBuffer();
				nrmContext.append(nrmBean.getRep()).append("\t").append("Embryo-07-DAF:").append(nrmBean.getEm07())
						.append("\t").append("Embryo-10-DAF:").append(nrmBean.getEm10()).append("\t")
						.append("Embryo-14-DAF:").append(nrmBean.getEm14()).append("\t").append("Embryo-21-DAF:")
						.append(nrmBean.getEm21()).append("\t").append("Embryo-28-DAF:").append(nrmBean.getEm28())
						.append("\t").append("Embryo-42-DAF:").append(nrmBean.getEm42()).append("\t")
						.append("Endosperm-07-DAF:").append(nrmBean.getEn07()).append("\t").append("Endosperm-10-DAF:")
						.append(nrmBean.getEn10()).append("\t").append("Endosperm-14-DAF:").append(nrmBean.getEn14())
						.append("\t").append("Endosperm-21-DAF:").append(nrmBean.getEn21()).append("\t")
						.append("Endosperm-28-DAF:").append(nrmBean.getEn28()).append("\t").append("Endosperm-42-DAF:")
						.append(nrmBean.getEn42());
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
