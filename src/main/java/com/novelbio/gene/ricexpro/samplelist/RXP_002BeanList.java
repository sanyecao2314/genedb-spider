package com.novelbio.gene.ricexpro.samplelist;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_0002/sample-list.php", pipelines = {"consolePipeline","RXP_002ResultPipelines"})
public class RXP_002BeanList implements HtmlBean {
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_002Bean> rxp_002Beans;

	public List<RXP_002Bean> getRxp_002Beans() {
		return rxp_002Beans;
	}

	public void setRxp_002Beans(List<RXP_002Bean> rxp_002Beans) {
		this.rxp_002Beans = rxp_002Beans;
	}
}
