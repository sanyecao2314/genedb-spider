package com.novelbio.gene.snpjapan;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * 主表格数据bean
 * 
 * @author novelbio
 *
 */
public class SnpJapanBean implements HtmlBean {
	@Text
	@HtmlField(cssPath = "td:nth-child(1)")
	private String id;

	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String snpName;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String source;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String chr;

	@Text
	@HtmlField(cssPath = "td:nth-child(5) > a")
	private String build4;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String build5;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String irgSP;

	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String alleleR;

	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String alleleA;

	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String uplandR;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String uplandA;

	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String lowlandGroup1R;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String lowlandGroup1A;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(14)")
	private String lowlandGroup2R;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(15)")
	private String lowlandGroup2A;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(16)")
	private String lowlandGroup3R;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(17)")
	private String lowlandGroup3A;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSnpName() {
		return snpName;
	}

	public void setSnpName(String snpName) {
		this.snpName = snpName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getChr() {
		return chr;
	}

	public void setChr(String chr) {
		this.chr = chr;
	}

	public String getBuild4() {
		return build4;
	}

	public void setBuild4(String build4) {
		this.build4 = build4;
	}

	public String getBuild5() {
		return build5;
	}

	public void setBuild5(String build5) {
		this.build5 = build5;
	}

	public String getIrgSP() {
		return irgSP;
	}

	public void setIrgSP(String irgSP) {
		this.irgSP = irgSP;
	}

	public String getAlleleR() {
		return alleleR;
	}

	public void setAlleleR(String alleleR) {
		this.alleleR = alleleR;
	}

	public String getAlleleA() {
		return alleleA;
	}

	public void setAlleleA(String alleleA) {
		this.alleleA = alleleA;
	}

	public String getUplandR() {
		return uplandR;
	}

	public void setUplandR(String uplandR) {
		this.uplandR = uplandR;
	}

	public String getUplandA() {
		return uplandA;
	}

	public void setUplandA(String uplandA) {
		this.uplandA = uplandA;
	}

	public String getLowlandGroup1R() {
		return lowlandGroup1R;
	}

	public void setLowlandGroup1R(String lowlandGroup1R) {
		this.lowlandGroup1R = lowlandGroup1R;
	}

	public String getLowlandGroup1A() {
		return lowlandGroup1A;
	}

	public void setLowlandGroup1A(String lowlandGroup1A) {
		this.lowlandGroup1A = lowlandGroup1A;
	}

	public String getLowlandGroup2R() {
		return lowlandGroup2R;
	}

	public void setLowlandGroup2R(String lowlandGroup2R) {
		this.lowlandGroup2R = lowlandGroup2R;
	}

	public String getLowlandGroup2A() {
		return lowlandGroup2A;
	}

	public void setLowlandGroup2A(String lowlandGroup2A) {
		this.lowlandGroup2A = lowlandGroup2A;
	}

	public String getLowlandGroup3R() {
		return lowlandGroup3R;
	}

	public void setLowlandGroup3R(String lowlandGroup3R) {
		this.lowlandGroup3R = lowlandGroup3R;
	}

	public String getLowlandGroup3A() {
		return lowlandGroup3A;
	}

	public void setLowlandGroup3A(String lowlandGroup3A) {
		this.lowlandGroup3A = lowlandGroup3A;
	}

	
}
