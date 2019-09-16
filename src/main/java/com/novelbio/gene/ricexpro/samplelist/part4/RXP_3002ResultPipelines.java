package com.novelbio.gene.ricexpro.samplelist.part4;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.RXPBean;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_3002ResultPipelines")
public class RXP_3002ResultPipelines implements Pipeline<RXP_3002BeanList> {

	public void process(RXP_3002BeanList rxp_3002BeanList) {
		String title = "No	Data Set ID	Sample ID	Time	Treatment	cRNA QTY";
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_3002.csv");
		for (RXP_3002Bean RXPBean : rxp_3002BeanList.getRxp_3002Beans()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSample_id() + "\t"
					+ RXPBean.getTime() + "\t" + RXPBean.getTreatment() + "\t" + RXPBean.getcRNA_QTY();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_3002.csv");
		}
	}

}
