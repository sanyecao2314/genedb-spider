package com.novelbio.gene.qtl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.SchedulerContext;

/**
 * 继续抓取下一页内容
 * @author novelbio
 *
 */
@PipelineName("qtlPipelines")
public class QtlPipelines implements Pipeline<QtlList> {
	@SuppressWarnings("deprecation")
	@Override
	public void process(QtlList qtlList) {

		HttpRequest currRequest = qtlList.getRequest();
		// 下一页继续抓取
		int currPage = qtlList.getCurrPage();
		int nextPage = currPage + 1;
		int totalPage = qtlList.getTotalPage();
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
