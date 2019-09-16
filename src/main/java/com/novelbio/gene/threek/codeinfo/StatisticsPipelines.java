package com.novelbio.gene.threek.codeinfo;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.gene.util.WriteUtil;

@PipelineName("statisticsPipelines")
public class StatisticsPipelines implements Pipeline<StatisticsBean>{

	@Override
	public void process(StatisticsBean bean) {
		String filePath = "/home/novelbio/桌面/GeneStatistics.csv";
		
		String context = bean.getHighQuality() + "\t" + bean.getTotal() + "\t" + bean.getCore() + "\t" + bean.getCandidate() + "\t" +
				bean.getDistributed() + "\t" + bean.getUnbalanced() + "\t" + bean.getInDominant() + "\t" + bean.getJpDominant() + "\t" +
				bean.getSubSpecific() + "\t" + bean.getInSpecific() + "\t" + bean.getJapSpecific() + "\t" + bean.getAusSpecific() + "\t" +
				bean.getAroSpecific() + "\t" + bean.getSubgroup() + "\t" + bean.getInSubgroup() + "\t" + bean.getJapSubgroup() + "\t" +
				bean.getRandom();
		
		
		WriteUtil.writeTxt(context, filePath);
	}

}
