package com.novelbio.genedb.ricexpro.allrice.rxp011;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class NormalizedBean implements HtmlBean {
	
	@Text
	@HtmlField(cssPath = "th")
	private String rep;
	

	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String odat01 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String odat02 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String odat03 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String odat04 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String odat05 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String odat06 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String odat07 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String odat08 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String odat09 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String odat10 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String edat04 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String edat05 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(14)")
	private String edat06 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(15)")
	private String edat07 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(16)")
	private String edat08 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(17)")
	private String edat09 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(18)")
	private String edat10 ;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getOdat01() {
		return odat01;
	}

	public void setOdat01(String odat01) {
		this.odat01 = odat01;
	}

	public String getOdat02() {
		return odat02;
	}

	public void setOdat02(String odat02) {
		this.odat02 = odat02;
	}

	public String getOdat03() {
		return odat03;
	}

	public void setOdat03(String odat03) {
		this.odat03 = odat03;
	}

	public String getOdat04() {
		return odat04;
	}

	public void setOdat04(String odat04) {
		this.odat04 = odat04;
	}

	public String getOdat05() {
		return odat05;
	}

	public void setOdat05(String odat05) {
		this.odat05 = odat05;
	}

	public String getOdat06() {
		return odat06;
	}

	public void setOdat06(String odat06) {
		this.odat06 = odat06;
	}

	public String getOdat07() {
		return odat07;
	}

	public void setOdat07(String odat07) {
		this.odat07 = odat07;
	}

	public String getOdat08() {
		return odat08;
	}

	public void setOdat08(String odat08) {
		this.odat08 = odat08;
	}

	public String getOdat09() {
		return odat09;
	}

	public void setOdat09(String odat09) {
		this.odat09 = odat09;
	}

	public String getOdat10() {
		return odat10;
	}

	public void setOdat10(String odat10) {
		this.odat10 = odat10;
	}

	public String getEdat04() {
		return edat04;
	}

	public void setEdat04(String edat04) {
		this.edat04 = edat04;
	}

	public String getEdat05() {
		return edat05;
	}

	public void setEdat05(String edat05) {
		this.edat05 = edat05;
	}

	public String getEdat06() {
		return edat06;
	}

	public void setEdat06(String edat06) {
		this.edat06 = edat06;
	}

	public String getEdat07() {
		return edat07;
	}

	public void setEdat07(String edat07) {
		this.edat07 = edat07;
	}

	public String getEdat08() {
		return edat08;
	}

	public void setEdat08(String edat08) {
		this.edat08 = edat08;
	}

	public String getEdat09() {
		return edat09;
	}

	public void setEdat09(String edat09) {
		this.edat09 = edat09;
	}

	public String getEdat10() {
		return edat10;
	}

	public void setEdat10(String edat10) {
		this.edat10 = edat10;
	}

}
