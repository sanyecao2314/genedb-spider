package com.novelbio.genedb.ricexpro.allrice.ggep;

import com.geccocrawler.gecco.GeccoEngine;

/**
 * 目标： http://ricexpro.dna.affrc.go.jp/gene-search.php
 * 
 * @author novelbio
 *
 */
public class GgepMain {
	public static void main(String[] args) {
		
		
		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.genedb.ricexpro.allrice.ggep")
				// 开始抓取的页面地址
				.start("http://ricexpro.dna.affrc.go.jp/GGEP/view-plot-data.php?featurenum=12957")
				
				// 开启几个爬虫线程
				.thread(1)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000)
				// 使用pc端userAgent
				.mobile(false)
				// 开始运行
				.start();

	}
}