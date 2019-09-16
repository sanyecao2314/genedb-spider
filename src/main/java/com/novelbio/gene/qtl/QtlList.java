package com.novelbio.gene.qtl;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://qtaro.abr.affrc.go.jp/qtab/table?page={page}", pipelines = {"qtlPipelines",
		"qtlResultPipelines" })
public class QtlList implements HtmlBean {
	private static final long serialVersionUID = 1L;

	@Request
	private HttpRequest request;

	@Text
	@HtmlField(cssPath = "#table_area > div > div.pagenation > span.current")
	private int currPage;

	private int totalPage = 53;

	// 页面数据

	@HtmlField(cssPath = "#table_area > table > tbody > tr:not(:first-child):not(:nth-child(2))")
	private List<QtlBean> qtls;

	public List<QtlBean> getQtls() {
		return qtls;
	}

	public void setQtls(List<QtlBean> qtls) {
		this.qtls = qtls;
	}

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

}
