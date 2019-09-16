package com.novelbio.gene.ricexpro.samplelist;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_0004/sample-list.php", pipelines = {"consolePipeline", "RXP_004ResultPipelines"})
public class RXP_004BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_004Bean> rxp_004Beans;

	public List<RXP_004Bean> getRxp_004Beans() {
		return rxp_004Beans;
	}

	public void setRxp_004Beans(List<RXP_004Bean> rxp_004Beans) {
		this.rxp_004Beans = rxp_004Beans;
	}

	
}
