package com.novelbio.gene.snpjapan;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;

@PipelineName("snpJanpanResultPipelines")
public class SnpJanpanResultPipelines implements Pipeline<SnpJapanList> {

	TxtReadandWrite txtWrite = new TxtReadandWrite("/home/novelbio/桌面/snpJapanBeans.txt", true);

	@Override
	public void process(SnpJapanList snpJapanList) {
		List<SnpJapanBean> snpBeans = snpJapanList.getSnpBeans();
		System.out.println(JSON.toJSONString(snpBeans));

		// 写入文件
		String path = "/home/novelbio/桌面/snpJapanBeans.txt";
		
		// 写入文件
		for (SnpJapanBean snpBean : snpBeans) {
			String context = snpBean.getId() + "\t" + snpBean.getSnpName() + "\t" + snpBean.getSource() + "\t"	+ snpBean.getChr() + "\t" +
					snpBean.getBuild4() + "\t" + snpBean.getBuild5() + "\t" + snpBean.getIrgSP() + "\t" + snpBean.getAlleleR() + "\t" +
					snpBean.getAlleleA() + "\t" + snpBean.getUplandR() + "\t" + snpBean.getUplandA() + "\t" + snpBean.getLowlandGroup1R() + "\t" +
					snpBean.getLowlandGroup1A() + "\t" + snpBean.getLowlandGroup2R() + "\t" + snpBean.getLowlandGroup2A() + "\t" +
					snpBean.getLowlandGroup3R() + "\t" + snpBean.getLowlandGroup3A();
			WriteUtil.writeTxt(context, path);
		}
	}

}
