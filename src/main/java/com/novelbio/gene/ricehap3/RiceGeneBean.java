package com.novelbio.gene.ricehap3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://202.127.18.221/RiceHap3/Genotype.php", pipelines="consolePipeline")
public class RiceGeneBean implements HtmlBean {
	@Request
	private HttpRequest request;
	
	
	
	@Text
	@HtmlField(cssPath = "body")
	private String context;

	@Href
	@HtmlField(cssPath = "td > a")
	private List<String> links;

	public HttpRequest getRequest() {
		return request;
	}

	public void setRequest(HttpRequest request) {
		this.request = request;
		Map<String, String> parameters = new HashMap<>();
		parameters.put("username", "novelbio");
		parameters.put("password", "novelbio");
		request.setParameters(parameters);
	}

	public List<String> getLinks() {
		return links;
	}

	public void setLinks(List<String> links) {
		this.links = links;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
}
