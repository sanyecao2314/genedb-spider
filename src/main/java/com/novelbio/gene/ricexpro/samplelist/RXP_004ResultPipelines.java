package com.novelbio.gene.ricexpro.samplelist;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_004ResultPipelines")
public class RXP_004ResultPipelines implements Pipeline<RXP_004BeanList>{
	
	@Override
	public void process(RXP_004BeanList rxp_004BeanList) {
		String title = "No.	DATA SET ID	SAMPLE ID	SAMPLING DETAILS	GROWTH STAGE	PHASE	TIME	cRNA QTY	GRC#	Slide ID	Position ID	Structure Development Stage	Anatomical Entity";
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_004.csv");
		for (RXP_004Bean RXPBean : rxp_004BeanList.getRxp_004Beans()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSample_id() 
			+ "\t" + RXPBean.getSampling_details() + "\t" + RXPBean.getGrowth_stage() + "\t" + RXPBean.getPhase() 
			+ "\t" + RXPBean.getTime() + "\t" + RXPBean.getcRNA_QTY() + "\t" + RXPBean.getGrc() + "\t" + RXPBean.getSlideID() 
			+ "\t" + RXPBean.getPositionID() + "\t" + RXPBean.getStructureDevelopment() + "\t" + RXPBean.getAnatomicalEntity();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_004.csv");
		}
	}

}
