package com.novelbio.genedb.ricexpro.allrice.rxp4001;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/RXP_4001/view-plot-data.php?featurenum={FeatureNum}", timeout = 2400000, pipelines = "rxp4001SignalPipelines")
public class EntireBean implements HtmlBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 当前请求
	@Request
	private HttpRequest currRequest;

	// 参数值
	private String rxp = "RXP_4001";

	@RequestParameter(value = "FeatureNum")
	private String featureNum;

	// 第一个表格数据#raw-div > table > tbody > tr:nth-child(6) > td:nth-child(7)
	@HtmlField(cssPath = "#raw-div > table > tbody > tr:not(:first-child)")
	private List<RawBean> rawBeans;

	// 第二个表格数据#nrm-div > table > tbody > tr:nth-child(6) > td:nth-child(49)
	@HtmlField(cssPath = "#nrm-div > table > tbody > tr:not(:first-child)")
	private List<NormalizedBean> normalizedBeans;

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

	public List<RawBean> getRawBeans() {
		return rawBeans;
	}

	public void setRawBeans(List<RawBean> rawBeans) {
		this.rawBeans = rawBeans;
	}

	public List<NormalizedBean> getNormalizedBeans() {
		return normalizedBeans;
	}

	public void setNormalizedBeans(List<NormalizedBean> normalizedBeans) {
		this.normalizedBeans = normalizedBeans;
	}

	public HttpRequest getCurrRequest() {
		return currRequest;
	}

	public void setCurrRequest(HttpRequest currRequest) {
		this.currRequest = currRequest;
	}

}
