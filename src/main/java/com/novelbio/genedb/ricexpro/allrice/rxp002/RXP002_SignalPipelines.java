package com.novelbio.genedb.ricexpro.allrice.rxp002;

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

@PipelineName("rXP002_SignalPipelines")
public class RXP002_SignalPipelines implements Pipeline<EntireBean> {

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
				if (rawBean.getV110() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("Vegetative1-10:").append(rawBean.getV110())
						.append("\t").append("Vegetative1-12:").append(rawBean.getV112()).append("\t")
						.append("Vegetative1-14:").append(rawBean.getV114()).append("\t").append("Vegetative1-16:")
						.append(rawBean.getV116()).append("\t").append("Vegetative1-18:").append(rawBean.getV118())
						.append("\t").append("Vegetative1-20:").append(rawBean.getV120()).append("\t")
						.append("Vegetative1-22:").append(rawBean.getV122()).append("\t").append("Vegetative1-00:")
						.append(rawBean.getV100()).append("\t").append("Vegetative1-02:").append(rawBean.getV102())
						.append("\t").append("Vegetative1-04:").append(rawBean.getV104()).append("\t")
						.append("Vegetative1-06:").append(rawBean.getV106()).append("\t").append("Vegetative1-08:")
						.append(rawBean.getV108()).append("\t" +

								"Vegetative2-10:")
						.append(rawBean.getV210()).append("\t").append("Vegetative2-12:").append(rawBean.getV212())
						.append("\t").append("Vegetative2-14:").append(rawBean.getV214()).append("\t")
						.append("Vegetative2-16:").append(rawBean.getV216()).append("\t").append("Vegetative2-18:")
						.append(rawBean.getV218()).append("\t").append("Vegetative2-20:").append(rawBean.getV220())
						.append("\t").append("Vegetative2-22:").append(rawBean.getV222()).append("\t")
						.append("Vegetative2-00:").append(rawBean.getV200()).append("\t").append("Vegetative2-02:")
						.append(rawBean.getV202()).append("\t").append("Vegetative2-04:").append(rawBean.getV204())
						.append("\t").append("Vegetative2-06:").append(rawBean.getV206()).append("\t")
						.append("Vegetative2-08:").append(rawBean.getV208()).append("\t" +

								"Vegetative3-10:")
						.append(rawBean.getV310()).append("\t").append("Vegetative3-12:").append(rawBean.getV312())
						.append("\t").append("Vegetative3-14:").append(rawBean.getV314()).append("\t")
						.append("Vegetative3-16:").append(rawBean.getV316()).append("\t").append("Vegetative3-18:")
						.append(rawBean.getV318()).append("\t").append("Vegetative3-20:").append(rawBean.getV320())
						.append("\t").append("Vegetative3-22:").append(rawBean.getV322()).append("\t")
						.append("Vegetative3-00:").append(rawBean.getV300()).append("\t").append("Vegetative3-02:")
						.append(rawBean.getV302()).append("\t").append("Vegetative3-04:").append(rawBean.getV304())
						.append("\t").append("Vegetative3-06:").append(rawBean.getV306()).append("\t")
						.append("Vegetative3-08:").append(rawBean.getV308()).append("\t" +

								"Vegetative_Reproductive-10:")
						.append(rawBean.getV310()).append("\t").append("Vegetative_Reproductive-12:")
						.append(rawBean.getV312()).append("\t").append("Vegetative_Reproductive-14:")
						.append(rawBean.getV314()).append("\t").append("Vegetative_Reproductive-16:")
						.append(rawBean.getV316()).append("\t").append("Vegetative_Reproductive-18:")
						.append(rawBean.getV318()).append("\t").append("Vegetative_Reproductive-20:")
						.append(rawBean.getV320()).append("\t").append("Vegetative_Reproductive-22:")
						.append(rawBean.getV322()).append("\t").append("Vegetative_Reproductive-00:")
						.append(rawBean.getV300()).append("\t").append("Vegetative_Reproductive-02:")
						.append(rawBean.getV302()).append("\t").append("Vegetative_Reproductive-04:")
						.append(rawBean.getV304()).append("\t").append("Vegetative_Reproductive-06:")
						.append(rawBean.getV306()).append("\t").append("Vegetative_Reproductive-08:")
						.append(rawBean.getV308()).append("\t" +

								"Reproductive1-10:")
						.append(rawBean.getR110()).append("\t").append("Reproductive1-12:").append(rawBean.getR112())
						.append("\t").append("Reproductive1-14:").append(rawBean.getR114()).append("\t")
						.append("Reproductive1-16:").append(rawBean.getR116()).append("\t").append("Reproductive1-18:")
						.append(rawBean.getR118()).append("\t").append("Reproductive1-20:").append(rawBean.getR120())
						.append("\t").append("Reproductive1-22:").append(rawBean.getR122()).append("\t")
						.append("Reproductive1-00:").append(rawBean.getR100()).append("\t").append("Reproductive1-02:")
						.append(rawBean.getR102()).append("\t").append("Reproductive1-04:").append(rawBean.getR104())
						.append("\t").append("Reproductive1-06:").append(rawBean.getR106()).append("\t")
						.append("Reproductive1-08:").append(rawBean.getR108()).append("\t" +

								"Reproductive_Ripening-10:")
						.append(rawBean.getRr10()).append("\t").append("Reproductive_Ripening-12:")
						.append(rawBean.getRr12()).append("\t").append("Reproductive_Ripening-14:")
						.append(rawBean.getRr14()).append("\t").append("Reproductive_Ripening-16:")
						.append(rawBean.getRr16()).append("\t").append("Reproductive_Ripening-18:")
						.append(rawBean.getRr18()).append("\t").append("Reproductive_Ripening-20:")
						.append(rawBean.getRr20()).append("\t").append("Reproductive_Ripening-22:")
						.append(rawBean.getRr22()).append("\t").append("Reproductive_Ripening-00:")
						.append(rawBean.getRr00()).append("\t").append("Reproductive_Ripening-02:")
						.append(rawBean.getRr02()).append("\t").append("Reproductive_Ripening-04:")
						.append(rawBean.getRr04()).append("\t").append("Reproductive_Ripening-06:")
						.append(rawBean.getRr06()).append("\t").append("Reproductive_Ripening-08:")
						.append(rawBean.getRr08()).append("\t" +

								"Ripening1-10:")
						.append(rawBean.getRi10()).append("\t").append("Ripening1-12:").append(rawBean.getRi12())
						.append("\t").append("Ripening1-14:").append(rawBean.getRi14()).append("\t")
						.append("Ripening1-16:").append(rawBean.getRi16()).append("\t").append("Ripening1-18:")
						.append(rawBean.getRi18()).append("\t").append("Ripening1-20:").append(rawBean.getRi20())
						.append("\t").append("Ripening1-22:").append(rawBean.getRi22()).append("\t")
						.append("Ripening1-00:").append(rawBean.getRi00()).append("\t").append("Ripening1-02:")
						.append(rawBean.getRi02()).append("\t").append("Ripening1-04:").append(rawBean.getRi04())
						.append("\t").append("Ripening1-06:").append(rawBean.getRi06()).append("\t")
						.append("Ripening1-08:").append(rawBean.getRi08()).append("\t" +

								"Ripening2-10:")
						.append(rawBean.getRi110()).append("\t").append("Ripening2-12:").append(rawBean.getRi112())
						.append("\t").append("Ripening2-14:").append(rawBean.getRi114()).append("\t")
						.append("Ripening2-16:").append(rawBean.getRi116()).append("\t").append("Ripening2-18:")
						.append(rawBean.getRi118()).append("\t").append("Ripening2-20:").append(rawBean.getRi120())
						.append("\t").append("Ripening2-22:").append(rawBean.getRi122()).append("\t")
						.append("Ripening2-00:").append(rawBean.getRi100()).append("\t").append("Ripening2-02:")
						.append(rawBean.getRi102()).append("\t").append("Ripening2-04:").append(rawBean.getRi104())
						.append("\t").append("Ripening2-06:").append(rawBean.getRi106()).append("\t")
						.append("Ripening2-08:").append(rawBean.getRi108());

				trw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			trw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getV110() == null) {
					continue;
				}
				// 表格二
				StringBuffer noContext = new StringBuffer();
				noContext.append(nrmBean.getRep()).append("\t").append("Vegetative1-10:").append(nrmBean.getV110())
						.append("\t").append("Vegetative1-12:").append(nrmBean.getV112()).append("\t")
						.append("Vegetative1-14:").append(nrmBean.getV114()).append("\t").append("Vegetative1-16:")
						.append(nrmBean.getV116()).append("\t").append("Vegetative1-18:").append(nrmBean.getV118())
						.append("\t").append("Vegetative1-20:").append(nrmBean.getV120()).append("\t")
						.append("Vegetative1-22:").append(nrmBean.getV122()).append("\t").append("Vegetative1-00:")
						.append(nrmBean.getV100()).append("\t").append("Vegetative1-02:").append(nrmBean.getV102())
						.append("\t").append("Vegetative1-04:").append(nrmBean.getV104()).append("\t")
						.append("Vegetative1-06:").append(nrmBean.getV106()).append("\t").append("Vegetative1-08:")
						.append(nrmBean.getV108()).append("\t" +

								"Vegetative2-10:")
						.append(nrmBean.getV210()).append("\t").append("Vegetative2-12:").append(nrmBean.getV212())
						.append("\t").append("Vegetative2-14:").append(nrmBean.getV214()).append("\t")
						.append("Vegetative2-16:").append(nrmBean.getV216()).append("\t").append("Vegetative2-18:")
						.append(nrmBean.getV218()).append("\t").append("Vegetative2-20:").append(nrmBean.getV220())
						.append("\t").append("Vegetative2-22:").append(nrmBean.getV222()).append("\t")
						.append("Vegetative2-00:").append(nrmBean.getV200()).append("\t").append("Vegetative2-02:")
						.append(nrmBean.getV202()).append("\t").append("Vegetative2-04:").append(nrmBean.getV204())
						.append("\t").append("Vegetative2-06:").append(nrmBean.getV206()).append("\t")
						.append("Vegetative2-08:").append(nrmBean.getV208()).append("\t" +

								"Vegetative3-10:")
						.append(nrmBean.getV310()).append("\t").append("Vegetative3-12:").append(nrmBean.getV312())
						.append("\t").append("Vegetative3-14:").append(nrmBean.getV314()).append("\t")
						.append("Vegetative3-16:").append(nrmBean.getV316()).append("\t").append("Vegetative3-18:")
						.append(nrmBean.getV318()).append("\t").append("Vegetative3-20:").append(nrmBean.getV320())
						.append("\t").append("Vegetative3-22:").append(nrmBean.getV322()).append("\t")
						.append("Vegetative3-00:").append(nrmBean.getV300()).append("\t").append("Vegetative3-02:")
						.append(nrmBean.getV302()).append("\t").append("Vegetative3-04:").append(nrmBean.getV304())
						.append("\t").append("Vegetative3-06:").append(nrmBean.getV306()).append("\t")
						.append("Vegetative3-08:").append(nrmBean.getV308()).append("\t" +

								"Vegetative_Reproductive-10:")
						.append(nrmBean.getV310()).append("\t").append("Vegetative_Reproductive-12:")
						.append(nrmBean.getV312()).append("\t").append("Vegetative_Reproductive-14:")
						.append(nrmBean.getV314()).append("\t").append("Vegetative_Reproductive-16:")
						.append(nrmBean.getV316()).append("\t").append("Vegetative_Reproductive-18:")
						.append(nrmBean.getV318()).append("\t").append("Vegetative_Reproductive-20:")
						.append(nrmBean.getV320()).append("\t").append("Vegetative_Reproductive-22:")
						.append(nrmBean.getV322()).append("\t").append("Vegetative_Reproductive-00:")
						.append(nrmBean.getV300()).append("\t").append("Vegetative_Reproductive-02:")
						.append(nrmBean.getV302()).append("\t").append("Vegetative_Reproductive-04:")
						.append(nrmBean.getV304()).append("\t").append("Vegetative_Reproductive-06:")
						.append(nrmBean.getV306()).append("\t").append("Vegetative_Reproductive-08:")
						.append(nrmBean.getV308()).append("\t" +

								"Reproductive1-10:")
						.append(nrmBean.getR110()).append("\t").append("Reproductive1-12:").append(nrmBean.getR112())
						.append("\t").append("Reproductive1-14:").append(nrmBean.getR114()).append("\t")
						.append("Reproductive1-16:").append(nrmBean.getR116()).append("\t").append("Reproductive1-18:")
						.append(nrmBean.getR118()).append("\t").append("Reproductive1-20:").append(nrmBean.getR120())
						.append("\t").append("Reproductive1-22:").append(nrmBean.getR122()).append("\t")
						.append("Reproductive1-00:").append(nrmBean.getR100()).append("\t").append("Reproductive1-02:")
						.append(nrmBean.getR102()).append("\t").append("Reproductive1-04:").append(nrmBean.getR104())
						.append("\t").append("Reproductive1-06:").append(nrmBean.getR106()).append("\t")
						.append("Reproductive1-08:").append(nrmBean.getR108()).append("\t" +

								"Reproductive_Ripening-10:")
						.append(nrmBean.getRr10()).append("\t").append("Reproductive_Ripening-12:")
						.append(nrmBean.getRr12()).append("\t").append("Reproductive_Ripening-14:")
						.append(nrmBean.getRr14()).append("\t").append("Reproductive_Ripening-16:")
						.append(nrmBean.getRr16()).append("\t").append("Reproductive_Ripening-18:")
						.append(nrmBean.getRr18()).append("\t").append("Reproductive_Ripening-20:")
						.append(nrmBean.getRr20()).append("\t").append("Reproductive_Ripening-22:")
						.append(nrmBean.getRr22()).append("\t").append("Reproductive_Ripening-00:")
						.append(nrmBean.getRr00()).append("\t").append("Reproductive_Ripening-02:")
						.append(nrmBean.getRr02()).append("\t").append("Reproductive_Ripening-04:")
						.append(nrmBean.getRr04()).append("\t").append("Reproductive_Ripening-06:")
						.append(nrmBean.getRr06()).append("\t").append("Reproductive_Ripening-08:")
						.append(nrmBean.getRr08()).append("\t" +

								"Ripening1-10:")
						.append(nrmBean.getRi10()).append("\t").append("Ripening1-12:").append(nrmBean.getRi12())
						.append("\t").append("Ripening1-14:").append(nrmBean.getRi14()).append("\t")
						.append("Ripening1-16:").append(nrmBean.getRi16()).append("\t").append("Ripening1-18:")
						.append(nrmBean.getRi18()).append("\t").append("Ripening1-20:").append(nrmBean.getRi20())
						.append("\t").append("Ripening1-22:").append(nrmBean.getRi22()).append("\t")
						.append("Ripening1-00:").append(nrmBean.getRi00()).append("\t").append("Ripening1-02:")
						.append(nrmBean.getRi02()).append("\t").append("Ripening1-04:").append(nrmBean.getRi04())
						.append("\t").append("Ripening1-06:").append(nrmBean.getRi06()).append("\t")
						.append("Ripening1-08:").append(nrmBean.getRi08()).append("\t" +

								"Ripening2-10:")
						.append(nrmBean.getRi110()).append("\t").append("Ripening2-12:").append(nrmBean.getRi112())
						.append("\t").append("Ripening2-14:").append(nrmBean.getRi114()).append("\t")
						.append("Ripening2-16:").append(nrmBean.getRi116()).append("\t").append("Ripening2-18:")
						.append(nrmBean.getRi118()).append("\t").append("Ripening2-20:").append(nrmBean.getRi120())
						.append("\t").append("Ripening2-22:").append(nrmBean.getRi122()).append("\t")
						.append("Ripening2-00:").append(nrmBean.getRi100()).append("\t").append("Ripening2-02:")
						.append(nrmBean.getRi102()).append("\t").append("Ripening2-04:").append(nrmBean.getRi104())
						.append("\t" + "Ripening2-06:").append(nrmBean.getRi106()).append("\t").append("Ripening2-08:")
						.append(nrmBean.getRi108());
				trw.writefile(noContext.append("\n").toString(), true);
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
