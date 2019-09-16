package com.novelbio.gene.ricexpro.samplelist.part4;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.RXPBean;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_3003ResultPipelines")
public class RXP_3003ResultPipelines implements Pipeline<RXP_3003BeanList> {

	@Override
	public void process(RXP_3003BeanList rxp_3003BeanList) {
		String title = "No	Data Set ID	Sample Name	Rice	Treatment	Time	Exp. No";
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_3003_1.csv");
		for (RXP_3003Bean_1 RXPBean : rxp_3003BeanList.getRxp_3003Bean_1s()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSampleName() + "\t"
					+ RXPBean.getRice() + "\t" + RXPBean.getTreatment() + "\t" + RXPBean.getTime() + "\t" + RXPBean.getExp_No();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_3003_1.csv");
		}
		
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_3003_2.csv");
		for (RXP_3003Bean_2 RXPBean : rxp_3003BeanList.getRxp_3003Bean_2s()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getData_set_id() + "\t" + RXPBean.getSampleName() + "\t"
					+ RXPBean.getRice() + "\t" + RXPBean.getTreatment() + "\t" + RXPBean.getTime() + "\t" + RXPBean.getExp_No();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_3003_2.csv");
		}
	}

}
