package com.novelbio.gene.ricexpro.samplelist.part;

import org.mozilla.javascript.SymbolScriptable;

import com.geccocrawler.gecco.GeccoEngine;

/**
 * 目标： http://ricexpro.dna.affrc.go.jp/data-set.html
 * 
 * @author novelbio
 *
 */
public class Main {
	public static void main(String[] args) {
		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.gene.ricexpro.samplelist.part")
				// 开始抓取的页面地址
				.start("http://ricexpro.dna.affrc.go.jp/RXP_1011/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_1012/sample-list.php")
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