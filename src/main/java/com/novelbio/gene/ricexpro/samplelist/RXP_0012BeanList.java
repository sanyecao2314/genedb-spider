package com.novelbio.gene.ricexpro.samplelist;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_0012/sample-list.php", pipelines = { "consolePipeline",
		"RXP_0012ResultPipelines" })
public class RXP_0012BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_0012Bean> rxp_0012Beans;

	public List<RXP_0012Bean> getRxp_0012Beans() {
		return rxp_0012Beans;
	}

	public void setRxp_0012Beans(List<RXP_0012Bean> rxp_0012Beans) {
		this.rxp_0012Beans = rxp_0012Beans;
	}
}
