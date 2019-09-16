package com.novelbio.gene.ricexpro.samplelist.part3;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/{RXP}/sample-list.php", pipelines = { "consolePipeline",
		"RXPResultPipelines" })
public class RXPBeanList implements HtmlBean {
	
	// 页面数据
	@HtmlField(cssPath = "body > table:nth-child(5) > tbody > tr:not(:first-child)")
	private List<RXPBean> rxpBeans;

	public List<RXPBean> getRxpBeans() {
		return rxpBeans;
	}

	public void setRxpBeans(List<RXPBean> rxpBeans) {
		this.rxpBeans = rxpBeans;
	}

	
	
}
