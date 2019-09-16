package com.novelbio.gene.ricexpro.samplelist.part4;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class RXP_5002Bean implements HtmlBean {
	@Text
	@HtmlField(cssPath = "td:nth-child(1)")
	private String id;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String data_set_id;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String sample_id;
	
	
	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String sample_name;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String treatment;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String exposed_time;
	
	@Text(own = false)
	@HtmlField(cssPath = "td:nth-child(7)")
	private String 	structureDevelopment;
	
	@Text(own = false)
	@HtmlField(cssPath = "td:nth-child(8)")
	private String 	anatomicalEntity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getData_set_id() {
		return data_set_id;
	}

	public void setData_set_id(String data_set_id) {
		this.data_set_id = data_set_id;
	}

	public String getSample_id() {
		return sample_id;
	}

	public void setSample_id(String sample_id) {
		this.sample_id = sample_id;
	}

	public String getSample_name() {
		return sample_name;
	}

	public void setSample_name(String sample_name) {
		this.sample_name = sample_name;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getExposed_time() {
		return exposed_time;
	}

	public void setExposed_time(String exposed_time) {
		this.exposed_time = exposed_time;
	}

	public String getStructureDevelopment() {
		return structureDevelopment;
	}

	public void setStructureDevelopment(String structureDevelopment) {
		this.structureDevelopment = structureDevelopment;
	}

	public String getAnatomicalEntity() {
		return anatomicalEntity;
	}

	public void setAnatomicalEntity(String anatomicalEntity) {
		this.anatomicalEntity = anatomicalEntity;
	}
}
