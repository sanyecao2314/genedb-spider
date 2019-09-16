package com.novelbio.genedb.ncpgenotype;

import java.io.IOException;

import com.geccocrawler.gecco.GeccoEngine;

public class NcpgrStart {
	public static void main(String[] args) throws IOException {

		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.genedb.ncpgenotype")
				// 开始抓取的页面地址
				.start("http://ricevarmap.ncpgr.cn/v2/vars_genotype/")
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
