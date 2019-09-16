package com.novelbio.gene.threek.codeinfo;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://cgm.sjtu.edu.cn/3kricedb/searchByRice.php?code={code}", timeout = 60000, pipelines = {
		"consolePipeline", "statisticsPipelines" })
public class StatisticsBean implements HtmlBean {
	@Text
	@HtmlField(cssPath = "body > div.container > table > tbody > tr > td:nth-child(12)")
	private String highQuality;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(1) > td")
	private String total;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(2) > td")
	private String core;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(3) > td")
	private String candidate;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(4) > td")
	private String distributed;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(5) > td")
	private String unbalanced;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(6) > td")
	private String inDominant;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(7) > td")
	private String jpDominant;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(8) > td")
	private String subSpecific;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(9) > td")
	private String inSpecific;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(10) > td")
	private String japSpecific;
	
	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(11) > td")
	private String ausSpecific;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(12) > td")
	private String aroSpecific;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(13) > td")
	private String subgroup;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(14) > td")
	private String inSubgroup;

	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(15) > td")
	private String japSubgroup;
	
	@Text
	@HtmlField(cssPath = "#stat > table > tbody > tr:nth-child(16) > td")
	private String random;

	public String getHighQuality() {
		return highQuality;
	}

	public void setHighQuality(String highQuality) {
		this.highQuality = highQuality;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}

	public String getCandidate() {
		return candidate;
	}

	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}

	public String getDistributed() {
		return distributed;
	}

	public void setDistributed(String distributed) {
		this.distributed = distributed;
	}

	public String getUnbalanced() {
		return unbalanced;
	}

	public void setUnbalanced(String unbalanced) {
		this.unbalanced = unbalanced;
	}

	public String getInDominant() {
		return inDominant;
	}

	public void setInDominant(String inDominant) {
		this.inDominant = inDominant;
	}

	public String getJpDominant() {
		return jpDominant;
	}

	public void setJpDominant(String jpDominant) {
		this.jpDominant = jpDominant;
	}

	public String getSubSpecific() {
		return subSpecific;
	}

	public void setSubSpecific(String subSpecific) {
		this.subSpecific = subSpecific;
	}

	public String getInSpecific() {
		return inSpecific;
	}

	public void setInSpecific(String inSpecific) {
		this.inSpecific = inSpecific;
	}

	public String getJapSpecific() {
		return japSpecific;
	}

	public void setJapSpecific(String japSpecific) {
		this.japSpecific = japSpecific;
	}

	public String getAusSpecific() {
		return ausSpecific;
	}

	public void setAusSpecific(String ausSpecific) {
		this.ausSpecific = ausSpecific;
	}

	public String getAroSpecific() {
		return aroSpecific;
	}

	public void setAroSpecific(String aroSpecific) {
		this.aroSpecific = aroSpecific;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	public String getInSubgroup() {
		return inSubgroup;
	}

	public void setInSubgroup(String inSubgroup) {
		this.inSubgroup = inSubgroup;
	}

	public String getJapSubgroup() {
		return japSubgroup;
	}

	public void setJapSubgroup(String japSubgroup) {
		this.japSubgroup = japSubgroup;
	}

	public String getRandom() {
		return random;
	}

	public void setRandom(String random) {
		this.random = random;
	}
	
	

}
