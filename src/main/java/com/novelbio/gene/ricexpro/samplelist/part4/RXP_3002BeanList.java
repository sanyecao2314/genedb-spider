package com.novelbio.gene.ricexpro.samplelist.part4;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_3002/sample-list.php", pipelines = { "consolePipeline",
		"RXP_3002ResultPipelines" })
public class RXP_3002BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_3002Bean> rxp_3002Beans;

	public List<RXP_3002Bean> getRxp_3002Beans() {
		return rxp_3002Beans;
	}

	public void setRxp_3002Beans(List<RXP_3002Bean> rxp_3002Beans) {
		this.rxp_3002Beans = rxp_3002Beans;
	}
	
	
}
