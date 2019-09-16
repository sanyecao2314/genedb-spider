package com.novelbio.genedb.ncpgenotype;

import java.util.List;

import com.geccocrawler.gecco.annotation.Attr;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricevarmap.ncpgr.cn/v2/vars_genotype/", timeout = 120000, pipelines = "paramsPipeline")
public class ParamsBean implements HtmlBean{
	@Request
	private HttpRequest currRequest;
	
	@Attr("value")
	@HtmlField(cssPath = "#lstview > option")
	private List<String> options;
	
	
	@Attr("value")
	@HtmlField(cssPath = "#form > input[name='csrfmiddlewaretoken']")
	private String csrfmiddlewaretoken;
	
	@Text
	@HtmlField(cssPath = "#geno_table > tbody > tr:nth-child(1) > th")
	private String t1;
	
	
	

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}
	

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String getCsrfmiddlewaretoken() {
		return csrfmiddlewaretoken;
	}

	public void setCsrfmiddlewaretoken(String csrfmiddlewaretoken) {
		this.csrfmiddlewaretoken = csrfmiddlewaretoken;
	}

	public HttpRequest getCurrRequest() {
		return currRequest;
	}

	public void setCurrRequest(HttpRequest currRequest) {
		this.currRequest = currRequest;
	}

	
	
}
