package com.novelbio.genedb.ricexpro.allrice;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/{RXP}/gene-search.php?page={currPage}", timeout = 400000, pipelines = {
		"riceResultPipelines"})
public class RiceBeanList implements HtmlBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 当前请求
	@Request
	private HttpRequest currRequest;

	// 参数值
	@RequestParameter(value = "RXP")
	private String rxp;

	// 当前页
	@RequestParameter(value = "currPage")
	private int currPage;

	// 总页数
	private int totalPage = 278;

	// 页面数据
	@HtmlField(cssPath = "#result > table > tbody > tr:not(:first-child)")
	private List<RiceBean> riceBeans;

	@HtmlField(cssPath = "#result > table > tbody > tr:not(:first-child)")
	private List<RiceSpecBean> riceSpecBeans;

	public HttpRequest getCurrRequest() {
		return currRequest;
	}

	public void setCurrRequest(HttpRequest currRequest) {
		this.currRequest = currRequest;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<RiceBean> getRiceBeans() {
		return riceBeans;
	}

	public void setRiceBeans(List<RiceBean> riceBeans) {
		this.riceBeans = riceBeans;
	}

	public String getRxp() {
		return rxp;
	}

	public void setRxp(String rxp) {
		this.rxp = rxp;
	}

	public List<RiceSpecBean> getRiceSpecBeans() {
		return riceSpecBeans;
	}

	public void setRiceSpecBeans(List<RiceSpecBean> riceSpecBeans) {
		this.riceSpecBeans = riceSpecBeans;
	}
	
	
}
