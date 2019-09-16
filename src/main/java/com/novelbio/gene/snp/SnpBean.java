package com.novelbio.gene.snp;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * 主表格数据bean
 * 
 * @author novelbio
 *
 */
public class SnpBean implements HtmlBean {
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
	private String ausR;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String ausA;


	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String indicaR;

	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String indicaA;

	@Text
	@HtmlField(cssPath = "td:nth-child(14)")
	private String tropicalJaponicaR;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(15)")
	private String tropicalJaponicaA;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(16)")
	private String temperateJaponicaR;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(17)")
	private String temperateJaponicaA;

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

	public String getAusA() {
		return ausA;
	}

	public void setAusA(String ausA) {
		this.ausA = ausA;
	}


	public String getAusR() {
		return ausR;
	}

	public void setAusR(String ausR) {
		this.ausR = ausR;
	}

	public String getIndicaR() {
		return indicaR;
	}

	public void setIndicaR(String indicaR) {
		this.indicaR = indicaR;
	}

	public String getIndicaA() {
		return indicaA;
	}

	public void setIndicaA(String indicaA) {
		this.indicaA = indicaA;
	}

	public String getTropicalJaponicaR() {
		return tropicalJaponicaR;
	}

	public void setTropicalJaponicaR(String tropicalJaponicaR) {
		this.tropicalJaponicaR = tropicalJaponicaR;
	}

	public String getTropicalJaponicaA() {
		return tropicalJaponicaA;
	}

	public void setTropicalJaponicaA(String tropicalJaponicaA) {
		this.tropicalJaponicaA = tropicalJaponicaA;
	}

	public String getTemperateJaponicaR() {
		return temperateJaponicaR;
	}

	public void setTemperateJaponicaR(String temperateJaponicaR) {
		this.temperateJaponicaR = temperateJaponicaR;
	}

	public String getTemperateJaponicaA() {
		return temperateJaponicaA;
	}

	public void setTemperateJaponicaA(String temperateJaponicaA) {
		this.temperateJaponicaA = temperateJaponicaA;
	}
	
	
}
