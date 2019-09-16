package com.novelbio.gene.ricexpro.samplelist;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_0006/sample-list.php", pipelines = {"consolePipeline", "RXP_006ResultPipelines"})
public class RXP_006BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_006Bean> rxp_006Beans;

	public List<RXP_006Bean> getRxp_006Beans() {
		return rxp_006Beans;
	}

	public void setRxp_006Beans(List<RXP_006Bean> rxp_006Beans) {
		this.rxp_006Beans = rxp_006Beans;
	}
}
