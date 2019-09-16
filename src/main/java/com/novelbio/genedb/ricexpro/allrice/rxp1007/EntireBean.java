package com.novelbio.genedb.ricexpro.allrice.rxp1007;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_1007/view-plot-data.php?featurenum={FeatureNum}", timeout = 2400000, pipelines = "rxp1007SignalPipelines")
public class EntireBean implements HtmlBean {

	// 当前请求
	@Request
	private HttpRequest currRequest;

	// 参数值
	private String rxp = "RXP_1007";

	@RequestParameter(value = "FeatureNum")
	private String featureNum;

	// 第一个表格数据#nrm-div > table > tbody > tr:nth-child(3) > td:nth-child(2)
	@HtmlField(cssPath = "#nrm-div > table > tbody > tr")
	private List<C5c3> c5c3s;

	// 第二个表格数据 #raw-div > table > tbody > tr:nth-child(3) > td:nth-child(2)
	@HtmlField(cssPath = "#raw-div > table > tbody > tr")
	private List<RawBean> rawBeans;

	public String getRxp() {
		return rxp;
	}

	public void setRxp(String rxp) {
		this.rxp = rxp;
	}

	public String getFeatureNum() {
		return featureNum;
	}

	public void setFeatureNum(String featureNum) {
		this.featureNum = featureNum;
	}

	public List<C5c3> getC5c3s() {
		return c5c3s;
	}

	public void setC5c3s(List<C5c3> c5c3s) {
		this.c5c3s = c5c3s;
	}

	public List<RawBean> getRawBeans() {
		return rawBeans;
	}

	public void setRawBeans(List<RawBean> rawBeans) {
		this.rawBeans = rawBeans;
	}

	public HttpRequest getCurrRequest() {
		return currRequest;
	}

	public void setCurrRequest(HttpRequest currRequest) {
		this.currRequest = currRequest;
	}

}
