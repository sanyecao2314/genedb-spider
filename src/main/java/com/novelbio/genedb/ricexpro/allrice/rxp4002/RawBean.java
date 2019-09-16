package com.novelbio.genedb.ricexpro.allrice.rxp4002;

import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class RawBean implements HtmlBean {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Text
	@HtmlField(cssPath = "th")
	private String rep;

	@Text
	@HtmlField(cssPath = "td:nth-child(2)")
	private String t2 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(3)")
	private String t3 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(4)")
	private String t4 ;

	@Text
	@HtmlField(cssPath = "td:nth-child(5)")
	private String s3a ;

	@Text
	@HtmlField(cssPath = "td:nth-child(6)")
	private String s3b ;

	@Text
	@HtmlField(cssPath = "td:nth-child(7)")
	private String s3v ;

	@Text
	@HtmlField(cssPath = "td:nth-child(8)")
	private String s3d ;

	public String getRep() {
		return rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getT2() {
		return t2;
	}

	public void setT2(String t2) {
		this.t2 = t2;
	}

	public String getT3() {
		return t3;
	}

	public void setT3(String t3) {
		this.t3 = t3;
	}

	public String getT4() {
		return t4;
	}

	public void setT4(String t4) {
		this.t4 = t4;
	}

	public String getS3a() {
		return s3a;
	}

	public void setS3a(String s3a) {
		this.s3a = s3a;
	}

	public String getS3b() {
		return s3b;
	}

	public void setS3b(String s3b) {
		this.s3b = s3b;
	}

	public String getS3v() {
		return s3v;
	}

	public void setS3v(String s3v) {
		this.s3v = s3v;
	}

	public String getS3d() {
		return s3d;
	}

	public void setS3d(String s3d) {
		this.s3d = s3d;
	}

	
}
