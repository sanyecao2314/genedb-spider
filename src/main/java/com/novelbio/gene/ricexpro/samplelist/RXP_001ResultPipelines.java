package com.novelbio.gene.ricexpro.samplelist;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_001ResultPipelines")
public class RXP_001ResultPipelines implements Pipeline<RXP_001BeanList>{
	@Override
	public void process(RXP_001BeanList rxp_001BeanList) {
		String title = "NO	DATA SET ID	SAMPLE ID	SAMPLING DETAILS	GROWTH STAGE	CULTIVAR	cRNA QTY	GRC#	Structure Development Stage	Anatomical Entity";
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_001.csv");
		for (RXP_001Bean RXPBean : rxp_001BeanList.getRxp_001Beans()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSample_id() 
			+ "\t" + RXPBean.getSampling_details() + "\t" + RXPBean.getGrowth_stage() + "\t" + RXPBean.getCultivar()
			+"\t" + RXPBean.getcRNA_QTY() + "\t" + RXPBean.getGrc() + "\t" + RXPBean.getStructureDevelopment() + "\t" + RXPBean.getAnatomicalEntity();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_001.csv");
		}
	}

}
