package com.novelbio.genedb.spider;

import java.util.ArrayList;
import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.XPath;
import com.geccocrawler.gecco.annotation.XPathObjct;
import com.geccocrawler.gecco.spider.XmlBean;

@Gecco(matchUrl = "http://s3.amazonaws.com/3kricegenome", timeout = 60000, pipelines = { "consolePipeline",
		"ricUrlBeanPipeline" })
public class RicListBean implements XmlBean {

	private static final long serialVersionUID = 1L;

	@XPathObjct(rootPath = "//Contents", listPath = "./Key")
	// @HtmlField(cssPath="#collapsible4 > div.expanded > div.collapsible-content")
	private List<String> lsKeys = new ArrayList<String>();

	@XPath("/ListBucketResult/Name")
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLsKeys() {
		return lsKeys;
	}

	public void setLsKeys(List<String> lsKeys) {
		this.lsKeys = lsKeys;
	}

}
