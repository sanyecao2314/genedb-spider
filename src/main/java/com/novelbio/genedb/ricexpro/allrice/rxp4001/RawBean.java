package com.novelbio.genedb.ricexpro.allrice.rxp4001;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class RawBean implements HtmlBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3563430601499301458L;
	
	@Text
	@HtmlField(cssPath = "th")
	private String rep;


	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String dr;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String dd;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String de;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String dm1;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String dm2;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String dm3;

	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String dm4;

	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String dm5;

	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String teep;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String tec;

	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String teen;

	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String tmep;

	@Text
	@HtmlField(cssPath = "td:nth-child(14)")
	private String tmen;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getDr() {
		return dr;
	}

	public void setDr(String dr) {
		this.dr = dr;
	}

	public String getDd() {
		return dd;
	}

	public void setDd(String dd) {
		this.dd = dd;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getDm1() {
		return dm1;
	}

	public void setDm1(String dm1) {
		this.dm1 = dm1;
	}

	public String getDm2() {
		return dm2;
	}

	public void setDm2(String dm2) {
		this.dm2 = dm2;
	}

	public String getDm3() {
		return dm3;
	}

	public void setDm3(String dm3) {
		this.dm3 = dm3;
	}

	public String getDm4() {
		return dm4;
	}

	public void setDm4(String dm4) {
		this.dm4 = dm4;
	}

	public String getDm5() {
		return dm5;
	}

	public void setDm5(String dm5) {
		this.dm5 = dm5;
	}

	public String getTeep() {
		return teep;
	}

	public void setTeep(String teep) {
		this.teep = teep;
	}

	public String getTeen() {
		return teen;
	}

	public void setTeen(String teen) {
		this.teen = teen;
	}

	public String getTmep() {
		return tmep;
	}

	public void setTmep(String tmep) {
		this.tmep = tmep;
	}

	public String getTmen() {
		return tmen;
	}

	public void setTmen(String tmen) {
		this.tmen = tmen;
	}

	public String getTec() {
		return tec;
	}

	public void setTec(String tec) {
		this.tec = tec;
	}
	
	

}