package com.novelbio.gene.ricexpro.spatio3;

import java.util.List;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://ricexpro.dna.affrc.go.jp/{RXP}/view-plot-data.php?featurenum={FeatureNum}", timeout = 30000, pipelines = "signalPipelines")
public class EntireBean implements HtmlBean{

	// 参数值
	@RequestParameter(value = "RXP")
	private String rxp;

	@RequestParameter(value = "FeatureNum")
	private String featureNum;
	
	//第一个表格数据
	@HtmlField(cssPath = "#raw-div > table > tbody > tr:not(:first-child)")
	private List<RawBean> rawBeans;
	
	//第二个表格数据
	@HtmlField(cssPath = "#nrm-div > table > tbody > tr")
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
}
