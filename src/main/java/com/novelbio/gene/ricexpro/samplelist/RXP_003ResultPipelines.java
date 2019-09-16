package com.novelbio.gene.ricexpro.samplelist;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_003ResultPipelines")
public class RXP_003ResultPipelines implements Pipeline<RXP_003BeanList>{
	
	@Override
	public void process(RXP_003BeanList rxp_003BeanList) {
		String title = "No.	DATA SET ID	SAMPLE ID	SAMPLING DETAILS	GROWTH STAGE	PHASE	TIME	CULTIVER	cRNA QTY	GRC#	Structure Development Stage	Anatomical Entity";
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_003.csv");
		for (RXP_003Bean RXPBean : rxp_003BeanList.getRxp_003Beans()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSample_id() 
			+ "\t" + RXPBean.getSampling_details() + "\t" + RXPBean.getGrowth_stage() + "\t" + RXPBean.getPhase() 
			+ "\t" + RXPBean.getTime() + "\t" + RXPBean.getCultiver() +"\t" + RXPBean.getcRNA_QTY() + "\t" + RXPBean.getGrc() 
			+ "\t" + RXPBean.getStructureDevelopment() + "\t" + RXPBean.getAnatomicalEntity();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_003.csv");
		}
	}

}
