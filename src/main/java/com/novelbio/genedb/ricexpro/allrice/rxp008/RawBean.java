package com.novelbio.genedb.ricexpro.allrice.rxp008;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class RawBean implements HtmlBean {
	
	@Text
	@HtmlField(cssPath = "th")
	private String rep;
	

	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String dat14 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String dat21 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String dat28 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String dat35 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String dat42 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String dat49 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String dat56 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String dat63 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String dat70 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String dat77 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String dat84 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String dat91 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(14)")
	private String dat98 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(15)")
	private String dat105 ;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getDat14() {
		return dat14;
	}

	public void setDat14(String dat14) {
		this.dat14 = dat14;
	}

	public String getDat21() {
		return dat21;
	}

	public void setDat21(String dat21) {
		this.dat21 = dat21;
	}

	public String getDat28() {
		return dat28;
	}

	public void setDat28(String dat28) {
		this.dat28 = dat28;
	}

	public String getDat35() {
		return dat35;
	}

	public void setDat35(String dat35) {
		this.dat35 = dat35;
	}

	public String getDat42() {
		return dat42;
	}

	public void setDat42(String dat42) {
		this.dat42 = dat42;
	}

	public String getDat49() {
		return dat49;
	}

	public void setDat49(String dat49) {
		this.dat49 = dat49;
	}

	public String getDat56() {
		return dat56;
	}

	public void setDat56(String dat56) {
		this.dat56 = dat56;
	}

	public String getDat63() {
		return dat63;
	}

	public void setDat63(String dat63) {
		this.dat63 = dat63;
	}

	public String getDat70() {
		return dat70;
	}

	public void setDat70(String dat70) {
		this.dat70 = dat70;
	}

	public String getDat77() {
		return dat77;
	}

	public void setDat77(String dat77) {
		this.dat77 = dat77;
	}

	public String getDat84() {
		return dat84;
	}

	public void setDat84(String dat84) {
		this.dat84 = dat84;
	}

	public String getDat91() {
		return dat91;
	}

	public void setDat91(String dat91) {
		this.dat91 = dat91;
	}

	public String getDat98() {
		return dat98;
	}

	public void setDat98(String dat98) {
		this.dat98 = dat98;
	}

	public String getDat105() {
		return dat105;
	}

	public void setDat105(String dat105) {
		this.dat105 = dat105;
	}

}
