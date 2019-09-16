package com.novelbio.genedb.ricexpro.allrice.rxp1006;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class RawBean implements HtmlBean {
	
	@Text
	@HtmlField(cssPath = "th")
	private String rep;
	


	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String hr03 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String hr05 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String hr13 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String hr15 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String hr33 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String hr35 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String hr63 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String hr65 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String hr123 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String hr125 ;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getHr03() {
		return hr03;
	}

	public void setHr03(String hr03) {
		this.hr03 = hr03;
	}

	public String getHr05() {
		return hr05;
	}

	public void setHr05(String hr05) {
		this.hr05 = hr05;
	}

	public String getHr13() {
		return hr13;
	}

	public void setHr13(String hr13) {
		this.hr13 = hr13;
	}

	public String getHr15() {
		return hr15;
	}

	public void setHr15(String hr15) {
		this.hr15 = hr15;
	}

	public String getHr33() {
		return hr33;
	}

	public void setHr33(String hr33) {
		this.hr33 = hr33;
	}

	public String getHr35() {
		return hr35;
	}

	public void setHr35(String hr35) {
		this.hr35 = hr35;
	}

	public String getHr63() {
		return hr63;
	}

	public void setHr63(String hr63) {
		this.hr63 = hr63;
	}

	public String getHr65() {
		return hr65;
	}

	public void setHr65(String hr65) {
		this.hr65 = hr65;
	}

	public String getHr123() {
		return hr123;
	}

	public void setHr123(String hr123) {
		this.hr123 = hr123;
	}

	public String getHr125() {
		return hr125;
	}

	public void setHr125(String hr125) {
		this.hr125 = hr125;
	}

}
