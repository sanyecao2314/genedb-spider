package com.novelbio.gene.ricexpro.samplelist;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_0011/sample-list.php", pipelines = { "consolePipeline",
		"RXP_0011ResultPipelines" })
public class RXP_0011BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_0011Bean> rxp_0011Beans;

	public List<RXP_0011Bean> getRxp_0011Beans() {
		return rxp_0011Beans;
	}

	public void setRxp_0011Beans(List<RXP_0011Bean> rxp_0011Beans) {
		this.rxp_0011Beans = rxp_0011Beans;
	}
}
