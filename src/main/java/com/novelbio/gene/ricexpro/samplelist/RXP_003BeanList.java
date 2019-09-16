package com.novelbio.gene.ricexpro.samplelist;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_0003/sample-list.php", pipelines = {"consolePipeline", "RXP_003ResultPipelines"})
public class RXP_003BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_003Bean> rxp_003Beans;

	public List<RXP_003Bean> getRxp_003Beans() {
		return rxp_003Beans;
	}

	public void setRxp_003Beans(List<RXP_003Bean> rxp_003Beans) {
		this.rxp_003Beans = rxp_003Beans;
	}

	
}
