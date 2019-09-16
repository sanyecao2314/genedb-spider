package com.novelbio.gene.ricexpro.samplelist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_0011ResultPipelines")
public class RXP_0011ResultPipelines implements Pipeline<RXP_0011BeanList> {

	@Override
	public void process(RXP_0011BeanList rxp_0011BeanList) {
		TxtReadandWrite trw = null;
		try {
			String title = "No	DATA SET ID	SAMPLE ID	SAMPLING DETAILS	cRNA QTY	GRC#	Structure Development Stage	Anatomical Entity";
			String path = "/home/novelbio/桌面/RXP_0011.csv";

			trw = new TxtReadandWrite(new FileOutputStream(new File(path), true));
			trw.writefile(title + "\n");

			for (RXP_0011Bean RXPBean : rxp_0011BeanList.getRxp_0011Beans()) {
				StringBuffer result = new StringBuffer();
				result.append(RXPBean.getNo()).append("\t").append(RXPBean.getData_set_id()).append("\t")
						.append(RXPBean.getSample_id()).append("\t").append(RXPBean.getSampling_details()).append("\t")
						.append(RXPBean.getcRNA_QTY()).append("\t").append(RXPBean.getGrc()).append("\t")
						.append(RXPBean.getStructureDevelopment()).append("\t").append(RXPBean.getAnatomicalEntity());
				trw.writefile(result.append("\n").toString(), true);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (trw != null) {
				trw.close();
			}
		}
	}

}
