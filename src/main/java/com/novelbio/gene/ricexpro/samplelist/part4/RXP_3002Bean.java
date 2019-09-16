package com.novelbio.gene.ricexpro.samplelist.part4;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class RXP_3002Bean implements HtmlBean {
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
	private String time;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String treatment;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String 	cRNA_QTY	;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getcRNA_QTY() {
		return cRNA_QTY;
	}

	public void setcRNA_QTY(String cRNA_QTY) {
		this.cRNA_QTY = cRNA_QTY;
	}
}
