package com.novelbio.genedb.ncpgr;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;


public class SiteInfoBean_tb2 implements HtmlBean{
	
	//表二内容
	
	@Text
	@HtmlField(cssPath = "td:nth-child(1)")
	private String populations;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String popuSize;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String fC;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String fA;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String fN;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String fDEL;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String allele;

	public String getPopulations() {
		return populations;
	}

	public void setPopulations(String populations) {
		this.populations = populations;
	}

	public String getPopuSize() {
		return popuSize;
	}

	public void setPopuSize(String popuSize) {
		this.popuSize = popuSize;
	}

	public String getfC() {
		return fC;
	}

	public void setfC(String fC) {
		this.fC = fC;
	}

	public String getfA() {
		return fA;
	}

	public void setfA(String fA) {
		this.fA = fA;
	}

	public String getfN() {
		return fN;
	}

	public void setfN(String fN) {
		this.fN = fN;
	}

	public String getfDEL() {
		return fDEL;
	}

	public void setfDEL(String fDEL) {
		this.fDEL = fDEL;
	}

	public String getAllele() {
		return allele;
	}

	public void setAllele(String allele) {
		this.allele = allele;
	}

	
	
}
