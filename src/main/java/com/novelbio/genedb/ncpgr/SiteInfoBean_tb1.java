package com.novelbio.genedb.ncpgr;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;


public class SiteInfoBean_tb1 implements HtmlBean{
	
	//表一内容
	
	@Text
	@HtmlField(cssPath = "td:nth-child(1)")
	private String td11;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String td12;
	
	@Text
	@HtmlField(cssPath = "tr:nth-child(2) > td:nth-child(1)")
	private String td21;
	
	@Text
	@HtmlField(cssPath = "tr:nth-child(2) > td:nth-child(2)")
	private String td22;
	
	@Text
	@HtmlField(cssPath = "tr:nth-child(3) > td:nth-child(1)")
	private String td31;
	
	@Text
	@HtmlField(cssPath = "tr:nth-child(3) > td:nth-child(2)")
	private String td32;
	
	@Text
	@HtmlField(cssPath = "tr:nth-child(4) > td:nth-child(1)")
	private String td41;
	
	@Text
	@HtmlField(cssPath = "tr:nth-child(4) > td:nth-child(1)")
	private String td42;

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
