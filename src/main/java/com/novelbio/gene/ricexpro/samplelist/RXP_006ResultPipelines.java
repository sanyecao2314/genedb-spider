package com.novelbio.gene.ricexpro.samplelist;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_006ResultPipelines")
public class RXP_006ResultPipelines implements Pipeline<RXP_006BeanList>{
	
	@Override
	public void process(RXP_006BeanList rxp_006BeanList) {
		String title = "No.	DATA SET ID	SAMPLE ID	SAMPLING DETAILS	GROWTH STAGE	PHASE	TIME	cRNA QTY	GRC#	Structure Development Stage	Anatomical Entity";
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_006.csv");
		for (RXP_006Bean RXPBean : rxp_006BeanList.getRxp_006Beans()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSample_id() 
			+ "\t" + RXPBean.getSampling_details() + "\t" + RXPBean.getGrowth_stage() + "\t" + RXPBean.getPhase() 
			+ "\t" + RXPBean.getTime() + "\t" + RXPBean.getcRNA_QTY() + "\t" + RXPBean.getGrc() 
			+ "\t" + RXPBean.getStructureDevelopment() + "\t" + RXPBean.getAnatomicalEntity();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_006.csv");
		}
	}

}
