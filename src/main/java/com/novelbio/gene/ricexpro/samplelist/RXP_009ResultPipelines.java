package com.novelbio.gene.ricexpro.samplelist;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_009ResultPipelines")
public class RXP_009ResultPipelines implements Pipeline<RXP_009BeanList>{
	
	@Override
	public void process(RXP_009BeanList rxp_009BeanList) {
		String title = "No.	DATA SET ID	SAMPLE ID	SAMPLING DETAILS	GROWTH STAGE	PHASE	TIME	cRNA QTY	GRC#	Structure Development Stage	Anatomical Entity";
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_009.csv");
		for (RXP_009Bean RXPBean : rxp_009BeanList.getRxp_009Beans()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSample_id() 
			+ "\t" + RXPBean.getSampling_details() + "\t" + RXPBean.getGrowth_stage() + "\t" + RXPBean.getPhase() 
			+ "\t" + RXPBean.getTime() + "\t" + RXPBean.getcRNA_QTY() + "\t" + RXPBean.getGrc() 
			+ "\t" + RXPBean.getStructureDevelopment() + "\t" + RXPBean.getAnatomicalEntity();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_009.csv");
		}
	}

}
