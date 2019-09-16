package com.novelbio.gene.gsea;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Html;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl = "http://structuralbiology.cau.edu.cn/PlantGSEA/database/Osa.DetailInfo", timeout = 600000, pipelines = "txtResultPipelines")
public class FileBean implements HtmlBean {

	/*
	 * @RequestParameter("fileName") private String fileName;
	 * 
	 * @Request private HttpRequest currRequest;
	 */

	@Text
	@HtmlField(cssPath = "body")
	private String txtResult;

	public String getTxtResult() {
		return txtResult;
	}

	public void setTxtResult(String txtResult) {
		this.txtResult = txtResult;
	}

	

	
	
	

}
