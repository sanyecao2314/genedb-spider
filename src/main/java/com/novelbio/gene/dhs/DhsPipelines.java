package com.novelbio.gene.dhs;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.response.HttpResponse;
import com.geccocrawler.gecco.scheduler.SchedulerContext;

@PipelineName(value="dhsPipelines")
public class DhsPipelines implements Pipeline<DhsLinks> {

	@Request
	private HttpRequest currRequest;
	
	
	private HttpResponse response;
	
	@Override
	public void process(DhsLinks dhsLinks) {
		for (String url : dhsLinks.getLinks()) {
			System.out.println(url);
			SchedulerContext.into(currRequest.subRequest(url));
			
		}
		
	}

}
