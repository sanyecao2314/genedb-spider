package com.novelbio.genedb.ricexpro.allrice.rxp011;

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

@PipelineName("rXP011_SignalPipelines")
public class RXP011_SignalPipelines implements Pipeline<EntireBean> {

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
				if (rawBean.getOdat01() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("Ovary-01-DAT:").append(rawBean.getOdat01())
						.append("\t").append("Ovary-02-DAT:").append(rawBean.getOdat02()).append("\t")
						.append("Ovary-03-DAT:").append(rawBean.getOdat03()).append("\t").append("Ovary-04-DAT:")
						.append(rawBean.getOdat04()).append("\t").append("Ovary-05-DAT:").append(rawBean.getOdat05())
						.append("\t").append("Ovary-06-DAT:").append(rawBean.getOdat06()).append("\t")
						.append("Ovary-07-DAT:").append(rawBean.getOdat07()).append("\t").append("Ovary-08-DAT:")
						.append(rawBean.getOdat08()).append("\t").append("Ovary-09-DAT:").append(rawBean.getOdat09())
						.append("\t").append("Ovary-10-DAT:").append(rawBean.getOdat10()).append("\t")
						.append("Embryo-04-DAT:").append(rawBean.getEdat04()).append("\t").append("Embryo-05-DAT:")
						.append(rawBean.getEdat05()).append("\t").append("Embryo-06-DAT:").append(rawBean.getEdat06())
						.append("\t").append("Embryo-07-DAT:").append(rawBean.getEdat07()).append("\t")
						.append("Embryo-08-DAT:").append(rawBean.getEdat08()).append("\t").append("Embryo-09-DAT:")
						.append(rawBean.getEdat09()).append("\t").append("Embryo-10-DAT:").append(rawBean.getEdat10());

				trw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getOdat01() == null) {
					continue;
				}
				StringBuffer nrmContext = new StringBuffer();
				nrmContext.append(nrmBean.getRep()).append("Ovary-01-DAT:").append(nrmBean.getOdat01())
						.append("\t").append("Ovary-02-DAT:").append(nrmBean.getOdat02()).append("\t").append("Ovary-03-DAT:")
						.append(nrmBean.getOdat03()).append("\t").append("Ovary-04-DAT:").append(nrmBean.getOdat04())
						.append("\t").append("Ovary-05-DAT:").append(nrmBean.getOdat05()).append("\t").append("Ovary-06-DAT:")
						.append(nrmBean.getOdat06()).append("\t").append("Ovary-07-DAT:").append(nrmBean.getOdat07())
						.append("\t").append("Ovary-08-DAT:").append(nrmBean.getOdat08()).append("\t").append("Ovary-09-DAT:")
						.append(nrmBean.getOdat09()).append("\t").append("Ovary-10-DAT:").append(nrmBean.getOdat10())
						.append("\t").append("Embryo-04-DAT:").append(nrmBean.getEdat04())
						.append("\t").append("Embryo-05-DAT:").append(nrmBean.getEdat05()).append("\t")
						.append("Embryo-06-DAT:").append(nrmBean.getEdat06()).append("\t").append("Embryo-07-DAT:")
						.append(nrmBean.getEdat07()).append("\t").append("Embryo-08-DAT:").append(nrmBean.getEdat08())
						.append("\t").append("Embryo-09-DAT:").append(nrmBean.getEdat09()).append("\t")
						.append("Embryo-10-DAT:").append(nrmBean.getEdat10());
				
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
