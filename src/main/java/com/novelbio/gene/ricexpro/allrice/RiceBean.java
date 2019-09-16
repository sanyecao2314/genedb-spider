package com.novelbio.gene.ricexpro.allrice;

import com.geccocrawler.gecco.annotation.Attr;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;


public class RiceBean implements HtmlBean {
	@Text
	@HtmlField(cssPath = "td:nth-child(1) > span")
	private String locusID;
	
	@Attr(value = "rowspan")
	@HtmlField(cssPath = "td:nth-child(1)[rowspan]")
	private String locusIDNum;

	@Text
	@HtmlField(cssPath = "td:nth-child(3) > a")
	private String featureNum;
	
	
	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String accession;
	
	@Text(own = false)
	@HtmlField(cssPath = "td:nth-child(6)")
	private String sequenceID;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(7) > span")
	private String description;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(8) > a")
	private String msuID;

	public String getLocusID() {
		return locusID;
	}

	public void setLocusID(String locusID) {
		this.locusID = locusID;
	}

	public String getFeatureNum() {
		return featureNum;
	}

	public void setFeatureNum(String featureNum) {
		this.featureNum = featureNum;
	}

	public String getAccession() {
		return accession;
	}

	public void setAccession(String accession) {
		this.accession = accession;
	}

	public String getSequenceID() {
		return sequenceID;
	}

	public void setSequenceID(String sequenceID) {
		this.sequenceID = sequenceID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMsuID() {
		return msuID;
	}

	public void setMsuID(String msuID) {
		this.msuID = msuID;
	}

	public String getLocusIDNum() {
		return locusIDNum;
	}

	public void setLocusIDNum(String locusIDNum) {
		this.locusIDNum = locusIDNum;
	}
	
	
}
