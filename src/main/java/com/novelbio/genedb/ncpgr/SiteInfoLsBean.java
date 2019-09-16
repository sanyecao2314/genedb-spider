package com.novelbio.genedb.ncpgr;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricevarmap.ncpgr.cn/v2/vars_info//?var={site}", timeout = 300000, pipelines = "siteInfoPipelines")
public class SiteInfoLsBean implements HtmlBean{
	// 位点名称
	@RequestParameter(value = "site")
	private String site;
	/*body > div.container > table > tbody > tr:nth-child(1) > td:nth-child(1)
	          #fre_table > tbody > tr:nth-child(1) > td:nth-child(1)*/
	//表一内容 body > div.container > table > tbody > tr:nth-child(1) > td:nth-child(1)
	/*@HtmlField(cssPath = "body > div.container > table > tbody > tr")
	private SiteInfoBean_tb1 tb1;*/
	
	@Text
	@HtmlField(cssPath = "body > div.container > table > tbody > tr:nth-child(1) > td:nth-child(1)")
	private String td11;
	
	@Text
	@HtmlField(cssPath = "body > div.container > table > tbody > tr:nth-child(1) > td:nth-child(2)")
	private String td12;
	
	@Text
	@HtmlField(cssPath = "body > div.container > table > tbody > tr:nth-child(2) > td:nth-child(1)")
	private String td21;
	
	@Text
	@HtmlField(cssPath = "body > div.container > table > tbody > tr:nth-child(2) > td:nth-child(2)")
	private String td22;
	
	@Text
	@HtmlField(cssPath = "body > div.container > table > tbody > tr:nth-child(3) > td:nth-child(1)")
	private String td31;
	
	@Text
	@HtmlField(cssPath = "body > div.container > table > tbody > tr:nth-child(3) > td:nth-child(2)")
	private String td32;
	
	@Text
	@HtmlField(cssPath = "body > div.container > table > tbody > tr:nth-child(4) > td:nth-child(1)")
	private String td41;
	
	@Text
	@HtmlField(cssPath = "body > div.container > table > tbody > tr:nth-child(4) > td:nth-child(2)")
	private String td42;
	
	//表格二变化表头信息
	@HtmlField(cssPath = "#fre_table > thead > tr > th:nth-child(3) > span")
	private String t1;
	
	@HtmlField(cssPath = "#fre_table > thead > tr > th:nth-child(4) > span")
	private String t2;
	
	//表格二内容
	@HtmlField(cssPath = "#fre_table > tbody > tr")
	private List<SiteInfoBean_tb2> tb2s;
	
	//表格三内容
	@HtmlField(cssPath = "#anno_table > tbody > tr")
	private List<SiteInfoBean_tb3> tb3s;
	
	//表格四内容
	@HtmlField(cssPath = "#gwas_table > tbody > tr")
	private List<SiteInfoBean_tb4> tb4s;

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	
	

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public String getT2() {
		return t2;
	}

	public void setT2(String t2) {
		this.t2 = t2;
	}

	public List<SiteInfoBean_tb2> getTb2s() {
		return tb2s;
	}

	public void setTb2s(List<SiteInfoBean_tb2> tb2s) {
		this.tb2s = tb2s;
	}

	public List<SiteInfoBean_tb3> getTb3s() {
		return tb3s;
	}

	public void setTb3s(List<SiteInfoBean_tb3> tb3s) {
		this.tb3s = tb3s;
	}

	public List<SiteInfoBean_tb4> getTb4s() {
		return tb4s;
	}

	public void setTb4s(List<SiteInfoBean_tb4> tb4s) {
		this.tb4s = tb4s;
	}

	public String getTd11() {
		return td11;
	}

	public void setTd11(String td11) {
		this.td11 = td11;
	}

	public String getTd12() {
		return td12;
	}

	public void setTd12(String td12) {
		this.td12 = td12;
	}

	public String getTd21() {
		return td21;
	}

	public void setTd21(String td21) {
		this.td21 = td21;
	}

	public String getTd22() {
		return td22;
	}

	public void setTd22(String td22) {
		this.td22 = td22;
	}

	public String getTd31() {
		return td31;
	}

	public void setTd31(String td31) {
		this.td31 = td31;
	}

	public String getTd32() {
		return td32;
	}

	public void setTd32(String td32) {
		this.td32 = td32;
	}

	public String getTd41() {
		return td41;
	}

	public void setTd41(String td41) {
		this.td41 = td41;
	}

	public String getTd42() {
		return td42;
	}

	public void setTd42(String td42) {
		this.td42 = td42;
	}

}
