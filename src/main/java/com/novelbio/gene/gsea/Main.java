package com.novelbio.gene.gsea;

import com.geccocrawler.gecco.GeccoEngine;

/**
 * 目标：http://structuralbiology.cau.edu.cn/PlantGSEA/GSEAresult.php?session=775006486
 * @author novelbio
 *
 */
public class Main {
	public static void main(String[] args) {
		GeccoEngine.create()
        //工程的包路径
        .classpath("com.novelbio.gene.gsea")
        //开始抓取的页面地址
        .start("http://structuralbiology.cau.edu.cn/PlantGSEA/database/Osa.DetailInfo")
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
