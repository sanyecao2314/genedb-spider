package com.novelbio.genedb.ricexpro.allrice.rxp005;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class NormalizedBean implements HtmlBean {
	
	@Text
	@HtmlField(cssPath = "th")
	private String rep;

	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String l35 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String l40 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String l41 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String l42 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String l43 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String l44 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String l45 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String l50 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String l51 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String l52 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String l53 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String l54 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(14)")
	private String l55 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(15)")
	private String l60 ;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getL35() {
		return l35;
	}

	public void setL35(String l35) {
		this.l35 = l35;
	}

	public String getL40() {
		return l40;
	}

	public void setL40(String l40) {
		this.l40 = l40;
	}

	public String getL41() {
		return l41;
	}

	public void setL41(String l41) {
		this.l41 = l41;
	}

	public String getL42() {
		return l42;
	}

	public void setL42(String l42) {
		this.l42 = l42;
	}

	public String getL43() {
		return l43;
	}

	public void setL43(String l43) {
		this.l43 = l43;
	}

	public String getL44() {
		return l44;
	}

	public void setL44(String l44) {
		this.l44 = l44;
	}

	public String getL45() {
		return l45;
	}

	public void setL45(String l45) {
		this.l45 = l45;
	}

	public String getL50() {
		return l50;
	}

	public void setL50(String l50) {
		this.l50 = l50;
	}

	public String getL51() {
		return l51;
	}

	public void setL51(String l51) {
		this.l51 = l51;
	}

	public String getL52() {
		return l52;
	}

	public void setL52(String l52) {
		this.l52 = l52;
	}

	public String getL53() {
		return l53;
	}

	public void setL53(String l53) {
		this.l53 = l53;
	}

	public String getL54() {
		return l54;
	}

	public void setL54(String l54) {
		this.l54 = l54;
	}

	public String getL55() {
		return l55;
	}

	public void setL55(String l55) {
		this.l55 = l55;
	}

	public String getL60() {
		return l60;
	}

	public void setL60(String l60) {
		this.l60 = l60;
	}


}
