package com.novelbio.gene.ricexpro.samplelist;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_0007/sample-list.php", pipelines = { "consolePipeline",
		"RXP_007ResultPipelines" })
public class RXP_007BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_007Bean> rxp_007Beans;

	public List<RXP_007Bean> getRxp_007Beans() {
		return rxp_007Beans;
	}

	public void setRxp_007Beans(List<RXP_007Bean> rxp_007Beans) {
		this.rxp_007Beans = rxp_007Beans;
	}
}
