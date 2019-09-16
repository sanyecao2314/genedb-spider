package com.novelbio.genedb.ricexpro.allrice.ggep;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.genedb.ricexpro.allrice.RiceResultPipelines;
import com.novelbio.genedb.ricexpro.allrice.Urls;
import com.sun.codemodel.internal.JType;
import com.sun.tools.internal.xjc.model.CPropertyInfo;
import com.sun.tools.internal.xjc.outline.ClassOutline;
import com.sun.tools.internal.xjc.outline.FieldAccessor;
import com.sun.tools.internal.xjc.outline.FieldOutline;

@PipelineName("geepSignalPipelines")
public class GeepSignalPipelines implements Pipeline<EntireBean> {

	public void process(EntireBean entireBean) {
		TxtReadandWrite tw = null;
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
			
			

			tw = new TxtReadandWrite(new FileOutputStream(path, true));
			tw.writefile(entireBean.getFeatureNum() + "Raw" + "\n", true);
			List<RawBean> rawBeans = entireBean.getRawBeans();

			for (RawBean rawBean : rawBeans) {
				if (rawBean.getLbV12() == null) {
					continue;
				}
				// 表格一
				StringBuffer rawContext = new StringBuffer();
				rawContext.append(rawBean.getRep()).append("\t").append("Leaf_blade-vegetative-12:00:")
						.append(rawBean.getLbV12()).append("\t").append("Leaf_blade-vegetative-00:00:")
						.append(rawBean.getLbV00()).append("\t").append("Leaf_blade-reproductive-12:00:")
						.append(rawBean.getLbRe12()).append("\t").append("Leaf_blade-reproductive-00:00:")
						.append(rawBean.getLbRe00()).append("\t").append("Leaf_blade-ripening-12:00:")
						.append(rawBean.getLbRi12()).append("\t").append("Leaf_blade-ripening-00:00:")
						.append(rawBean.getLbRi00()).append("\t").append("Leaf_sheath-vegetative-12:00:")
						.append(rawBean.getLsV12()).append("\t").append("Leaf_sheath-vegetative-00:00:")
						.append(rawBean.getLsV00()).append("\t").append("Leaf_sheath-reproductive-12:00:")
						.append(rawBean.getLsRe12()).append("\t").append("Leaf_sheath-reproductive-00:00:")
						.append(rawBean.getLsRe00()).append("\t").append("Root-vegetative-12:00:")
						.append(rawBean.getRootV12()).append("\t").append("Root-vegetative-00:00:")
						.append(rawBean.getRootV00()).append("\t").append("Root-reproductive-12:00:")
						.append(rawBean.getRootR12()).append("\t").append("Root-reproductive-00:00:")
						.append(rawBean.getRootR00()).append("\t").append("Stem-reproductive-12:00:")
						.append(rawBean.getStemRe12()).append("\t").append("Stem-reproductive-00:00:")
						.append(rawBean.getStemRe00()).append("\t").append("Stem-ripening-12:00:")
						.append(rawBean.getStemRi12()).append("\t").append("Stem-ripening-00:00:")
						.append(rawBean.getStemRi00()).append("\t").append("Inflorescence-0.6-1.0mm:")
						.append(rawBean.getIn06()).append("\t").append("Inflorescence-3.0-4.0mm:")
						.append(rawBean.getIn30()).append("\t").append("Inflorescence-5.0-10.0mm:")
						.append(rawBean.getIn50()).append("\t").append("Anther-0.3-0.6mm:").append(rawBean.getAn03())
						.append("\t").append("Anther-0.7-1.0mm:").append(rawBean.getAn07()).append("\t")
						.append("Anther-1.2-1.5mm:").append(rawBean.getAn12()).append("\t").append("Anther-1.6-2.0mm:")
						.append(rawBean.getAn16()).append("\t").append("Pistil-5-10cm*1:").append(rawBean.getPi5())
						.append("\t").append("Pistil-10-14cm*1:").append(rawBean.getPi10()).append("\t")
						.append("Pistil-14-18cm*1:").append(rawBean.getPi14()).append("\t")
						.append("Lemma, Palea-Lemma-1.5-2.0mm*2:").append(rawBean.getLpL15()).append("\t")
						.append("Lemma, Palea-Palea-1.5-2.0mm*2:").append(rawBean.getLpP15()).append("\t")
						.append("Lemma, Palea-Lemma-4.0-5.0mm*2:").append(rawBean.getLpL40()).append("\t")
						.append("Lemma, Palea-Palea-4.0-5.0mm*2:").append(rawBean.getLpP40()).append("\t")
						.append("Lemma, Palea-Lemma-7.0mm*2:").append(rawBean.getLpL70()).append("\t")
						.append("Lemma, Palea-Palea-7.0mm*2:").append(rawBean.getLp740()).append("\t")
						.append("Ovary-01_DAF:").append(rawBean.getOv01()).append("\t").append("Ovary-03_DAF:")
						.append(rawBean.getOv03()).append("\t").append("Ovary-05_DAF:").append(rawBean.getOv05())
						.append("\t").append("Ovary-07_DAF:").append(rawBean.getOv07()).append("\t")
						.append("Embryo-07_DAF:").append(rawBean.getEm07()).append("\t").append("Embryo-10_DAF:")
						.append(rawBean.getEm010()).append("\t").append("Embryo-14_DAF:").append(rawBean.getEm014())
						.append("\t").append("Embryo-28_DAF:").append(rawBean.getEm28()).append("\t")
						.append("Embryo-42_DAF:").append(rawBean.getEm42()).append("\t").append("Endosperm-07_DAF:")
						.append(rawBean.getEn07()).append("\t").append("Endosperm-10_DAF:").append(rawBean.getEn10())
						.append("\t").append("Endosperm-14_DAF:").append(rawBean.getEn14()).append("\t")
						.append("Endosperm-28_DAF:").append(rawBean.getEn28()).append("\t").append("Endosperm-42_DAF:")
						.append(rawBean.getEn42());

				tw.writefile(rawContext.append("\n").toString(), true);
			}

			// 表格二
			tw.writefile(entireBean.getFeatureNum() + "Normalized" + "\n", true);
			List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();

			for (NormalizedBean nrmBean : normalizedBeans) {
				if (nrmBean.getLbV12() == null) {
					continue;
				}
				// 表格一
				StringBuffer noContext = new StringBuffer();
				noContext.append(nrmBean.getRep()).append("\t").append("Leaf_blade-vegetative-12:00:")
						.append(nrmBean.getLbV12()).append("\t").append("Leaf_blade-vegetative-00:00:")
						.append(nrmBean.getLbV00()).append("\t").append("Leaf_blade-reproductive-12:00:")
						.append(nrmBean.getLbRe12()).append("\t").append("Leaf_blade-reproductive-00:00:")
						.append(nrmBean.getLbRe00()).append("\t").append("Leaf_blade-ripening-12:00:")
						.append(nrmBean.getLbRi12()).append("\t").append("Leaf_blade-ripening-00:00:")
						.append(nrmBean.getLbRi00()).append("\t").append("Leaf_sheath-vegetative-12:00:")
						.append(nrmBean.getLsV12()).append("\t").append("Leaf_sheath-vegetative-00:00:")
						.append(nrmBean.getLsV00()).append("\t").append("Leaf_sheath-reproductive-12:00:")
						.append(nrmBean.getLsRe12()).append("\t").append("Leaf_sheath-reproductive-00:00:")
						.append(nrmBean.getLsRe00()).append("\t").append("Root-vegetative-12:00:")
						.append(nrmBean.getRootV12()).append("\t").append("Root-vegetative-00:00:")
						.append(nrmBean.getRootV00()).append("\t").append("Root-reproductive-12:00:")
						.append(nrmBean.getRootR12()).append("\t").append("Root-reproductive-00:00:")
						.append(nrmBean.getRootR00()).append("\t").append("Stem-reproductive-12:00:")
						.append(nrmBean.getStemRe12()).append("\t").append("Stem-reproductive-00:00:")
						.append(nrmBean.getStemRe00()).append("\t").append("Stem-ripening-12:00:")
						.append(nrmBean.getStemRi12()).append("\t").append("Stem-ripening-00:00:")
						.append(nrmBean.getStemRi00()).append("\t").append("Inflorescence-0.6-1.0mm:")
						.append(nrmBean.getIn06()).append("\t").append("Inflorescence-3.0-4.0mm:")
						.append(nrmBean.getIn30()).append("\t").append("Inflorescence-5.0-10.0mm:")
						.append(nrmBean.getIn50()).append("\t").append("Anther-0.3-0.6mm:").append(nrmBean.getAn03())
						.append("\t").append("Anther-0.7-1.0mm:").append(nrmBean.getAn07()).append("\t")
						.append("Anther-1.2-1.5mm:").append(nrmBean.getAn12()).append("\t").append("Anther-1.6-2.0mm:")
						.append(nrmBean.getAn16()).append("\t").append("Pistil-5-10cm*1:").append(nrmBean.getPi5())
						.append("\t").append("Pistil-10-14cm*1:").append(nrmBean.getPi10()).append("\t")
						.append("Pistil-14-18cm*1:").append(nrmBean.getPi14()).append("\t")
						.append("Lemma, Palea-Lemma-1.5-2.0mm*2:").append(nrmBean.getLpL15()).append("\t")
						.append("Lemma, Palea-Palea-1.5-2.0mm*2:").append(nrmBean.getLpP15()).append("\t")
						.append("Lemma, Palea-Lemma-4.0-5.0mm*2:").append(nrmBean.getLpL40()).append("\t")
						.append("Lemma, Palea-Palea-4.0-5.0mm*2:").append(nrmBean.getLpP40()).append("\t")
						.append("Lemma, Palea-Lemma-7.0mm*2:").append(nrmBean.getLpL70()).append("\t")
						.append("Lemma, Palea-Palea-7.0mm*2:").append(nrmBean.getLp740()).append("\t")
						.append("Ovary-01_DAF:").append(nrmBean.getOv01()).append("\t").append("Ovary-03_DAF:")
						.append(nrmBean.getOv03()).append("\t").append("Ovary-05_DAF:").append(nrmBean.getOv05())
						.append("\t").append("Ovary-07_DAF:").append(nrmBean.getOv07()).append("\t")
						.append("Embryo-07_DAF:").append(nrmBean.getEm07()).append("\t").append("Embryo-10_DAF:")
						.append(nrmBean.getEm010()).append("\t").append("Embryo-14_DAF:").append(nrmBean.getEm014())
						.append("\t").append("Embryo-28_DAF:").append(nrmBean.getEm28()).append("\t")
						.append("Embryo-42_DAF:").append(nrmBean.getEm42()).append("\t").append("Endosperm-07_DAF:")
						.append(nrmBean.getEn07()).append("\t").append("Endosperm-10_DAF:").append(nrmBean.getEn10())
						.append("\t").append("Endosperm-14_DAF:").append(nrmBean.getEn14()).append("\t")
						.append("Endosperm-28_DAF:").append(nrmBean.getEn28()).append("\t").append("Endosperm-42_DAF:")
						.append(nrmBean.getEn42());

				tw.writefile(noContext.append("\n").toString(), true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			if (tw != null)
				tw.close();
			if(succTrw != null)
				succTrw.close();
		}
	}

}
