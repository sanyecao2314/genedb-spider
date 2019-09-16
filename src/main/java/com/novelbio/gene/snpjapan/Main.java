package com.novelbio.gene.snpjapan;

import com.geccocrawler.gecco.GeccoEngine;

/**
 * 目标： http://qtaro.abr.affrc.go.jp/qsnp/jsnp?page=1
 * 
 * @author novelbio
 *
 */
public class Main {
	public static void main(String[] args) {
		
		String path = "/home/novelbio/桌面/snpJapanBeans.txt";
		String title = "ID	SNP name	Source	Chr	Position (build4)	Position (build5)	Position (IRG SP1.0)	Reference allele (R)	Alternative allele (A)	Upland (R)	Upland (A)	Lowland Group 1 (R)	Lowland Group 1 (A)	Lowland Group 2 (R)	Lowland Group 2 (A)	Lowland Group 3 (R)	Lowland Group 3 (A)";
		WriteUtil.writeTxt(title, path);
		GeccoEngine.create()				// 工程的包路径
				.classpath("com.novelbio.gene.snp")
				// 开始抓取的页面地址
				.start("http://qtaro.abr.affrc.go.jp/qsnp/jsnp?page=1")
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