package com.novelbio.genedb.ricexpro.allrice.rxp1003;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class C5c3 implements HtmlBean {
	
	@Text
	@HtmlField(cssPath = "th")
	private String rep;
	

	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String min0 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String min15 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String min30 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String hr1 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String hr3 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String hr6 ;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getMin0() {
		return min0;
	}

	public void setMin0(String min0) {
		this.min0 = min0;
	}

	public String getMin15() {
		return min15;
	}

	public void setMin15(String min15) {
		this.min15 = min15;
	}

	public String getMin30() {
		return min30;
	}

	public void setMin30(String min30) {
		this.min30 = min30;
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

}
