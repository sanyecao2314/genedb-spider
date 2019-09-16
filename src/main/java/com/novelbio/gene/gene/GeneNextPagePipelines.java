package com.novelbio.gene.gene;

import org.apache.commons.lang3.StringUtils;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.SchedulerContext;
import com.novelbio.gene.qtl.QtlList;


@PipelineName("qtlPipelines")
public class GeneNextPagePipelines implements Pipeline<GeneList> {

	@Override
	public void process(GeneList geneList) {
		HttpRequest currRequest = geneList.getRequest();
		// 下一页继续抓取
		int currPage = geneList.getCurrPage();
		int nextPage = currPage + 1;
		int totalPage = geneList.getTotalPage();
		if (nextPage <= totalPage) {
			String nextUrl = "";
			String currUrl = currRequest.getUrl();
			if(currUrl.indexOf("page=") != -1) {
				nextUrl = StringUtils.replaceOnce(currUrl, "page=" + currPage, "page=" + nextPage);
			} else {
				nextUrl = currUrl + "&" + "page=" + nextPage;
			}
			SchedulerContext.into(currRequest.subRequest(nextUrl));
		}
	}

	

}
