package com.novelbio.gene.threek.accessions;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;


public class Rice_3kBean implements HtmlBean{
	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String id;

	@HtmlField(cssPath = "td:nth-child(3) > a")
	private String code;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String name;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String metaSubspecies;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String snpSubspecies;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String snpSubgroup;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String country;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String region;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(10)")
	private String sequencingDepth;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(11)")
	private String mappingDepth;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(12)")
	private String mappingCoverage;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMetaSubspecies() {
		return metaSubspecies;
	}

	public void setMetaSubspecies(String metaSubspecies) {
		this.metaSubspecies = metaSubspecies;
	}

	public String getSnpSubspecies() {
		return snpSubspecies;
	}

	public void setSnpSubspecies(String snpSubspecies) {
		this.snpSubspecies = snpSubspecies;
	}

	public String getSnpSubgroup() {
		return snpSubgroup;
	}

	public void setSnpSubgroup(String snpSubgroup) {
		this.snpSubgroup = snpSubgroup;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSequencingDepth() {
		return sequencingDepth;
	}

	public void setSequencingDepth(String sequencingDepth) {
		this.sequencingDepth = sequencingDepth;
	}

	public String getMappingDepth() {
		return mappingDepth;
	}

	public void setMappingDepth(String mappingDepth) {
		this.mappingDepth = mappingDepth;
	}

	public String getMappingCoverage() {
		return mappingCoverage;
	}

	public void setMappingCoverage(String mappingCoverage) {
		this.mappingCoverage = mappingCoverage;
	}
	
	
	

	
	
}
