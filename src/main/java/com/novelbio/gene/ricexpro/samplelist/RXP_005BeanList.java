package com.novelbio.gene.ricexpro.samplelist;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_0005/sample-list.php", pipelines = {"consolePipeline", "RXP_005ResultPipelines"})
public class RXP_005BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_005Bean> rxp_005Beans;

	public List<RXP_005Bean> getRxp_005Beans() {
		return rxp_005Beans;
	}

	public void setRxp_005Beans(List<RXP_005Bean> rxp_005Beans) {
		this.rxp_005Beans = rxp_005Beans;
	}
}
