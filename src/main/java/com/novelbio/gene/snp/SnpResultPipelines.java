package com.novelbio.gene.snp;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

@PipelineName("snpResultPipelines")
public class SnpResultPipelines implements Pipeline<SnpList>{

	@Override
	public void process(SnpList snpList) {
		List<SnpBean> snpBeans = snpList.getSnpBeans();
		System.out.println(JSON.toJSONString(snpBeans));
		String path = "/home/novelbio/桌面/snpBeans.txt";
		
		// 写入文件
		for (SnpBean snpBean : snpBeans) {
			String context = snpBean.getId() + "\t" + snpBean.getSnpName() + "\t" + snpBean.getSource() + "\t"	+ snpBean.getChr() + "\t" +
					snpBean.getBuild4() + "\t" + snpBean.getBuild5() + "\t" + snpBean.getIrgSP() + "\t" + snpBean.getAlleleR() + "\t" +
					snpBean.getAlleleA() + "\t" + snpBean.getAusR() + "\t" + snpBean.getAusA() + "\t" + snpBean.getIndicaR() + "\t" +
					snpBean.getIndicaA() + "\t" + snpBean.getTropicalJaponicaR() + "\t" + snpBean.getTropicalJaponicaA() + "\t" +
					snpBean.getTemperateJaponicaR() + "\t" + snpBean.getTemperateJaponicaA();
			WriteUtil.writeTxt(context, path);
		}
		
	}

}
