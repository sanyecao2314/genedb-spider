package com.novelbio.genedb.ncpgr;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;


public class SiteInfoBean_tb3 implements HtmlBean{
	
	//表三
	@Text
	@HtmlField(cssPath = "td:nth-child(1)")
	private String vid;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String var;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(3) > a")
	private String locus;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String snpEff;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String cooVar;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String caScore;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String cEffect ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String cscore;

	public String getVid() {
		return vid;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public String getLocus() {
		return locus;
	}

	public void setLocus(String locus) {
		this.locus = locus;
	}

	public String getSnpEff() {
		return snpEff;
	}

	public void setSnpEff(String snpEff) {
		this.snpEff = snpEff;
	}

	public String getCooVar() {
		return cooVar;
	}

	public void setCooVar(String cooVar) {
		this.cooVar = cooVar;
	}

	public String getCaScore() {
		return caScore;
	}

	public void setCaScore(String caScore) {
		this.caScore = caScore;
	}

	public String getcEffect() {
		return cEffect;
	}

	public void setcEffect(String cEffect) {
		this.cEffect = cEffect;
	}

	public String getCscore() {
		return cscore;
	}

	public void setCscore(String cscore) {
		this.cscore = cscore;
	}
	
}
