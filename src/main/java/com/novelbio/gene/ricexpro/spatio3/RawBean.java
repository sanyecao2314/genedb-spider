package com.novelbio.gene.ricexpro.spatio3;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Html;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

public class RawBean implements HtmlBean {
	
	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String dat13 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String dat20 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String dat27 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String dat34 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String dat41 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String dat48 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String dat55 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String dat62 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String dat69 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String dat76 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String dat83 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String dat90 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(14)")
	private String dat97 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(15)")
	private String dat104 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(16)")
	private String dat111 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(17)")
	private String dat118 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(18)")
	private String dat125 ;

	public String getDat13() {
		return dat13;
	}

	public void setDat13(String dat13) {
		this.dat13 = dat13;
	}

	public String getDat20() {
		return dat20;
	}

	public void setDat20(String dat20) {
		this.dat20 = dat20;
	}

	public String getDat27() {
		return dat27;
	}

	public void setDat27(String dat27) {
		this.dat27 = dat27;
	}

	public String getDat34() {
		return dat34;
	}

	public void setDat34(String dat34) {
		this.dat34 = dat34;
	}

	public String getDat41() {
		return dat41;
	}

	public void setDat41(String dat41) {
		this.dat41 = dat41;
	}

	public String getDat48() {
		return dat48;
	}

	public void setDat48(String dat48) {
		this.dat48 = dat48;
	}

	public String getDat55() {
		return dat55;
	}

	public void setDat55(String dat55) {
		this.dat55 = dat55;
	}

	public String getDat62() {
		return dat62;
	}

	public void setDat62(String dat62) {
		this.dat62 = dat62;
	}

	public String getDat69() {
		return dat69;
	}

	public void setDat69(String dat69) {
		this.dat69 = dat69;
	}

	public String getDat76() {
		return dat76;
	}

	public void setDat76(String dat76) {
		this.dat76 = dat76;
	}

	public String getDat83() {
		return dat83;
	}

	public void setDat83(String dat83) {
		this.dat83 = dat83;
	}

	public String getDat90() {
		return dat90;
	}

	public void setDat90(String dat90) {
		this.dat90 = dat90;
	}

	public String getDat97() {
		return dat97;
	}

	public void setDat97(String dat97) {
		this.dat97 = dat97;
	}

	public String getDat104() {
		return dat104;
	}

	public void setDat104(String dat104) {
		this.dat104 = dat104;
	}

	public String getDat111() {
		return dat111;
	}

	public void setDat111(String dat111) {
		this.dat111 = dat111;
	}

	public String getDat118() {
		return dat118;
	}

	public void setDat118(String dat118) {
		this.dat118 = dat118;
	}

	public String getDat125() {
		return dat125;
	}

	public void setDat125(String dat125) {
		this.dat125 = dat125;
	}

}
