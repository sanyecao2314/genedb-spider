package com.novelbio.gene.ricexpro.samplelist.part;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class RXPBean implements HtmlBean {
	@Text
	@HtmlField(cssPath = "td:nth-child(1)")
	private String id;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String data_set_id;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String elapsed_time;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String experiment_name;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String 	cy3_sample_name;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String 	cy5_sample_name;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String grc;
	
	
	@Text(own = false)
	@HtmlField(cssPath = "td:nth-child(8)")
	private String 	structureDevelopment;
	
	@Text(own = false)
	@HtmlField(cssPath = "td:nth-child(9)")
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

	public String getElapsed_time() {
		return elapsed_time;
	}

	public void setElapsed_time(String elapsed_time) {
		this.elapsed_time = elapsed_time;
	}

	public String getExperiment_name() {
		return experiment_name;
	}

	public void setExperiment_name(String experiment_name) {
		this.experiment_name = experiment_name;
	}

	public String getCy3_sample_name() {
		return cy3_sample_name;
	}

	public void setCy3_sample_name(String cy3_sample_name) {
		this.cy3_sample_name = cy3_sample_name;
	}

	public String getCy5_sample_name() {
		return cy5_sample_name;
	}

	public void setCy5_sample_name(String cy5_sample_name) {
		this.cy5_sample_name = cy5_sample_name;
	}

	public String getGrc() {
		return grc;
	}

	public void setGrc(String grc) {
		this.grc = grc;
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
