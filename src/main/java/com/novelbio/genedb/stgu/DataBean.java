/**
 *
 * @author novelbio fans.fan
 * @date 2018年9月10日
 */
package com.novelbio.genedb.stgu;

import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.JSONPath;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.JsonBean;

/**
 *
 * @author novelbio fans.fan
 */

@Gecco(matchUrl = "*", timeout = 120000, pipelines = "dataPipeline")
public class DataBean implements JsonBean {

	
	@Request
	HttpRequest request;
	
	@JSONPath("$")
	List<JSONArray> data;
	

	public HttpRequest getRequest() {
		return request;
	}

	public void setRequest(HttpRequest request) {
		this.request = request;
	}

	public List<JSONArray> getData() {
		return data;
	}

	public void setData(List<JSONArray> data) {
		this.data = data;
	}

}
