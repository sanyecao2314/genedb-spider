package com.novelbio.genedb.ricexpro.allrice.rxp4001;

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

@PipelineName("rxp4001SignalPipelines")
public class Rxp4001SignalPipelines implements Pipeline<EntireBean> {

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
				if (rawBean.getDr() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("Development-Root_Cap:").append(rawBean.getDr())
						.append("\t").append("Development-Division_zone:").append(rawBean.getDd()).append("\t")
						.append("Development-Elongation_zone:").append(rawBean.getDe()).append("\t")
						.append("Development-Maturation_zone-I:").append(rawBean.getDm1()).append("\t")
						.append("Development-Maturation_zone-II:").append(rawBean.getDm2()).append("\t")
						.append("Development-Maturation_zone-III:").append(rawBean.getDm3()).append("\t")
						.append("Development-Maturation_zone-IV:").append(rawBean.getDm4()).append("\t")
						.append("Development-Maturation_zone-V:").append(rawBean.getDm5()).append("\t")
						.append("Tissue-Elongation_zone_I-Epi.Exo.Scle.:").append(rawBean.getTeep()).append("\t")
						.append("Tissue-Elongation_zone_I-Cortex:").append(rawBean.getTec()).append("\t")
						.append("Tissue-Elongation_zone_I-End.Per.Ste.:").append(rawBean.getTeen()).append("\t")
						.append("Tissue-Maturation_zone_V-Epi.Exo.Scle.:").append(rawBean.getTmep()).append("\t")
						.append("Tissue-Maturation_zone_V-End.Per.Ste.:").append(rawBean.getTmen());
				trw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getDr() == null) {
					continue;
				}
				StringBuffer nrmContext = new StringBuffer();
				nrmContext.append(nrmBean.getRep()).append("\t").append("Development-Root_Cap:").append(nrmBean.getDr())
						.append("\t").append("Development-Division_zone:").append(nrmBean.getDd()).append("\t")
						.append("Development-Elongation_zone:").append(nrmBean.getDe()).append("\t")
						.append("Development-Maturation_zone-I:").append(nrmBean.getDm1()).append("\t")
						.append("Development-Maturation_zone-II:").append(nrmBean.getDm2()).append("\t")
						.append("Development-Maturation_zone-III:").append(nrmBean.getDm3()).append("\t")
						.append("Development-Maturation_zone-IV:").append(nrmBean.getDm4()).append("\t")
						.append("Development-Maturation_zone-V:").append(nrmBean.getDm5()).append("\t")
						.append("Tissue-Elongation_zone_I-Epi.Exo.Scle.:").append(nrmBean.getTeep()).append("\t")
						.append("Tissue-Elongation_zone_I-Cortex:").append(nrmBean.getTec()).append("\t")
						.append("Tissue-Elongation_zone_I-End.Per.Ste.:").append(nrmBean.getTeen()).append("\t")
						.append("Tissue-Maturation_zone_V-Epi.Exo.Scle.:").append(nrmBean.getTmep()).append("\t")
						.append("Tissue-Maturation_zone_V-End.Per.Ste.:").append(nrmBean.getTmen());

				trw.writefile(nrmContext.toString(), true);
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
