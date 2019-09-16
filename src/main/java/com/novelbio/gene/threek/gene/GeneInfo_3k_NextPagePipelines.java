package com.novelbio.gene.threek.gene;

import org.apache.commons.lang3.StringUtils;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.DeriveSchedulerContext;
import com.geccocrawler.gecco.scheduler.SchedulerContext;
import com.novelbio.gene.qtl.QtlList;


@PipelineName("geneInfo_3k_NextPagePipelines")
public class GeneInfo_3k_NextPagePipelines implements Pipeline<GeneInfo_3k_LsUrlBean> {

	@Override
	public void process(GeneInfo_3k_LsUrlBean lsUrlBean) {
		System.out.println("第" + lsUrlBean.getCurrPage() + "页" );
		HttpRequest currRequest = lsUrlBean.getRequest();
		// 下一页继续抓取
		int currPage = lsUrlBean.getCurrPage();
		int nextPage = currPage + 1;
		int totalPage = lsUrlBean.getTotalPage();
		if (nextPage <= totalPage) {
			String nextUrl = "";
			String currUrl = currRequest.getUrl();
			if(currUrl.indexOf("page=") != -1) {
				nextUrl = StringUtils.replaceOnce(currUrl, "page=" + currPage, "page=" + nextPage);
			} else {
				nextUrl = currUrl + "&" + "page=" + nextPage;
			}
			DeriveSchedulerContext.into(currRequest.subRequest(nextUrl));
		}
	}

	

}
