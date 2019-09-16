package com.novelbio.gene.ricehap3;

import com.geccocrawler.gecco.GeccoEngine;

/**
 * 目标： http://202.127.18.221/RiceHap3/Genotype.php#
 * @author novelbio
 *
 */
public class Main {
	public static void main(String[] args) {
		GeccoEngine.create()
        //工程的包路径
        .classpath("com.novelbio.gene.ricehap3")
        //开始抓取的页面地址
        .start("http://202.127.18.221/RiceHap3/Genotype.php")
        //开启几个爬虫线程
        .thread(1)
        //单个爬虫每次抓取完一个请求后的间隔时间
        .interval(4000)
        //使用pc端userAgent
        .mobile(false)
        //开始运行
        .start();
	}
}
