package com.novelbio.gene.qtl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.novelbio.base.dataOperate.TxtReadandWrite;

@PipelineName("qtlResultPipelines")
public class QtlResultPipelines implements Pipeline<QtlList> {

	public static List<HttpRequest> qtlRequests = new ArrayList<HttpRequest>();
	public static List<HttpRequest> referenceNoRequests = new ArrayList<HttpRequest>();

	@Override
	public void process(QtlList qtlList) {
		TxtReadandWrite trw = null;
		try {
			List<QtlBean> qtlBeans = qtlList.getQtls();

			// 写入文件
			String path = "/home/novelbio/桌面/qtlBeans.txt";

			trw = new TxtReadandWrite(new FileOutputStream(new File(path), true));

			for (QtlBean qtlBean : qtlBeans) {
				StringBuffer context = new StringBuffer();
				context.append(qtlBean.getId()).append("\t").append(qtlBean.getQtl()).append("\t")
						.append(qtlBean.getMajorCategory()).append("\t").append(qtlBean.getCharacter()).append("\t")
						.append(qtlBean.getPosition()).append("\t").append(qtlBean.getChr()).append("\t")
						.append(qtlBean.getStartGenome()).append("\t").append(qtlBean.getEndGenome()).append("\t")
						.append(qtlBean.getMappingMethod()).append("\t").append(qtlBean.getLod()).append("\t")
						.append(qtlBean.getParentA()).append("\t").append(qtlBean.getParentB()).append("\t")
						.append(qtlBean.getParentB()).append("\t").append(qtlBean.getDirection()).append("\t")
						.append(qtlBean.getReferenceSource()).append("\t").append(qtlBean.getReferenceNo());
				trw.writefile(context.append("\n").toString(), true);
			}

			process(qtlList, qtlBeans);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			trw.close();
		}
	}

	private void process(QtlList qtlList, List<QtlBean> subBeans) {
		if (subBeans == null) {
			return;
		}
		for (QtlBean qtlBean : subBeans) {
			String id = qtlBean.getId();
			String referenceNo = qtlBean.getReferenceNo();
			if (id != null) {
				String qtlUrl = "http://qtaro.abr.affrc.go.jp/qtab/entry/show/" + id;
				String referencesUrl = "http://qtaro.abr.affrc.go.jp/qtab/ref/detail/pha%3A" + referenceNo;
				HttpRequest currRequest = qtlList.getRequest();
				// System.out.println(url);
				// 将qtl地址暂存起来
				qtlRequests.add(currRequest.subRequest(qtlUrl));
				// 将references地址暂存起来
				referenceNoRequests.add(currRequest.subRequest(referencesUrl));
			}

		}

	}
}
