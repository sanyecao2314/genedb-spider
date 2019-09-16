package com.novelbio.gene.ricexpro.samplelist;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_0010/sample-list.php", pipelines = { "consolePipeline",
		"RXP_0010ResultPipelines" })
public class RXP_0010BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_0010Bean> rxp_0010Beans;

	public List<RXP_0010Bean> getRxp_0010Beans() {
		return rxp_0010Beans;
	}

	public void setRxp_0010Beans(List<RXP_0010Bean> rxp_0010Beans) {
		this.rxp_0010Beans = rxp_0010Beans;
	}
}
