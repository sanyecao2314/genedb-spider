package com.novelbio.gene.ricexpro.samplelist;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class RXP_001Bean implements HtmlBean {
	@Text
	@HtmlField(cssPath = "td:nth-child(1)")
	private String no;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String data_set_id;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String sample_id;
	
	
	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String sampling_details;
	
	
	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String growth_stage;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String cultivar;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String 	cRNA_QTY;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String grc;
	
	@Text(own = false)
	@HtmlField(cssPath = "td:nth-child(9)")
	private String structureDevelopment;
	
	@Text(own = false)
	@HtmlField(cssPath = "td:nth-child(10)")
	private String 	anatomicalEntity;
	

	public String getNo() {
		return no;
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

	public String getSampling_details() {
		return sampling_details;
	}

	public void setSampling_details(String sampling_details) {
		this.sampling_details = sampling_details;
	}

	public String getGrowth_stage() {
		return growth_stage;
	}

	public void setGrowth_stage(String growth_stage) {
		this.growth_stage = growth_stage;
	}

	public String getCultivar() {
		return cultivar;
	}

	public void setCultivar(String cultivar) {
		this.cultivar = cultivar;
	}

	public String getcRNA_QTY() {
		return cRNA_QTY;
	}

	public void setcRNA_QTY(String cRNA_QTY) {
		this.cRNA_QTY = cRNA_QTY;
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

	public void setNo(String no) {
		this.no = no;
	}

	
	
	
	
}
