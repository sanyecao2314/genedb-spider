package com.novelbio.genedb.ricexpro.allrice.rxp012;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class NormalizedBean implements HtmlBean {
	
	@Text
	@HtmlField(cssPath = "th")
	private String rep;
	

	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String em07 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String em10 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String em14 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String em21 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String em28 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String em42 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String en07 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String en10 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String en14 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String en21 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String en28 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String en42 ;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getEm07() {
		return em07;
	}

	public void setEm07(String em07) {
		this.em07 = em07;
	}

	public String getEm10() {
		return em10;
	}

	public void setEm10(String em10) {
		this.em10 = em10;
	}

	public String getEm14() {
		return em14;
	}

	public void setEm14(String em14) {
		this.em14 = em14;
	}

	public String getEm21() {
		return em21;
	}

	public void setEm21(String em21) {
		this.em21 = em21;
	}

	public String getEm28() {
		return em28;
	}

	public void setEm28(String em28) {
		this.em28 = em28;
	}

	public String getEm42() {
		return em42;
	}

	public void setEm42(String em42) {
		this.em42 = em42;
	}

	public String getEn07() {
		return en07;
	}

	public void setEn07(String en07) {
		this.en07 = en07;
	}

	public String getEn10() {
		return en10;
	}

	public void setEn10(String en10) {
		this.en10 = en10;
	}

	public String getEn14() {
		return en14;
	}

	public void setEn14(String en14) {
		this.en14 = en14;
	}

	public String getEn21() {
		return en21;
	}

	public void setEn21(String en21) {
		this.en21 = en21;
	}

	public String getEn28() {
		return en28;
	}

	public void setEn28(String en28) {
		this.en28 = en28;
	}

	public String getEn42() {
		return en42;
	}

	public void setEn42(String en42) {
		this.en42 = en42;
	}

	
}
