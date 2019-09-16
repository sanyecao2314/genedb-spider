package com.novelbio.genedb.ncpgr;

import static org.junit.Assert.fail;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;


public class SiteInfoBean_tb4 implements HtmlBean {

	// 表四
	@Text
	@HtmlField(cssPath = "td:nth-child(1)")
	private String id;

	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String lmm;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String lr;

	@Text
	@HtmlField(cssPath = "td:nth-child(4) > a")
	private String trait;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String subpopulation;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String ls;

	@Text(own = false)
	@HtmlField(cssPath = "td:nth-child(7)")
	private String publication;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLmm() {
		return lmm;
	}

	public void setLmm(String lmm) {
		this.lmm = lmm;
	}

	public String getLr() {
		return lr;
	}

	public void setLr(String lr) {
		this.lr = lr;
	}

	public String getTrait() {
		return trait;
	}

	public void setTrait(String trait) {
		this.trait = trait;
	}

	public String getSubpopulation() {
		return subpopulation;
	}

	public void setSubpopulation(String subpopulation) {
		this.subpopulation = subpopulation;
	}

	public String getLs() {
		return ls;
	}

	public void setLs(String ls) {
		this.ls = ls;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

}
