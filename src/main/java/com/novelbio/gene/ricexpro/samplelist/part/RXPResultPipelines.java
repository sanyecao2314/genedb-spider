package com.novelbio.gene.ricexpro.samplelist.part;

import org.eclipse.jetty.util.component.Graceful;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.sun.xml.txw2.TXW;

@PipelineName("RXPResultPipelines1")
public class RXPResultPipelines implements Pipeline<RXPBeanList> {
	
	@Override
	public void process(RXPBeanList RXPBeanList) {
		
		String title = "ID	DATA SET ID	ELAPSED TIME	EXPERIMENT NAME	Cy3_SAMPLE NAME	Cy5_SAMPLE NAME	GRC#	Structure Development Stage	Anatomical Entity";
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/"+RXPBeanList.getRxpBeans().get(0).getData_set_id()+".csv");
		for (RXPBean RXPBean : RXPBeanList.getRxpBeans()) {
			String result = RXPBean.getId() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getElapsed_time() +
					"\t" +  RXPBean.getExperiment_name() + "\t" + RXPBean.getCy3_sample_name() +
					"\t" +RXPBean.getCy5_sample_name() + "\t" +  RXPBean.getGrc() +
					"\t" + RXPBean.getStructureDevelopment() + "\t" + RXPBean.getAnatomicalEntity();
			WriteUtil.writeTxt(result,"/home/novelbio/桌面/"+RXPBeanList.getRxpBeans().get(0).getData_set_id()+".csv");
		}
		
	}

}
