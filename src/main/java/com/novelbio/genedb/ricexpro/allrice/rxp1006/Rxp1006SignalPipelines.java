package com.novelbio.genedb.ricexpro.allrice.rxp1006;

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

@PipelineName("rxp1006SignalPipelines")
public class Rxp1006SignalPipelines implements Pipeline<EntireBean> {

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
			trw.writefileln(entireBean.getFeatureNum() + "Ratio" + "\n", true);
			List<C5c3> c5c3s = entireBean.getC5c3s();

			for (C5c3 c5c3 : c5c3s) {
				if (c5c3.getHr0() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(c5c3.getRep()).append("\t").append("0-hr(Cy5/Cy3):").append(c5c3.getHr0())
						.append("\t").append("1-hr(Cy5/Cy3):").append(c5c3.getHr1()).append("\t")
						.append("3-hr(Cy5/Cy3):").append(c5c3.getHr3()).append("\t").append("6-hr(Cy5/Cy3):")
						.append(c5c3.getHr6()).append("\t").append("12-hr(Cy5/Cy3):").append(c5c3.getHr12());

				trw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Raw" + "\n", true);
			List<RawBean> rawBeans = entireBean.getRawBeans();

			for (RawBean rawBean : rawBeans) {
				if (rawBean.getHr03() == null) {
					continue;
				}

				StringBuffer nrmContext = new StringBuffer();
				nrmContext.append(rawBean.getRep()).append("\t").append("0-hr(Cy3):").append(rawBean.getHr03())
						.append("\t").append("0-hr(Cy5):").append(rawBean.getHr05()).append("\t").append("1-hr(Cy3):")
						.append(rawBean.getHr13()).append("\t").append("1-hr(Cy5):").append(rawBean.getHr15())
						.append("\t").append("3-hr(Cy3):").append(rawBean.getHr33()).append("\t").append("3-hr(Cy5):")
						.append(rawBean.getHr35()).append("\t").append("6-hr(Cy3):").append(rawBean.getHr63())
						.append("\t").append("6-hr(Cy5):").append(rawBean.getHr65()).append("\t").append("12-hr(Cy3):")
						.append(rawBean.getHr123()).append("\t").append("12-hr(Cy5):").append(rawBean.getHr125());
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
