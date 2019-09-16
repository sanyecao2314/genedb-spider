package com.novelbio.gene.ricexpro.samplelist;

import java.io.File;
import java.io.FileOutputStream;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_0012ResultPipelines")
public class RXP_0012ResultPipelines implements Pipeline<RXP_0012BeanList> {

	@Override
	public void process(RXP_0012BeanList rxp_0012BeanList) {
		TxtReadandWrite trw = null;
		try {
			String title = "No	DATA SET ID	SAMPLE ID	SAMPLING DETAILS	cRNA QTY	GRC#	Structure Development Stage	Anatomical Entity";
			String path = "/home/novelbio/桌面/RXP_0012.csv";
			trw = new TxtReadandWrite(new FileOutputStream(new File(path), true));
			trw.writefile(title + "\n");
			for (RXP_0012Bean RXPBean : rxp_0012BeanList.getRxp_0012Beans()) {
				String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSample_id() + "\t"
						+ RXPBean.getSampling_details() + "\t" + RXPBean.getcRNA_QTY() + "\t" + RXPBean.getGrc() + "\t"
						+ RXPBean.getStructureDevelopment() + "\t" + RXPBean.getAnatomicalEntity();
				trw.writefile(result, true);
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
