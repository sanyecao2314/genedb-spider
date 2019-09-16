package com.novelbio.genedb.ricexpro.allrice.rxp010;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class NormalizedBean implements HtmlBean {
	
	@Text
	@HtmlField(cssPath = "th")
	private String rep;
	

	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String in06 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String in10 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String in15 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String in20 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String in25 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String in30 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String in40 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String in50 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String an03 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String an07 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String an12 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String an16 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(14)")
	private String pi5 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(15)")
	private String pi10 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(16)")
	private String pi14 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(17)")
	private String lpl15 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(18)")
	private String lpp15 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(19)")
	private String lpl40 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(20)")
	private String lpp40 ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(21)")
	private String lpl70 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(22)")
	private String lpp70 ;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getIn06() {
		return in06;
	}

	public void setIn06(String in06) {
		this.in06 = in06;
	}

	public String getIn10() {
		return in10;
	}

	public void setIn10(String in10) {
		this.in10 = in10;
	}

	public String getIn15() {
		return in15;
	}

	public void setIn15(String in15) {
		this.in15 = in15;
	}

	public String getIn20() {
		return in20;
	}

	public void setIn20(String in20) {
		this.in20 = in20;
	}

	public String getIn25() {
		return in25;
	}

	public void setIn25(String in25) {
		this.in25 = in25;
	}

	public String getIn30() {
		return in30;
	}

	public void setIn30(String in30) {
		this.in30 = in30;
	}

	public String getIn40() {
		return in40;
	}

	public void setIn40(String in40) {
		this.in40 = in40;
	}

	public String getIn50() {
		return in50;
	}

	public void setIn50(String in50) {
		this.in50 = in50;
	}

	public String getAn03() {
		return an03;
	}

	public void setAn03(String an03) {
		this.an03 = an03;
	}

	public String getAn07() {
		return an07;
	}

	public void setAn07(String an07) {
		this.an07 = an07;
	}

	public String getAn12() {
		return an12;
	}

	public void setAn12(String an12) {
		this.an12 = an12;
	}

	public String getAn16() {
		return an16;
	}

	public void setAn16(String an16) {
		this.an16 = an16;
	}

	public String getPi5() {
		return pi5;
	}

	public void setPi5(String pi5) {
		this.pi5 = pi5;
	}

	public String getPi10() {
		return pi10;
	}

	public void setPi10(String pi10) {
		this.pi10 = pi10;
	}

	public String getPi14() {
		return pi14;
	}

	public void setPi14(String pi14) {
		this.pi14 = pi14;
	}

	public String getLpl15() {
		return lpl15;
	}

	public void setLpl15(String lpl15) {
		this.lpl15 = lpl15;
	}

	public String getLpp15() {
		return lpp15;
	}

	public void setLpp15(String lpp15) {
		this.lpp15 = lpp15;
	}

	public String getLpl40() {
		return lpl40;
	}

	public void setLpl40(String lpl40) {
		this.lpl40 = lpl40;
	}

	public String getLpp40() {
		return lpp40;
	}

	public void setLpp40(String lpp40) {
		this.lpp40 = lpp40;
	}

	public String getLpl70() {
		return lpl70;
	}

	public void setLpl70(String lpl70) {
		this.lpl70 = lpl70;
	}

	public String getLpp70() {
		return lpp70;
	}

	public void setLpp70(String lpp70) {
		this.lpp70 = lpp70;
	}

}
