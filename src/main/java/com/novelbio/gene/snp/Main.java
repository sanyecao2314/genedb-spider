package com.novelbio.gene.snp;

import com.geccocrawler.gecco.GeccoEngine;

/**
 * 目标： http://qtaro.abr.affrc.go.jp/qsnp/snp?page=1
 * 
 * @author novelbio
 *
 */
public class Main {
	public static void main(String[] args) {
		String path = "/home/novelbio/桌面/snpBeans.txt";
		String title = "ID	SNP name	Source	Chr	Position (build4)	Position (build5)	Position (IRG SP1.0)	Reference allele (R)	Alternative allele (A)	Aus (R)	Aus (A)	Indica (R)	Indica (A)	Tropical japonica (R)	Tropical japonica (A)	Temperate japonica (R)	Temperate japonica (A)";
		WriteUtil.writeTxt(title, path);
		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.gene.snp")
				// 开始抓取的页面地址
				.start("http://qtaro.abr.affrc.go.jp/qsnp/snp?page=1")
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