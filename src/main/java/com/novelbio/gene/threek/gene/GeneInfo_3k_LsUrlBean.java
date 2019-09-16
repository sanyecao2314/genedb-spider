package com.novelbio.gene.threek.gene;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;
import com.novelbio.gene.ricexpro.samplelist.RXP_002Bean;

@Gecco(matchUrl = "http://cgm.sjtu.edu.cn/3kricedb/gene-table.php?page={currPage}", timeout = 60000, pipelines = "geneInfo_3k_NextPagePipelines")
public class GeneInfo_3k_LsUrlBean implements HtmlBean {

	// 当前请求
	@Request
	private HttpRequest request;

	// 当前页
	@RequestParameter(value = "currPage")
	private int currPage;

	// 总页数
	private int totalPage = 340;

	// 页面数据
	// body > div.container > table > tbody > tr:nth-child(86) > td:nth-child(9) > a
	@HtmlField(cssPath = "body > div.container > table > tbody > tr:nth-child(1)")
	private List<GeneInfo_3k_UrlBean> geneInfoBeans;

	public List<GeneInfo_3k_UrlBean> getGeneInfoBeans() {
		return geneInfoBeans;
	}

	public void setGeneInfoBeans(List<GeneInfo_3k_UrlBean> geneInfoBeans) {
		this.geneInfoBeans = geneInfoBeans;
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
