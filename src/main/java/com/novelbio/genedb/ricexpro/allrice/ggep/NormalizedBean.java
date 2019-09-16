package com.novelbio.genedb.ricexpro.allrice.ggep;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class NormalizedBean implements HtmlBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3563430601499301458L;
	
	@Text
	@HtmlField(cssPath = "th")
	private String rep;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String lbV12;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String lbV00;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String lbRe12;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String lbRe00;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String lbRi12;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String lbRi00;

	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String lsV12;

	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String lsV00;

	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String lsRe12;

	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String lsRe00;

	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String rootV12;

	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String rootV00;

	@Text
	@HtmlField(cssPath = "td:nth-child(14)")
	private String rootR12;

	@Text
	@HtmlField(cssPath = "td:nth-child(15)")
	private String rootR00;

	@Text
	@HtmlField(cssPath =  "td:nth-child(16)")
	private String stemRe12;

	@Text
	@HtmlField(cssPath =  "td:nth-child(17)")
	private String stemRe00;

	@Text
	@HtmlField(cssPath =  "td:nth-child(18)")
	private String stemRi12;

	@Text
	@HtmlField(cssPath =  "td:nth-child(19)")
	private String stemRi00;

	@Text
	@HtmlField(cssPath =  "td:nth-child(20)")
	private String in06;

	@Text
	@HtmlField(cssPath =  "td:nth-child(21)")
	private String in30;

	@Text
	@HtmlField(cssPath =  "td:nth-child(22)")
	private String in50;

	@Text
	@HtmlField(cssPath =  "td:nth-child(23)")
	private String an03;

	@Text
	@HtmlField(cssPath =  "td:nth-child(24)")
	private String an07;

	@Text
	@HtmlField(cssPath =  "td:nth-child(25)")
	private String an12;

	@Text
	@HtmlField(cssPath =  "td:nth-child(26)")
	private String an16;

	@Text
	@HtmlField(cssPath =  "td:nth-child(27)")
	private String pi5;

	@Text
	@HtmlField(cssPath =  "td:nth-child(28)")
	private String pi10;

	@Text
	@HtmlField(cssPath =  "td:nth-child(29)")
	private String pi14;

	@Text
	@HtmlField(cssPath =  "td:nth-child(30)")
	private String lpL15;

	@Text
	@HtmlField(cssPath =  "td:nth-child(31)")
	private String lpP15;

	@Text
	@HtmlField(cssPath =  "td:nth-child(32)")
	private String lpL40;

	@Text
	@HtmlField(cssPath =  "td:nth-child(33)")
	private String lpP40;

	@Text
	@HtmlField(cssPath =  "td:nth-child(34)")
	private String lpL70;

	@Text
	@HtmlField(cssPath =  "td:nth-child(35)")
	private String lp740;

	@Text
	@HtmlField(cssPath =  "td:nth-child(36)")
	private String ov01;

	@Text
	@HtmlField(cssPath =  "td:nth-child(37)")
	private String ov03;

	@Text
	@HtmlField(cssPath =  "td:nth-child(38)")
	private String ov05;

	@Text
	@HtmlField(cssPath =  "td:nth-child(39)")
	private String ov07;

	@Text
	@HtmlField(cssPath =  "td:nth-child(40)")
	private String em07;

	@Text
	@HtmlField(cssPath =  "td:nth-child(41)")
	private String em010;

	@Text
	@HtmlField(cssPath =  "td:nth-child(42)")
	private String em014;

	@Text
	@HtmlField(cssPath =  "td:nth-child(43)")
	private String em28;

	@Text
	@HtmlField(cssPath =  "td:nth-child(44)")
	private String em42;

	@Text
	@HtmlField(cssPath =  "td:nth-child(45)")
	private String en07;

	@Text
	@HtmlField(cssPath =  "td:nth-child(46)")
	private String en10;

	@Text
	@HtmlField(cssPath =  "td:nth-child(47)")
	private String en14;

	@Text
	@HtmlField(cssPath =  "td:nth-child(48)")
	private String en28;

	@Text
	@HtmlField(cssPath =  "td:nth-child(49)")
	private String en42;

	public String getLbV12() {
		return lbV12;
	}

	public void setLbV12(String lbV12) {
		this.lbV12 = lbV12;
	}

	public String getLbV00() {
		return lbV00;
	}

	public void setLbV00(String lbV00) {
		this.lbV00 = lbV00;
	}

	public String getLbRe12() {
		return lbRe12;
	}

	public void setLbRe12(String lbRe12) {
		this.lbRe12 = lbRe12;
	}

	public String getLbRe00() {
		return lbRe00;
	}

	public void setLbRe00(String lbRe00) {
		this.lbRe00 = lbRe00;
	}

	public String getLbRi12() {
		return lbRi12;
	}

	public void setLbRi12(String lbRi12) {
		this.lbRi12 = lbRi12;
	}

	public String getLbRi00() {
		return lbRi00;
	}

	public void setLbRi00(String lbRi00) {
		this.lbRi00 = lbRi00;
	}

	public String getLsV12() {
		return lsV12;
	}

	public void setLsV12(String lsV12) {
		this.lsV12 = lsV12;
	}

	public String getLsV00() {
		return lsV00;
	}

	public void setLsV00(String lsV00) {
		this.lsV00 = lsV00;
	}

	public String getLsRe12() {
		return lsRe12;
	}

	public void setLsRe12(String lsRe12) {
		this.lsRe12 = lsRe12;
	}

	public String getLsRe00() {
		return lsRe00;
	}

	public void setLsRe00(String lsRe00) {
		this.lsRe00 = lsRe00;
	}

	public String getRootV12() {
		return rootV12;
	}

	public void setRootV12(String rootV12) {
		this.rootV12 = rootV12;
	}

	public String getRootV00() {
		return rootV00;
	}

	public void setRootV00(String rootV00) {
		this.rootV00 = rootV00;
	}

	public String getRootR12() {
		return rootR12;
	}

	public void setRootR12(String rootR12) {
		this.rootR12 = rootR12;
	}

	public String getRootR00() {
		return rootR00;
	}

	public void setRootR00(String rootR00) {
		this.rootR00 = rootR00;
	}

	public String getStemRe12() {
		return stemRe12;
	}

	public void setStemRe12(String stemRe12) {
		this.stemRe12 = stemRe12;
	}

	public String getStemRe00() {
		return stemRe00;
	}

	public void setStemRe00(String stemRe00) {
		this.stemRe00 = stemRe00;
	}

	public String getStemRi12() {
		return stemRi12;
	}

	public void setStemRi12(String stemRi12) {
		this.stemRi12 = stemRi12;
	}

	public String getStemRi00() {
		return stemRi00;
	}

	public void setStemRi00(String stemRi00) {
		this.stemRi00 = stemRi00;
	}

	public String getIn06() {
		return in06;
	}

	public void setIn06(String in06) {
		this.in06 = in06;
	}

	public String getIn30() {
		return in30;
	}

	public void setIn30(String in30) {
		this.in30 = in30;
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

	public String getLpL15() {
		return lpL15;
	}

	public void setLpL15(String lpL15) {
		this.lpL15 = lpL15;
	}

	public String getLpP15() {
		return lpP15;
	}

	public void setLpP15(String lpP15) {
		this.lpP15 = lpP15;
	}

	public String getLpL40() {
		return lpL40;
	}

	public void setLpL40(String lpL40) {
		this.lpL40 = lpL40;
	}

	public String getLpP40() {
		return lpP40;
	}

	public void setLpP40(String lpP40) {
		this.lpP40 = lpP40;
	}

	public String getLpL70() {
		return lpL70;
	}

	public void setLpL70(String lpL70) {
		this.lpL70 = lpL70;
	}

	public String getLp740() {
		return lp740;
	}

	public void setLp740(String lp740) {
		this.lp740 = lp740;
	}

	public String getOv01() {
		return ov01;
	}

	public void setOv01(String ov01) {
		this.ov01 = ov01;
	}

	public String getOv03() {
		return ov03;
	}

	public void setOv03(String ov03) {
		this.ov03 = ov03;
	}

	public String getOv05() {
		return ov05;
	}

	public void setOv05(String ov05) {
		this.ov05 = ov05;
	}

	public String getOv07() {
		return ov07;
	}

	public void setOv07(String ov07) {
		this.ov07 = ov07;
	}

	public String getEm07() {
		return em07;
	}

	public void setEm07(String em07) {
		this.em07 = em07;
	}

	public String getEm010() {
		return em010;
	}

	public void setEm010(String em010) {
		this.em010 = em010;
	}

	public String getEm014() {
		return em014;
	}

	public void setEm014(String em014) {
		this.em014 = em014;
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