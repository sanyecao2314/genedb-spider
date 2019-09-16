package com.novelbio.genedb.ncpgr;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;

@PipelineName("siteInfoPipelines")
public class SiteInfoPipelines implements Pipeline<SiteInfoLsBean> {

	public void process(SiteInfoLsBean lsBean) {
		TxtReadandWrite trw = null;
		try {
			// SiteInfoBean_tb1 tb1 = lsBean.getTb1();
			List<SiteInfoBean_tb2> tb2s = lsBean.getTb2s();
			List<SiteInfoBean_tb3> tb3s = lsBean.getTb3s();
			List<SiteInfoBean_tb4> tb4s = lsBean.getTb4s();

			String filePath = "/home/novelbio/桌面/ncpgr_siteInfo/" + lsBean.getSite() + ".csv";

			trw = new TxtReadandWrite(new FileOutputStream(new File(filePath), true));

			// 表格一
			StringBuffer titleTb1 = new StringBuffer("Detailed information for " + lsBean.getSite() + ":");
			trw.writefile(titleTb1.toString(), true);
			StringBuffer contextTb1 = new StringBuffer();
			contextTb1.append(lsBean.getTd11()).append("\t").append(lsBean.getTd12()).append("\n")
					.append(lsBean.getTd21()).append("\t").append(lsBean.getTd22()).append("\n")
					.append(lsBean.getTd31()).append("\t").append(lsBean.getTd32()).append("\n")
					.append(lsBean.getTd41()).append("\t").append(lsBean.getTd42());
			trw.writefile(contextTb1.append("\n").toString(), true);


			// 表格二
			StringBuffer titleTb2 = new StringBuffer();
			titleTb2.append("Allele Frequencies:");
			trw.writefile(titleTb2.toString(), true);
			StringBuffer contextTb2 = new StringBuffer();
			contextTb2.append("Populations 	Population Size	Frequency of ").append(lsBean.getT1())
					.append("(primary allele)	Frequency of ").append(lsBean.getT2())
					.append("(secondary allele)	Frequency of N 	Frequency of DEL 	Frequency of others Allele ");
			trw.writefile(contextTb2.toString(), true);
			for (SiteInfoBean_tb2 tb2 : tb2s) {
				StringBuffer context = new StringBuffer();
				context.append(tb2.getPopulations()).append("\t").append(tb2.getPopuSize()).append("\t")
						.append(tb2.getfC()).append("\t").append(tb2.getfA()).append("\t").append(tb2.getfN())
						.append("\t").append(tb2.getfDEL()).append("\t").append(tb2.getAllele());
				trw.writefile(context.append("\n").toString(), true);
			}

			// 表格三
			StringBuffer titleTb3 = new StringBuffer();
			titleTb3.append("Allele Var Effect:");
			trw.writefile(titleTb3.toString(), true);
			// 表格头信息
			StringBuffer contextTb3 = new StringBuffer();
			contextTb3.append(
					"Var ID	Var	Locus	snpEff Annotation 	CooVar Annotation 	Chromatin Accessibility Score 	Conservation Effect 	Conservation Score ");
			trw.writefile(contextTb3.toString(), true);
			// 表格内容
			for (SiteInfoBean_tb3 tb3 : tb3s) {
				StringBuffer context = new StringBuffer();
				context.append(tb3.getVid()).append("\t").append(tb3.getVar()).append("\t").append(tb3.getLocus())
						.append("\t").append(tb3.getSnpEff()).append("\t").append(tb3.getCooVar()).append("\t")
						.append(tb3.getCaScore()).append("\t").append(tb3.getcEffect()).append("\t")
						.append(tb3.getCscore());
				trw.writefile(context.append("\n").toString(), true);
			}

			// 表格四
			if (tb4s.size() != 0) {
				StringBuffer titleTb4 = new StringBuffer();
				titleTb4.append("Putative Genotype-Phenotype Associations:");
				trw.writefile(titleTb4.toString(), true);
				// 表格头信息
				StringBuffer contextTb4 = new StringBuffer();
				contextTb4
						.append("Var ID	LMM P-value 	LR P-value 	Trait	Subpopulation	Is leadSNP 	Publication");
				trw.writefile(contextTb4.toString() + "\n", true);
				for (SiteInfoBean_tb4 tb4 : tb4s) {
					StringBuffer context = new StringBuffer();
					context.append(tb4.getId()).append("\t").append(tb4.getLmm()).append("\t").append(tb4.getLr())
							.append("\t").append(tb4.getTrait()).append("\t").append(tb4.getSubpopulation())
							.append("\t").append(tb4.getLs()).append("\t").append(tb4.getPublication());

					trw.writefile(context.append("\n").toString(), true);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			trw.close();
		}
	}
}
