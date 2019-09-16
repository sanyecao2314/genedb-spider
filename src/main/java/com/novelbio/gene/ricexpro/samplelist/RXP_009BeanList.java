package com.novelbio.gene.ricexpro.samplelist;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_0009/sample-list.php", pipelines = { "consolePipeline",
		"RXP_009ResultPipelines" })
public class RXP_009BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_009Bean> rxp_009Beans;

	public List<RXP_009Bean> getRxp_009Beans() {
		return rxp_009Beans;
	}

	public void setRxp_009Beans(List<RXP_009Bean> rxp_009Beans) {
		this.rxp_009Beans = rxp_009Beans;
	}
}
