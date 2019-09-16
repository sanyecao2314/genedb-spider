package com.novelbio.gene.ricexpro.samplelist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.rmi.CORBA.Tie;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.RXPBean;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_0010ResultPipelines")
public class RXP_0010ResultPipelines implements Pipeline<RXP_0010BeanList> {

	@Override
	public void process(RXP_0010BeanList rxp_0010BeanList) {
		TxtReadandWrite trw = null;
		try {
			String title = "No.	DATA SET ID	SAMPLE ID	SAMPLING DETAILS	cRNA QTY	GRC#	Structure Development Stage	Anatomical Entity";
			String path = "/home/novelbio/桌面/" + rxp_0010BeanList.getRxp_0010Beans().get(0).getData_set_id() + ".csv";

			trw = new TxtReadandWrite(new FileOutputStream(new File(path), true));
			trw.writefile(title + "\n");

			for (RXP_0010Bean RXPBean : rxp_0010BeanList.getRxp_0010Beans()) {
				StringBuffer result = new StringBuffer();
				result.append(RXPBean.getNo()).append("\t").append(RXPBean.getData_set_id()).append("\t")
						.append(RXPBean.getSample_id()).append("\t").append(RXPBean.getSampling_details()).append("\t")
						.append(RXPBean.getcRNA_QTY()).append("\t").append(RXPBean.getGrc())
						.append("\t").append(RXPBean.getStructureDevelopment()).append("\t")
						.append(RXPBean.getAnatomicalEntity());
				trw.writefile(result.append("\n").toString(), true);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (trw != null) {
				trw.close();
			}
		}
	}

}
