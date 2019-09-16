package com.novelbio.gene.ricexpro.samplelist;

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
		String[] arrUrl = {"http://ricexpro.dna.affrc.go.jp/GGEP/sample-list.php", "http://ricexpro.dna.affrc.go.jp/RXP_0002/sample-list.php"};
		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.gene.ricexpro.samplelist")
				// 开始抓取的页面地址
				.start("http://ricexpro.dna.affrc.go.jp/GGEP/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_0002/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_0003/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_0004/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_0005/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_0006/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_0007/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_0008/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_0009/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_0010/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_0011/sample-list.php",
						"http://ricexpro.dna.affrc.go.jp/RXP_0012/sample-list.php")
				// 开启几个爬虫线程
				.thread(6)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(6000)
				// 使用pc端userAgent
				.mobile(false)
				.debug(true)
				// 开始运行
				.run();
		
		System.out.println(arrUrl.toString());
		
	}
}