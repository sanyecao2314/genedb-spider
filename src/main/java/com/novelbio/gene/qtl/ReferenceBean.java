package com.novelbio.gene.qtl;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://qtaro.abr.affrc.go.jp/qtab/ref/detail/pha%3A{referenceNo}", pipelines = { "consolePipeline", "referencePipelines" })
public class ReferenceBean implements HtmlBean {
	@Text
	@HtmlField(cssPath = "body > div > table > tbody > tr:nth-child(1) > td")
	private String journal;

	@Text
	@HtmlField(cssPath = "body > div > table > tbody > tr:nth-child(2) > td")
	private String number;

	@Text
	@HtmlField(cssPath = "body > div > table > tbody > tr:nth-child(3) > td")
	private String reference;
	
	@Text
	@HtmlField(cssPath = "body > div > table > tbody > tr:nth-child(4) > td")
	private String abstrac;
	
	@Text
	@HtmlField(cssPath = "body > div > table > tbody > tr:nth-child(5) > td")
	private String location;

	public String getJournal() {
		return journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getAbstrac() {
		return abstrac;
	}

	public void setAbstrac(String abstrac) {
		this.abstrac = abstrac;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	
}
