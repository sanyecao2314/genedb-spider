package com.novelbio.genedb.ricexpro.allrice.rxp5002;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class NormalizedBean implements HtmlBean {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Text
	@HtmlField(cssPath = "th")
	private String rep;
	
	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String h6c ;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String h6n ;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String h6p ;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String h6k ;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String h24c ;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String h24n ;

	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String h24p ;

	@Text
	@HtmlField(cssPath = "td:nth-child(9)")
	private String h24k ;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getH6c() {
		return h6c;
	}

	public void setH6c(String h6c) {
		this.h6c = h6c;
	}

	public String getH6n() {
		return h6n;
	}

	public void setH6n(String h6n) {
		this.h6n = h6n;
	}

	public String getH6p() {
		return h6p;
	}

	public void setH6p(String h6p) {
		this.h6p = h6p;
	}

	public String getH6k() {
		return h6k;
	}

	public void setH6k(String h6k) {
		this.h6k = h6k;
	}

	public String getH24c() {
		return h24c;
	}

	public void setH24c(String h24c) {
		this.h24c = h24c;
	}

	public String getH24n() {
		return h24n;
	}

	public void setH24n(String h24n) {
		this.h24n = h24n;
	}

	public String getH24p() {
		return h24p;
	}

	public void setH24p(String h24p) {
		this.h24p = h24p;
	}

	public String getH24k() {
		return h24k;
	}

	public void setH24k(String h24k) {
		this.h24k = h24k;
	}


}
