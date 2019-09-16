package com.novelbio.gene.threek.accessions;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Html;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://cgm.sjtu.edu.cn/3kricedb/rice-table.php", timeout = 8000, pipelines = {"consolePipeline", "riceResultPipelines"})
public class Rice_3kBeanList implements HtmlBean{
	
	@Text
	@HtmlField(cssPath = "body > div.container > h4")
	private String test;
	
	@Html
	@HtmlField(cssPath = "body")
	private String test2;
	
	
	// 页面数据
	@Text
	@HtmlField(cssPath = "#sum_form > table > tbody > tr:not(:first-child)")
	private List<Rice_3kBean> rice_3kBeans;

	public List<Rice_3kBean> getRice_3kBeans() {
		return rice_3kBeans;
	}

	public void setRice_3kBeans(List<Rice_3kBean> rice_3kBeans) {
		this.rice_3kBeans = rice_3kBeans;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getTest2() {
		return test2;
	}

	public void setTest2(String test2) {
		this.test2 = test2;
	}
	
	
}
