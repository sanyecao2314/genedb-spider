package com.novelbio.genedb.ricexpro.allrice.rxp1012;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class C5c3 implements HtmlBean {
	
	@Text
	@HtmlField(cssPath = "th")
	private String rep;
	


	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String hr0 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String hr1 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String hr3 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String hr6 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String hr12 ;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getHr0() {
		return hr0;
	}

	public void setHr0(String hr0) {
		this.hr0 = hr0;
	}

	public String getHr1() {
		return hr1;
	}

	public void setHr1(String hr1) {
		this.hr1 = hr1;
	}

	public String getHr3() {
		return hr3;
	}

	public void setHr3(String hr3) {
		this.hr3 = hr3;
	}

	public String getHr6() {
		return hr6;
	}

	public void setHr6(String hr6) {
		this.hr6 = hr6;
	}

	public String getHr12() {
		return hr12;
	}

	public void setHr12(String hr12) {
		this.hr12 = hr12;
	}

}
