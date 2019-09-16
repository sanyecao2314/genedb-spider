package com.novelbio.gene.ricexpro.samplelist.part4;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.RXPBean;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_4001ResultPipelines")
public class RXP_4001ResultPipelines implements Pipeline<RXP_4001BeanList>{
	
	@Override
	public void process(RXP_4001BeanList rxp_4001BeanList) {
		String title = "NO	DATA SET ID	SUB DATASET	SAMPLE ID	SAMPLING DETAILS	GRC#	Structure Development Stage	Anatomical Entity";
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_4001.csv");
		for (RXP_4001Bean RXPBean : rxp_4001BeanList.getRxp_4001Beans()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSub_dataset()
			+"\t" +RXPBean.getSample_id() + "\t" + RXPBean.getSampling_details() + "\t" + RXPBean.getGrc() 
			+ "\t" +  RXPBean.getStructureDevelopment() + "\t" + RXPBean.getAnatomicalEntity();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_4001.csv");
		}
	}
	
	

}
