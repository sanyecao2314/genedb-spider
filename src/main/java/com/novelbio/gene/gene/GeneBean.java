package com.novelbio.gene.gene;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * 主表格数据bean
 * @author novelbio
 *
 */
public class GeneBean implements HtmlBean{
	@Text
	@HtmlField(cssPath = "td:nth-child(1) > a")
	private String id;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String gene;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String geneSymbol;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String 	majorCategory;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String 	objectCharacter;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(6) > a")
	private String 	chr;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(7) > a")
	private String 	genomeStart;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(8) > a")
	private String 	genomeEnd;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String 	locusID;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String 	isolationMethod ;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String 	objectiveCharacter;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(13)")
	private String 	reference;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGene() {
		return gene;
	}

	public void setGene(String gene) {
		this.gene = gene;
	}

	public String getGeneSymbol() {
		return geneSymbol;
	}

	public void setGeneSymbol(String geneSymbol) {
		this.geneSymbol = geneSymbol;
	}

	public String getMajorCategory() {
		return majorCategory;
	}

	public void setMajorCategory(String majorCategory) {
		this.majorCategory = majorCategory;
	}

	public String getObjectCharacter() {
		return objectCharacter;
	}

	public void setObjectCharacter(String objectCharacter) {
		this.objectCharacter = objectCharacter;
	}

	public String getChr() {
		return chr;
	}

	public void setChr(String chr) {
		this.chr = chr;
	}

	public String getGenomeStart() {
		return genomeStart;
	}

	public void setGenomeStart(String genomeStart) {
		this.genomeStart = genomeStart;
	}

	public String getGenomeEnd() {
		return genomeEnd;
	}

	public void setGenomeEnd(String genomeEnd) {
		this.genomeEnd = genomeEnd;
	}

	public String getLocusID() {
		return locusID;
	}

	public void setLocusID(String locusID) {
		this.locusID = locusID;
	}

	public String getIsolationMethod() {
		return isolationMethod;
	}

	public void setIsolationMethod(String isolationMethod) {
		this.isolationMethod = isolationMethod;
	}

	public String getObjectiveCharacter() {
		return objectiveCharacter;
	}

	public void setObjectiveCharacter(String objectiveCharacter) {
		this.objectiveCharacter = objectiveCharacter;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	
	
}
