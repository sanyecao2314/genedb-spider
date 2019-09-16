package com.novelbio.gene.gene;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * 基因详情bean
 * @author novelbio
 *
 */

@Gecco(matchUrl = "http://qtaro.abr.affrc.go.jp/ogro/entry/show/{id}", pipelines = {"entryResultPipelines"})
public class EntryBean implements HtmlBean{
	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(2) > td:nth-child(2)")
	private String id;
	
	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(3) > td:nth-child(2)")
	private String gene;
	
	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(4) > td:nth-child(2)")
	private String geneSymbol;
	
	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(5) > td:nth-child(2)")
	private String majorCategory;
	
	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(6) > td:nth-child(2)")
	private String objectCharacter;
	
	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(7) > td:nth-child(2)")
	private String chr;
	
	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(8) > td:nth-child(2)")
	private String genomeStart;
	
	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(9) > td:nth-child(2)")
	private String genomeEnd;
	
	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(10) > td:nth-child(2)")
	private String genomeView;
	
	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(11) > td:nth-child(2)")
	private String isolationMethod;
	
	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(12) > td:nth-child(2)")
	private String character;
	
	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(13) > td:nth-child(2)")
	private String reference;

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

	public String getGenomeView() {
		return genomeView;
	}

	public void setGenomeView(String genomeView) {
		this.genomeView = genomeView;
	}

	public String getIsolationMethod() {
		return isolationMethod;
	}

	public void setIsolationMethod(String isolationMethod) {
		this.isolationMethod = isolationMethod;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	
	
}
