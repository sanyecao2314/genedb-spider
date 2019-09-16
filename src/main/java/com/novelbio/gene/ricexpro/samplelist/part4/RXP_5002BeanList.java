package com.novelbio.gene.ricexpro.samplelist.part4;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_5002/sample-list.php", pipelines = { "consolePipeline",
		"RXP_5002ResultPipelines" })
public class RXP_5002BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_5002Bean> rxp_5002Beans;

	public List<RXP_5002Bean> getRxp_5002Beans() {
		return rxp_5002Beans;
	}

	public void setRxp_5002Beans(List<RXP_5002Bean> rxp_5002Beans) {
		this.rxp_5002Beans = rxp_5002Beans;
	}
	
	
}
