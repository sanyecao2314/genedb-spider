package com.novelbio.gene.qtl;

import java.util.Map;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://qtaro.abr.affrc.go.jp/qtab/entry/show/{id}", pipelines = {"consolePipeline", "qtlEntryResultPipelines"})
public class QtlEntry implements HtmlBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Text
	@HtmlField(cssPath = "tbody > tr:nth-child(2) > td:nth-child(2)")
	private String id;

	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(3) > td:nth-child(2)")
	private String qtl;

	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(4) > td:nth-child(2)")
	private String major;

	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(5) > td:nth-child(2)")
	private String objectCharacter;

	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(6) > td:nth-child(2)")
	private String character;

	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(7) > td:nth-child(2)")
	private String marker;

	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(8) > td:nth-child(2)")
	private String determination;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(9) > td:nth-child(2)")
	private String chr;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(10) > td:nth-child(2)")
	private String startGenome;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(11) > td:nth-child(2)")
	private String endGenome;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(12) > td:nth-child(2)")
	private String genomeView;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(13) > td:nth-child(2)")
	private String mappingMethod;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(14) > td:nth-child(2)")
	private String population;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(15) > td:nth-child(2)")
	private String noPlants;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(16) > td:nth-child(2)")
	private String lod;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(17) > td:nth-child(2)")
	private String parentA;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(18) > td:nth-child(2)")
	private String parentB;
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(19) > td:nth-child(2)")
	private String direction;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(20) > td:nth-child(2)")
	private String referenceSource;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(21) > td:nth-child(2) > a")
	private String referenceNo;
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(22) > td:nth-child(2)")
	private String physical;

	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(23) > td:nth-child(2)")
	private String fine1;
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(24) > td:nth-child(2)")
	private String fine2;
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(25) > td:nth-child(2)")
	private String fine3;
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(26) > td:nth-child(2)")
	private String interval1;

	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(27) > td:nth-child(2)")
	private String interval2;
	
	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(28) > td:nth-child(2)")
	private String interval3;

	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(29) > td:nth-child(2)")
	private String coSegregated;

	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(30) > td:nth-child(2)")
	private String explained;

	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(31) > td:nth-child(2)")
	private String additive;

	@Text
	@HtmlField(cssPath = "table > tbody > tr:nth-child(32) > td:nth-child(2)")
	private String year;

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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getObjectCharacter() {
		return objectCharacter;
	}

	public void setObjectCharacter(String objectCharacter) {
		this.objectCharacter = objectCharacter;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getMarker() {
		return marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}

	public String getDetermination() {
		return determination;
	}

	public void setDetermination(String determination) {
		this.determination = determination;
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

	public String getGenomeView() {
		return genomeView;
	}

	public void setGenomeView(String genomeView) {
		this.genomeView = genomeView;
	}

	public String getMappingMethod() {
		return mappingMethod;
	}

	public void setMappingMethod(String mappingMethod) {
		this.mappingMethod = mappingMethod;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getNoPlants() {
		return noPlants;
	}

	public void setNoPlants(String noPlants) {
		this.noPlants = noPlants;
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

	public String getPhysical() {
		return physical;
	}

	public void setPhysical(String physical) {
		this.physical = physical;
	}

	public String getFine1() {
		return fine1;
	}

	public void setFine1(String fine1) {
		this.fine1 = fine1;
	}

	public String getFine2() {
		return fine2;
	}

	public void setFine2(String fine2) {
		this.fine2 = fine2;
	}

	public String getFine3() {
		return fine3;
	}

	public void setFine3(String fine3) {
		this.fine3 = fine3;
	}

	public String getInterval1() {
		return interval1;
	}

	public void setInterval1(String interval1) {
		this.interval1 = interval1;
	}

	public String getInterval2() {
		return interval2;
	}

	public void setInterval2(String interval2) {
		this.interval2 = interval2;
	}

	public String getInterval3() {
		return interval3;
	}

	public void setInterval3(String interval3) {
		this.interval3 = interval3;
	}

	public String getCoSegregated() {
		return coSegregated;
	}

	public void setCoSegregated(String coSegregated) {
		this.coSegregated = coSegregated;
	}

	public String getExplained() {
		return explained;
	}

	public void setExplained(String explained) {
		this.explained = explained;
	}

	public String getAdditive() {
		return additive;
	}

	public void setAdditive(String additive) {
		this.additive = additive;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	

}
