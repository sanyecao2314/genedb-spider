package com.novelbio.gene.gene;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.novelbio.base.dataOperate.TxtReadandWrite;

@PipelineName("geneResultPipelines")
public class GeneResultPipelines implements Pipeline<GeneList> {
	// 保存每一个基因详情的请求
	public static List<HttpRequest> entryRequests = new ArrayList<HttpRequest>();

	@Override
	public void process(GeneList geneList) {
		TxtReadandWrite trw = null;
		try {
			System.out.println(JSON.toJSONString(geneList.getGeneBeans()));
			List<GeneBean> geneBeans = geneList.getGeneBeans();

			// 写入文件
			String path = "/home/novelbio/桌面/GeneBeans.txt";
			trw = new TxtReadandWrite(new FileOutputStream(new File(path), true));

			for (GeneBean geneBean : geneBeans) {
				StringBuffer contxt = new StringBuffer();
				contxt.append(geneBean.getId()).append("\t").append(geneBean.getGene()).append("\t")
						.append(geneBean.getGeneSymbol()).append("\t").append(geneBean.getMajorCategory()).append("\t")
						.append(geneBean.getObjectCharacter()).append("\t").append(geneBean.getChr()).append("\t")
						.append(geneBean.getGenomeStart()).append("\t").append(geneBean.getGenomeEnd()).append("\t")
						.append(geneBean.getLocusID()).append("\t").append(geneBean.getIsolationMethod()).append("\t")
						.append(geneBean.getObjectiveCharacter()).append("\t").append(geneBean.getReference());
				trw.writefile(contxt.append("\n").toString(), true);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			trw.close();
		}

		// process(geneList, geneBeans);
	}

	private void process(GeneList geneList, List<GeneBean> geneBeans) {
		if (geneBeans == null) {
			return;
		}
		for (GeneBean geneBean : geneBeans) {
			String id = geneBean.getId();
			if (id != null) {
				String entryUrl = "http://qtaro.abr.affrc.go.jp/ogro/entry/show/" + id;

				HttpRequest currRequest = geneList.getRequest();
				System.out.println(entryUrl);
				// 将entry地址暂存起来
				entryRequests.add(currRequest.subRequest(entryUrl));
			}
		}
	}
}
