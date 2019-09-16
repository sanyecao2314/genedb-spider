package com.novelbio.genedb.ncbi;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "https://trace.ncbi.nlm.nih.gov/Traces/sra/?run={errNo}", timeout = 300000, pipelines = "sraDataPipeline")
public class SraDataBean implements HtmlBean{
	
	
	@RequestParameter(value = "errNo")
	private String errNo;
	
	@Href
	@HtmlField(cssPath = ".experiment .run-viewer-download tr.first>td:nth-child(4) a")
	private String url;

	public String getErrNo() {
		return errNo;
	}

	public void setErrNo(String errNo) {
		this.errNo = errNo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}