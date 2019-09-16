package com.novelbio.gene.ricexpro.samplelist.part4;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.RXPBean;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_5002ResultPipelines")
public class RXP_5002ResultPipelines implements Pipeline<RXP_5002BeanList>{
	
	@Override
	public void process(RXP_5002BeanList rxp_5002BeanList) {
		String title = "ID	DATA SET ID	SAMPLE ID	SAMPLE NAME	TREATMENT	EXPOSED TIME	Structure Development Stage	Anatomical Entity";
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_5002.csv");
		for (RXP_5002Bean RXPBean : rxp_5002BeanList.getRxp_5002Beans()) {
			String result = RXPBean.getId() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSample_id()
			+"\t" +RXPBean.getSample_name() + "\t" + RXPBean.getTreatment() + "\t" + RXPBean.getExposed_time()
			+ "\t" +  RXPBean.getStructureDevelopment() + "\t" + RXPBean.getAnatomicalEntity();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_5002.csv");
		}
	}
	
	

}
