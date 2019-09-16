package com.novelbio.gene.ricexpro.allrice;

import java.util.List;

import com.geccocrawler.gecco.annotation.Attr;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;
import com.novelbio.gene.snp.SnpBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/{RXP}/gene-search.php?page={currPage}", timeout = 120000, pipelines = {"riceResultPipelines", "riceNextPagePipelines"})
public class RiceBeanList implements HtmlBean {
	// 当前请求
	@Request
	private HttpRequest request;
	
	//参数值
	@RequestParameter(value = "RXP")
	private String rxp;

	// 当前页
	@Attr(value="value")
	@HtmlField(cssPath = "#link-page")
	private int currPage;

	// 总页数
	private int totalPage = 278;

	// 页面数据
	@HtmlField(cssPath = "#result > table > tbody > tr:not(:first-child)")
	private List<RiceBean> riceBeans;
	
	@HtmlField(cssPath = "#result > table > tbody > tr:not(:first-child)")
	private List<RiceSpecBean> riceSpecBeans;

	public HttpRequest getRequest() {
		return request;
	}

	public void setRequest(HttpRequest request) {
		this.request = request;
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
