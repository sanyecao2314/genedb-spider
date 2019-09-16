package com.novelbio.gene.snpjapan;

import org.apache.commons.lang3.StringUtils;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.SchedulerContext;
import com.novelbio.gene.qtl.QtlList;


@PipelineName("snpJapanNextPagePipelines")
public class SnpJapanNextPagePipelines implements Pipeline<SnpJapanList> {

	@Override
	public void process(SnpJapanList snpJapanList) {
		HttpRequest currRequest = snpJapanList.getRequest();
		// 下一页继续抓取
		int currPage = snpJapanList.getCurrPage();
		int nextPage = currPage + 1;
		int totalPage = snpJapanList.getTotalPage();
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
