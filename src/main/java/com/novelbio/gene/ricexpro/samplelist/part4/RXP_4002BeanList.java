package com.novelbio.gene.ricexpro.samplelist.part4;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_4002/sample-list.php", pipelines = { "consolePipeline",
		"RXP_4002ResultPipelines" })
public class RXP_4002BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_4002Bean> rxp_4002Beans;

	public List<RXP_4002Bean> getRxp_4002Beans() {
		return rxp_4002Beans;
	}

	public void setRxp_4002Beans(List<RXP_4002Bean> rxp_4002Beans) {
		this.rxp_4002Beans = rxp_4002Beans;
	}
	
	
}
