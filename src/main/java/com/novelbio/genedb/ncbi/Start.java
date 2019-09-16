package com.novelbio.genedb.ncbi;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.request.HttpGetRequest;
import com.geccocrawler.gecco.request.HttpRequest;
import com.novelbio.base.dataOperate.TxtReadandWrite;

public class Start {

	public static final String readFile = "/home/ubuntu/SRR_download_need.txt";
	public static final String writeFile = "/home/ubuntu/downloadSRA.sh";
	/**
	 *
	 * @author novelbio fans.fan
	 * @date 2018年9月10日
	 * @param args
	 */
	public static void main(String[] args) {

		
		TxtReadandWrite txtRead = new TxtReadandWrite(readFile);
		List<HttpRequest> lsUrl = new ArrayList<>(18000);
		for (String line : txtRead.readlines()) {
			lsUrl.add(new HttpGetRequest("https://trace.ncbi.nlm.nih.gov/Traces/sra/?run=" + line));
		}
		txtRead.close();

		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.genedb.ncbi")
				// 开始抓取的页面地址
				.start(lsUrl)
				// 开启几个爬虫线程
				.thread(1)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(100)
				// 使用pc端userAgent
				.mobile(false)
				// 开始运行
				.start();

		System.out.println("....");

	}
}
