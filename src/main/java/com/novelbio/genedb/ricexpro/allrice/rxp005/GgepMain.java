package com.novelbio.genedb.ricexpro.allrice.rxp005;

import com.geccocrawler.gecco.GeccoEngine;

/**
 * 目标： http://ricexpro.dna.affrc.go.jp/gene-search.php
 * 
 * @author novelbio
 *
 */
public class GgepMain {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.genedb.ricexpro.allrice")
				// 开始抓取的页面地址
				.start("http://ricexpro.dna.affrc.go.jp/RXP_0005/view-plot-data.php?featurenum=12957")
				// 开启几个爬虫线程
				.thread(1)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000)
				// 使用pc端userAgent
				.mobile(false)
				// 开始运行
				.start();
		/*// qtlEntry采用3线程抓取
		GeccoEngine.create().classpath("com.novelbio.gene.ricexpro.spatio")
				// 开始抓取的页面地址
				.start(RiceResultPipelines.featureRequests)
				// 开启几个爬虫线程
				.thread(30)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000)
				.start();*/

	}
}