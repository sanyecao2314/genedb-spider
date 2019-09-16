package com.novelbio.gene.gene;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;
import com.novelbio.gene.qtl.QtlBean;

/**
 * 主表格数据集合
 * 
 * @author novelbio
 *
 */

@Gecco(matchUrl = "http://qtaro.abr.affrc.go.jp/ogro/table?page={page}", pipelines = { "geneResultPipelines", "qtlPipelines" })
public class GeneList implements HtmlBean{
	// 当前请求
	@Request
	private HttpRequest request;

	// 当前页
	@Text
	@HtmlField(cssPath = "#table_area > div > div.pagenation > span.current")
	private int currPage;

	// 总页数
	private int totalPage = 98;
	
	// 页面数据
	@HtmlField(cssPath = "#table_area > table > tbody > tr:not(:first-child):not(:nth-child(2))")
	private List<GeneBean> geneBeans;

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

	public List<GeneBean> getGeneBeans() {
		return geneBeans;
	}

	public void setGeneBeans(List<GeneBean> geneBeans) {
		this.geneBeans = geneBeans;
	}

	
}
