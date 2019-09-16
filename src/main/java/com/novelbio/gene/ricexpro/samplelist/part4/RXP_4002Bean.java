package com.novelbio.gene.ricexpro.samplelist.part4;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class RXP_4002Bean implements HtmlBean {
	@Text
	@HtmlField(cssPath = "td:nth-child(1)")
	private String no;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String sub_dataset;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String id;
	
	
	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String sampleID;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String slideID;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String 	positionID	;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getSub_dataset() {
		return sub_dataset;
	}

	public void setSub_dataset(String sub_dataset) {
		this.sub_dataset = sub_dataset;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSampleID() {
		return sampleID;
	}

	public void setSampleID(String sampleID) {
		this.sampleID = sampleID;
	}

	public String getSlideID() {
		return slideID;
	}

	public void setSlideID(String slideID) {
		this.slideID = slideID;
	}

	public String getPositionID() {
		return positionID;
	}

	public void setPositionID(String positionID) {
		this.positionID = positionID;
	}
	
}
