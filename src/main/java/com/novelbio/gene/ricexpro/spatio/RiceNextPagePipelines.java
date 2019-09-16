package com.novelbio.gene.ricexpro.spatio;

import org.apache.commons.lang3.StringUtils;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.DeriveSchedulerContext;
import com.geccocrawler.gecco.scheduler.SchedulerContext;
import com.novelbio.gene.qtl.QtlList;


@PipelineName("riceNextPagePipelines")
public class RiceNextPagePipelines implements Pipeline<RiceBeanList> {

	@Override
	public void process(RiceBeanList riceBeanList) {
		HttpRequest currRequest = riceBeanList.getRequest();
		// 下一页继续抓取
		int currPage = riceBeanList.getCurrPage();
		int nextPage = currPage + 1;
		int totalPage = riceBeanList.getTotalPage();
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
		
		//System.out.println(RiceResultPipelines.featureRequests.size());
	}

	

}
