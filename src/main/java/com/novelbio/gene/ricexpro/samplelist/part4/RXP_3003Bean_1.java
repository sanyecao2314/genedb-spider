package com.novelbio.gene.ricexpro.samplelist.part4;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class RXP_3003Bean_1 implements HtmlBean {
	@Text
	@HtmlField(cssPath = "td:nth-child(1)")
	private String no;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String data_set_id;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String sampleName;
	
	
	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String rice;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String treatment;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String 	time;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String 	exp_No;

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

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getExp_No() {
		return exp_No;
	}

	public void setExp_No(String exp_No) {
		this.exp_No = exp_No;
	}
	
}
