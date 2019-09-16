package com.novelbio.gene.ricexpro.samplelist.part4;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_3001/sample-list.php", pipelines = { "consolePipeline",
		"RXP_3001ResultPipelines" })
public class RXP_3001BeanList implements HtmlBean {
	// 页面数据
	/*body > table:nth-child(5) > tbody > tr:nth-child(2) > td:nth-child(1)
	body > table:nth-child(7) > tbody > tr:nth-child(2) > td:nth-child(1)
	body > table:nth-child(9) > tbody > tr:nth-child(2) > td:nth-child(1)*/
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXP_3001Bean_1> rxp_3001Bean_1s;
	
	@HtmlField(cssPath = "body > table:nth-child(7) > tbody > tr:not(:first-child)")
	private List<RXP_3001Bean_2> rxp_3001Bean_2s;
	
	@HtmlField(cssPath = "body > table:nth-child(9) > tbody > tr:not(:first-child)")
	private List<RXP_3001Bean_3> rxp_3001Bean_3s;

	public List<RXP_3001Bean_1> getRxp_3001Bean_1s() {
		return rxp_3001Bean_1s;
	}

	public void setRxp_3001Bean_1s(List<RXP_3001Bean_1> rxp_3001Bean_1s) {
		this.rxp_3001Bean_1s = rxp_3001Bean_1s;
	}

	public List<RXP_3001Bean_2> getRxp_3001Bean_2s() {
		return rxp_3001Bean_2s;
	}

	public void setRxp_3001Bean_2s(List<RXP_3001Bean_2> rxp_3001Bean_2s) {
		this.rxp_3001Bean_2s = rxp_3001Bean_2s;
	}

	public List<RXP_3001Bean_3> getRxp_3001Bean_3s() {
		return rxp_3001Bean_3s;
	}

	public void setRxp_3001Bean_3s(List<RXP_3001Bean_3> rxp_3001Bean_3s) {
		this.rxp_3001Bean_3s = rxp_3001Bean_3s;
	}
	
}
