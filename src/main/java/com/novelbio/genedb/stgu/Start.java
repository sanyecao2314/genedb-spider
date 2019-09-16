/**
 *
 * @author novelbio fans.fan
 * @date 2018年9月10日
 */
package com.novelbio.genedb.stgu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.request.HttpGetRequest;
import com.geccocrawler.gecco.request.HttpRequest;
import com.novelbio.base.dataOperate.TxtReadandWrite;

/**
 *
 * @author novelbio fans.fan
 */
public class Start {

	/**
	 *
	 * @author novelbio fans.fan
	 * @date 2018年9月10日
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("chr01", 20);
		map.put("chr02", 20);
		map.put("chr03", 20);
		map.put("chr04", 20);
		map.put("chr05", 20);
		map.put("chr06", 20);
		map.put("chr07", 20);
		map.put("chr08", 20);
		map.put("chr09", 20);
		map.put("chr10", 20);
		map.put("chr11", 20);
		map.put("chr12", 20);
		
		TxtReadandWrite txtRead = new TxtReadandWrite("/home/novelbio/tmp/3K_rice.txt");
		List<HttpRequest> lsUrl = new ArrayList<>(18000);
		for (String line : txtRead.readlines()) {
			String assayId = line.split("\t")[1];
			for (String chr : map.keySet()) {
				int count = map.get(chr);
				for (int i = 1; i <= count; i++) {
					lsUrl.add(new HttpGetRequest("http://cgm.sjtu.edu.cn/Browser/data/tracks/" + assayId + "/" + chr + "/lf-" + i + ".json"));
				}
			}
		}
		txtRead.close();

		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.genedb.stgu")
				// 开始抓取的页面地址
				.start(lsUrl)
				// 开启几个爬虫线程
				.thread(5)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000)
				// 使用pc端userAgent
				.mobile(false)
				// 开始运行
				.start();

		System.out.println("....");

	}

}
