package com.novelbio.gene.ricexpro.samplelist.part4;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.part3.RXPBean;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("RXP_4002ResultPipelines")
public class RXP_4002ResultPipelines implements Pipeline<RXP_4002BeanList> {

	@Override
	public void process(RXP_4002BeanList rxp_4002BeanList) {
		String title = "No.	Sub-dataset	ID	Sample ID	Slide ID	Position ID";
		WriteUtil.writeTxt(title, "/home/novelbio/桌面/RXP_4002.csv");
		for (RXP_4002Bean RXPBean : rxp_4002BeanList.getRxp_4002Beans()) {
			String result = RXPBean.getNo() + "\t" + RXPBean.getSub_dataset() + "\t" + RXPBean.getId() + "\t"
					+ RXPBean.getSampleID() + "\t" + RXPBean.getSlideID() + "\t" + RXPBean.getPositionID();
			WriteUtil.writeTxt(result, "/home/novelbio/桌面/RXP_4002.csv");
		}
	}

}
