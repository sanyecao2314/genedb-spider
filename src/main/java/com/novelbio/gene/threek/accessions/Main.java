package com.novelbio.gene.threek.accessions;

import java.util.HashMap;
import java.util.Map;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.request.HttpPostRequest;

/**
 * 目标： http://cgm.sjtu.edu.cn/3kricedb/rice-table.php?action=submit
 * 
 * @author novelbio
 *
 */
public class Main {
	public static void main(String[] args) {
		HttpPostRequest postRequest = new HttpPostRequest(
				"http://cgm.sjtu.edu.cn/3kricedb/rice-table.php");
		
		postRequest.addParameter("action", "submit");
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Upgrade-Insecure-Requests", "1");
		headers.put("Referer", "http://cgm.sjtu.edu.cn/3kricedb/rice-table.php?action=submit");
		postRequest.setHeaders(headers);
		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.gene.threek.accessions")
				// 开始抓取的页面地址
				.start(postRequest)
				// 开启几个爬虫线程
				.thread(1)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000)
				// 使用pc端userAgent
				.mobile(false)
				// 开始运行
				.run();

		

	}
}