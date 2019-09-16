package com.novelbio.gene.snpjapan;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;
import com.novelbio.gene.gene.GeneBean;

/**
 * 主表的数据集合
 * @author novelbio
 *
 */
@Gecco(matchUrl = "http://qtaro.abr.affrc.go.jp/qsnp/jsnp?page={page}", pipelines = { "snpJanpanResultPipelines", "snpJapanNextPagePipelines" })
public class SnpJapanList implements HtmlBean {
	// 当前请求
	@Request
	private HttpRequest request;

	// 当前页
	@Text
	@HtmlField(cssPath = "#table_area > div.footer > div.pagenation > span.current")
	private int currPage;

	// 总页数
	private int totalPage = 163;

	// 页面数据
	@HtmlField(cssPath = "#table_area > table > tbody > tr:not(.row_hide)")
	private List<SnpJapanBean> snpBeans;

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

	public List<SnpJapanBean> getSnpBeans() {
		return snpBeans;
	}

	public void setSnpBeans(List<SnpJapanBean> snpBeans) {
		this.snpBeans = snpBeans;
	}

	
	
}
