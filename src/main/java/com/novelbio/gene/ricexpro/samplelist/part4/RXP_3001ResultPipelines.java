package com.novelbio.gene.ricexpro.samplelist.part4;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.RXPBean;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_3001ResultPipelines")
public class RXP_3001ResultPipelines implements Pipeline<RXP_3001BeanList>{
	
	public void process(RXP_3001BeanList rxp_3001BeanList) {
		String title = "No	Data Set ID	Sample ID	Time	Rice	Treatment	cRNA QTY	GRC#";
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_3001_1.csv");
		for (RXP_3001Bean_1 RXPBean : rxp_3001BeanList.getRxp_3001Bean_1s()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSample_id()
			+"\t" +RXPBean.getTime() + "\t" + RXPBean.getRice() + "\t" + RXPBean.getTreatment() + "\t" +  RXPBean.getcRNA_QTY() 
			+ "\t" + RXPBean.getGrc();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_3001_1.csv");
		}
		
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_3001_2.csv");
		for (RXP_3001Bean_2 RXPBean : rxp_3001BeanList.getRxp_3001Bean_2s()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSample_id()
			+"\t" +RXPBean.getTime() + "\t" + RXPBean.getRice() + "\t" + RXPBean.getTreatment() + "\t" +  RXPBean.getcRNA_QTY() 
			+ "\t" + RXPBean.getGrc();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_3001_2.csv");
		}
		
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_3001_3.csv");
		for (RXP_3001Bean_3 RXPBean : rxp_3001BeanList.getRxp_3001Bean_3s()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSample_id()
			+"\t" +RXPBean.getTime() + "\t" + RXPBean.getRice() + "\t" + RXPBean.getTreatment() + "\t" +  RXPBean.getcRNA_QTY() 
			+ "\t" + RXPBean.getGrc();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_3001_3.csv");
		}
	}
	
	

}
