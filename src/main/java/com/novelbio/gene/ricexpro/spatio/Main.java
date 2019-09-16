package com.novelbio.gene.ricexpro.spatio;

import com.geccocrawler.gecco.GeccoEngine;
import com.novelbio.gene.gene.GeneResultPipelines;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

/**
 * 目标： http://ricexpro.dna.affrc.go.jp/gene-search.php
 * 
 * @author novelbio
 *
 */
public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//写入文件头
		String title = "Locus ID / Links	FeatureNum\n" + "(Link to graph)	Accession	Probe Sequence ID\n"
				+ "(Link to SeqInfo)	Description	MSU ID";
		String path = "/home/novelbio/桌面/feature_RXP_0002.csv";
		WriteUtil.writeTxt(title, path);
		
		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.gene.ricexpro.spatio")
				// 开始抓取的页面地址
				.start("http://ricexpro.dna.affrc.go.jp/RXP_0002/gene-search.php?page=1")
				// 开启几个爬虫线程
				.thread(30)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000)
				// 使用pc端userAgent
				.mobile(false)
				// 开始运行
				.run();
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