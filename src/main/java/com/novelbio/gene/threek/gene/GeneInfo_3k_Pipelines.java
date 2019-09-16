package com.novelbio.gene.threek.gene;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.gene.util.WriteUtil;

@PipelineName("geneInfo_3k_Pipelines")
public class GeneInfo_3k_Pipelines implements Pipeline<GeneInfo_3k_Bean>{

	@Override
	public void process(GeneInfo_3k_Bean bean) {
		String filePath = "/home/novelbio/桌面/3kGene_Information.csv";
		String context = bean.getId() + "\t" + bean.getSource() + "\t" + bean.getChrom() + "\t" + bean.getStart() + "\t" + bean.getEnd() + "\t" +
						 bean.getStrand() + "\t" + bean.getCdsLen() + "\t" + bean.getExonNum() + "\t" + bean.getGeneID() + "\t" + bean.getCcoreGene() + "\t" +
						 bean.getCcoreGene() + "\t" + bean.getDistributed() + "\t" + bean.getSubsUnbalanced() + "\t" + bean.getInDominant() + "\t" +
						 bean.getJapDominant() + "\t" + bean.getSubSpecific() + "\t" + bean.getInSpecific() + "\t" + bean.getJapSpecific() + "\t" +
						 bean.getAus() + "\t" + bean.getAro() + "\t" + bean.getSubgUnbalanced() + "\t" + bean.getInSubgroup() + "\t" + bean.getJapSubgroup() + "\t" +
						 bean.getRandom() + "\t" + bean.getAge() + "\t" + bean.getGeneFamily1() + "\t" + bean.getGeneFamily2();
		
		WriteUtil.writeTxt(context, filePath);
	}

	

}
