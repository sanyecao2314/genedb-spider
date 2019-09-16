package com.novelbio.gene.ricexpro.samplelist.part4;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_4001/sample-list.php", pipelines = { "consolePipeline",
		"RXP_4001ResultPipelines" })
public class RXP_4001BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_4001Bean> rxp_4001Beans;

	public List<RXP_4001Bean> getRxp_4001Beans() {
		return rxp_4001Beans;
	}

	public void setRxp_4001Beans(List<RXP_4001Bean> rxp_4001Beans) {
		this.rxp_4001Beans = rxp_4001Beans;
	}
	
	
}
