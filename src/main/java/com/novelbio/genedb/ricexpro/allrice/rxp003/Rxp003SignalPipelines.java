package com.novelbio.genedb.ricexpro.allrice.rxp003;

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

@PipelineName("rxp003SignalPipelines")
public class Rxp003SignalPipelines implements Pipeline<EntireBean> {

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
				if (rawBean.getDat13() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("13-DAT:").append(rawBean.getDat13())
						.append("\t").append("20-DAT:").append(rawBean.getDat20()).append("\t").append("27-DAT:")
						.append(rawBean.getDat27()).append("\t").append("34-DAT:").append(rawBean.getDat34())
						.append("\t").append("41-DAT:").append(rawBean.getDat41()).append("\t").append("48-DAT:")
						.append(rawBean.getDat48()).append("\t").append("55-DAT:").append(rawBean.getDat55())
						.append("\t").append("62-DAT:").append(rawBean.getDat62()).append("\t").append("69-DAT:")
						.append(rawBean.getDat69()).append("\t").append("76-DAT:").append(rawBean.getDat76())
						.append("\t").append("83-DAT:").append(rawBean.getDat83()).append("\t").append("90-DAT:")
						.append(rawBean.getDat90()).append("\t").append("97-DAT:").append(rawBean.getDat97())
						.append("\t").append("104-DAT:").append(rawBean.getDat104()).append("\t").append("111-DAT:")
						.append(rawBean.getDat111()).append("\t").append("118-DAT:").append(rawBean.getDat118())
						.append("\t").append("125-DAT:").append(rawBean.getDat125());

				trw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getDat13() == null) {
					continue;
				}
				StringBuffer nrmContext = new StringBuffer();
				nrmContext.append(nrmBean.getRep()).append("\t").append("13-DAT:").append(nrmBean.getDat13())
						.append("\t").append("20-DAT:").append(nrmBean.getDat20()).append("\t").append("27-DAT:")
						.append(nrmBean.getDat27()).append("\t").append("34-DAT:").append(nrmBean.getDat34())
						.append("\t").append("41-DAT:").append(nrmBean.getDat41()).append("\t").append("48-DAT:")
						.append(nrmBean.getDat48()).append("\t").append("55-DAT:").append(nrmBean.getDat55())
						.append("\t").append("62-DAT:").append(nrmBean.getDat62()).append("\t").append("69-DAT:")
						.append(nrmBean.getDat69()).append("\t").append("76-DAT:").append(nrmBean.getDat76())
						.append("\t").append("83-DAT:").append(nrmBean.getDat83()).append("\t").append("90-DAT:")
						.append(nrmBean.getDat90()).append("\t").append("97-DAT:").append(nrmBean.getDat97())
						.append("\t").append("104-DAT:").append(nrmBean.getDat104()).append("\t").append("111-DAT:")
						.append(nrmBean.getDat111()).append("\t").append("118-DAT:").append(nrmBean.getDat118())
						.append("\t").append("125-DAT:").append(nrmBean.getDat125());
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
