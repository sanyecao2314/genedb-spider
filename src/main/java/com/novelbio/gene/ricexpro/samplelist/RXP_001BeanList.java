package com.novelbio.gene.ricexpro.samplelist;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/GGEP/sample-list.php", pipelines = {"consolePipeline", "RXP_001ResultPipelines"})
public class RXP_001BeanList implements HtmlBean {
	// 页面数据

	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_001Bean> rxp_001Beans;

	public List<RXP_001Bean> getRxp_001Beans() {
		return rxp_001Beans;
	}

	public void setRxp_001Beans(List<RXP_001Bean> rxp_001Beans) {
		this.rxp_001Beans = rxp_001Beans;
	}
	
	
}
