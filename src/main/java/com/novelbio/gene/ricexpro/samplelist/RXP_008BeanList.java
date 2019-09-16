package com.novelbio.gene.ricexpro.samplelist;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_0008/sample-list.php", pipelines = { "consolePipeline",
		"RXP_008ResultPipelines" })
public class RXP_008BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_008Bean> rxp_008Beans;

	public List<RXP_008Bean> getRxp_008Beans() {
		return rxp_008Beans;
	}

	public void setRxp_008Beans(List<RXP_008Bean> rxp_008Beans) {
		this.rxp_008Beans = rxp_008Beans;
	}
}
