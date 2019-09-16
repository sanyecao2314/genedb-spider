package com.novelbio.gene.qtl;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;



public class QtlBean implements HtmlBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1653210719740575690L;

	@Text
	@HtmlField(cssPath = "td:nth-child(1) > a")
	private String id;

	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String qtl;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String majorCategory;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String character;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String position;

	@Text
	@HtmlField(cssPath = "td:nth-child(6) > a")
	private String chr;

	@Text
	@HtmlField(cssPath = "td:nth-child(7) > a")
	private String startGenome;

	@Text
	@HtmlField(cssPath = "td:nth-child(8) > a")
	private String endGenome;

	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String mappingMethod;

	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String lod;

	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String parentA;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String parentB;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(14)")
	private String direction;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(15)")
	private String referenceSource;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(16) > a")
	private String referenceNo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQtl() {
		return qtl;
	}

	public void setQtl(String qtl) {
		this.qtl = qtl;
	}

	public String getMajorCategory() {
		return majorCategory;
	}

	public void setMajorCategory(String majorCategory) {
		this.majorCategory = majorCategory;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getChr() {
		return chr;
	}

	public void setChr(String chr) {
		this.chr = chr;
	}

	public String getStartGenome() {
		return startGenome;
	}

	public void setStartGenome(String startGenome) {
		this.startGenome = startGenome;
	}

	public String getEndGenome() {
		return endGenome;
	}

	public void setEndGenome(String endGenome) {
		this.endGenome = endGenome;
	}

	public String getMappingMethod() {
		return mappingMethod;
	}

	public void setMappingMethod(String mappingMethod) {
		this.mappingMethod = mappingMethod;
	}

	public String getLod() {
		return lod;
	}

	public void setLod(String lod) {
		this.lod = lod;
	}

	public String getParentA() {
		return parentA;
	}

	public void setParentA(String parentA) {
		this.parentA = parentA;
	}

	public String getParentB() {
		return parentB;
	}

	public void setParentB(String parentB) {
		this.parentB = parentB;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getReferenceSource() {
		return referenceSource;
	}

	public void setReferenceSource(String referenceSource) {
		this.referenceSource = referenceSource;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}
	
}
