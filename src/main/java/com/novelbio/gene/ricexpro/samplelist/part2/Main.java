package com.novelbio.gene.ricexpro.samplelist.part2;

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
				.classpath("com.novelbio.gene.ricexpro.samplelist.part2")
				// 开始抓取的页面地址
				.start("http://ricexpro.dna.affrc.go.jp/RXP_1001/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_1002/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_1003/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_1004/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_1005/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_1006/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_1007/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_1008/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_1009/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_1010/sample-list.php")
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