package com.novelbio.gene.ricexpro.spatio3;

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
		GeccoEngine.create().classpath("com.novelbio.gene.ricexpro.spatio3")
				// 开始抓取的页面地址
				.start(/*RiceResultPipelines.featureRequests*/"http://ricexpro.dna.affrc.go.jp/RXP_0003/view-plot-data.php?featurenum=1710")
				// 开启几个爬虫线程
				.thread(30)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000)
				.start();
	}
}