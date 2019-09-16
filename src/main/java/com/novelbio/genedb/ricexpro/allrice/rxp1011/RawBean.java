package com.novelbio.genedb.ricexpro.allrice.rxp1011;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class RawBean implements HtmlBean {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Text
	@HtmlField(cssPath = "th")
	private String rep;
	

	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String min03 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String min05 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String min153 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String min155 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String min303 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String min305 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String hr13 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String hr15 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String hr33 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String hr35 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String hr63 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String hr65 ;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getMin03() {
		return min03;
	}

	public void setMin03(String min03) {
		this.min03 = min03;
	}

	public String getMin05() {
		return min05;
	}

	public void setMin05(String min05) {
		this.min05 = min05;
	}

	public String getMin153() {
		return min153;
	}

	public void setMin153(String min153) {
		this.min153 = min153;
	}

	public String getMin155() {
		return min155;
	}

	public void setMin155(String min155) {
		this.min155 = min155;
	}

	public String getMin303() {
		return min303;
	}

	public void setMin303(String min303) {
		this.min303 = min303;
	}

	public String getMin305() {
		return min305;
	}

	public void setMin305(String min305) {
		this.min305 = min305;
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

}
