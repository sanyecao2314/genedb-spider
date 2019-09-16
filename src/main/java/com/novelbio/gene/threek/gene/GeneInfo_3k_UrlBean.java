package com.novelbio.gene.threek.gene;

import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class GeneInfo_3k_UrlBean implements HtmlBean{
	
	@Href(click = true)
	@HtmlField(cssPath = "td:nth-child(9) > a")
	private String geneInfoUrl;

	public String getGeneInfoUrl() {
		return geneInfoUrl;
	}

	public void setGeneInfoUrl(String geneInfoUrl) {
		this.geneInfoUrl = geneInfoUrl;
	}
	
	
	
	
}
