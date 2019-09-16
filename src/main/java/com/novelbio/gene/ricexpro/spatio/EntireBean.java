package com.novelbio.gene.ricexpro.spatio;

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
	@HtmlField(cssPath = "#wrapper")
	private RawBean rawBean;
	
	//第二个表格数据
	@HtmlField(cssPath = "#wrapper")
	private NormalizedBean normalizedBean;

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

	public RawBean getRawBean() {
		return rawBean;
	}

	public void setRawBean(RawBean rawBean) {
		this.rawBean = rawBean;
	}

	public NormalizedBean getNormalizedBean() {
		return normalizedBean;
	}

	public void setNormalizedBean(NormalizedBean normalizedBean) {
		this.normalizedBean = normalizedBean;
	}
	
	
}
