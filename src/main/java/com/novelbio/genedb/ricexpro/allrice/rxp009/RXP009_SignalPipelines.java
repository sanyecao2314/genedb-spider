package com.novelbio.genedb.ricexpro.allrice.rxp009;

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

@PipelineName("rXP009_SignalPipelines")
public class RXP009_SignalPipelines implements Pipeline<EntireBean> {

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
				if (rawBean.getDat1510() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("15DAT-10:").append(rawBean.getDat1510())
						.append("\t").append("15DAT-12:").append(rawBean.getDat1512()).append("\t").append("15DAT-14:")
						.append(rawBean.getDat1514()).append("\t").append("15DAT-16:").append(rawBean.getDat1516())
						.append("\t").append("15DAT-18:").append(rawBean.getDat1518()).append("\t").append("15DAT-20:")
						.append(rawBean.getDat1520()).append("\t").append("15DAT-22:").append(rawBean.getDat1522())
						.append("\t").append("16DAT-00:").append(rawBean.getDat1600()).append("\t").append("16DAT-02:")
						.append(rawBean.getDat1602()).append("\t").append("16DAT-04:").append(rawBean.getDat1604())
						.append("\t").append("16DAT-06:").append(rawBean.getDat1606()).append("\t").append("16DAT-08:")
						.append(rawBean.getDat1608()).append("\t").append("16DAT-10:").append(rawBean.getDat1610())
						.append("\t").append("16DAT-12:").append(rawBean.getDat1612()).append("\t").append("16DAT-14:")
						.append(rawBean.getDat1614()).append("\t").append("16DAT-16:").append(rawBean.getDat1616())
						.append("\t").append("16DAT-18:").append(rawBean.getDat1618()).append("\t").append("16DAT-20:")
						.append(rawBean.getDat1620()).append("\t").append("16DAT-22:").append(rawBean.getDat1622())
						.append("\t").append("17DAT-00:").append(rawBean.getDat1700()).append("\t").append("17DAT-02:")
						.append(rawBean.getDat1702()).append("\t").append("17DAT-04:").append(rawBean.getDat1704())
						.append("\t").append("17DAT-06:").append(rawBean.getDat1706()).append("\t").append("17DAT-08:")
						.append(rawBean.getDat17078()).append("\t").append("17DAT-10:").append(rawBean.getDat1710())
						.append("\t").append("43DAT-10:").append(rawBean.getDat4310()).append("\t").append("43DAT-12:")
						.append(rawBean.getDat4312()).append("\t").append("43DAT-14:").append(rawBean.getDat4314())
						.append("\t").append("43DAT-16:").append(rawBean.getDat4316()).append("\t").append("43DAT-18:")
						.append(rawBean.getDat4318()).append("\t").append("43DAT-20:").append(rawBean.getDat4320())
						.append("\t").append("43DAT-22:").append(rawBean.getDat4322()).append("\t").append("44DAT-00:")
						.append(rawBean.getDat4400()).append("\t").append("44DAT-02:").append(rawBean.getDat4402())
						.append("\t").append("44DAT-04:").append(rawBean.getDat4404()).append("\t").append("44DAT-06:")
						.append(rawBean.getDat4406()).append("\t").append("44DAT-08:").append(rawBean.getDat4408())
						.append("\t").append("44DAT-10:").append(rawBean.getDat4410()).append("\t").append("44DAT-12:")
						.append(rawBean.getDat4412()).append("\t").append("44DAT-14:").append(rawBean.getDat4414())
						.append("\t").append("44DAT-16:").append(rawBean.getDat4416()).append("\t").append("44DAT-18:")
						.append(rawBean.getDat4418()).append("\t").append("44DAT-20:").append(rawBean.getDat4420())
						.append("\t").append("44DAT-22:").append(rawBean.getDat4422()).append("\t").append("45DAT-00:")
						.append(rawBean.getDat4500()).append("\t").append("45DAT-02:").append(rawBean.getDat4502())
						.append("\t").append("45DAT-04:").append(rawBean.getDat4504()).append("\t").append("45DAT-06:")
						.append(rawBean.getDat4506()).append("\t").append("45DAT-08:").append(rawBean.getDat4508())
						.append("\t").append("45DAT-10:").append(rawBean.getDat4510());

				trw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getDat1510() == null) {
					continue;
				}
				// 表格二
				StringBuffer nrmContext = new StringBuffer();
				nrmContext.append(nrmBean.getRep()).append("\t").append("15DAT-10:").append(nrmBean.getDat1510())
						.append("\t").append("15DAT-12:").append(nrmBean.getDat1512()).append("\t").append("15DAT-14:")
						.append(nrmBean.getDat1514()).append("\t").append("15DAT-16:").append(nrmBean.getDat1516())
						.append("\t").append("15DAT-18:").append(nrmBean.getDat1518()).append("\t").append("15DAT-20:")
						.append(nrmBean.getDat1520()).append("\t").append("15DAT-22:").append(nrmBean.getDat1522())
						.append("\t").append("16DAT-00:").append(nrmBean.getDat1600()).append("\t").append("16DAT-02:")
						.append(nrmBean.getDat1602()).append("\t").append("16DAT-04:").append(nrmBean.getDat1604())
						.append("\t").append("16DAT-06:").append(nrmBean.getDat1606()).append("\t").append("16DAT-08:")
						.append(nrmBean.getDat1608()).append("\t").append("16DAT-10:").append(nrmBean.getDat1610())
						.append("\t").append("16DAT-12:").append(nrmBean.getDat1612()).append("\t").append("16DAT-14:")
						.append(nrmBean.getDat1614()).append("\t").append("16DAT-16:").append(nrmBean.getDat1616())
						.append("\t").append("16DAT-18:").append(nrmBean.getDat1618()).append("\t").append("16DAT-20:")
						.append(nrmBean.getDat1620()).append("\t").append("16DAT-22:").append(nrmBean.getDat1622())
						.append("\t").append("17DAT-00:").append(nrmBean.getDat1700()).append("\t").append("17DAT-02:")
						.append(nrmBean.getDat1702()).append("\t").append("17DAT-04:").append(nrmBean.getDat1704())
						.append("\t").append("17DAT-06:").append(nrmBean.getDat1706()).append("\t").append("17DAT-08:")
						.append(nrmBean.getDat17078()).append("\t").append("17DAT-10:").append(nrmBean.getDat1710())
						.append("\t").append("43DAT-10:").append(nrmBean.getDat4310()).append("\t").append("43DAT-12:")
						.append(nrmBean.getDat4312()).append("\t").append("43DAT-14:").append(nrmBean.getDat4314())
						.append("\t").append("43DAT-16:").append(nrmBean.getDat4316()).append("\t").append("43DAT-18:")
						.append(nrmBean.getDat4318()).append("\t").append("43DAT-20:").append(nrmBean.getDat4320())
						.append("\t").append("43DAT-22:").append(nrmBean.getDat4322()).append("\t").append("44DAT-00:")
						.append(nrmBean.getDat4400()).append("\t").append("44DAT-02:").append(nrmBean.getDat4402())
						.append("\t").append("44DAT-04:").append(nrmBean.getDat4404()).append("\t").append("44DAT-06:")
						.append(nrmBean.getDat4406()).append("\t").append("44DAT-08:").append(nrmBean.getDat4408())
						.append("\t").append("44DAT-10:").append(nrmBean.getDat4410()).append("\t").append("44DAT-12:")
						.append(nrmBean.getDat4412()).append("\t").append("44DAT-14:").append(nrmBean.getDat4414())
						.append("\t").append("44DAT-16:").append(nrmBean.getDat4416()).append("\t").append("44DAT-18:")
						.append(nrmBean.getDat4418()).append("\t").append("44DAT-20:").append(nrmBean.getDat4420())
						.append("\t").append("44DAT-22:").append(nrmBean.getDat4422()).append("\t").append("45DAT-00:")
						.append(nrmBean.getDat4500()).append("\t").append("45DAT-02:").append(nrmBean.getDat4502())
						.append("\t").append("45DAT-04:").append(nrmBean.getDat4504()).append("\t").append("45DAT-06:")
						.append(nrmBean.getDat4506()).append("\t").append("45DAT-08:").append(nrmBean.getDat4508())
						.append("\t").append("45DAT-10:").append(nrmBean.getDat4510());

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
