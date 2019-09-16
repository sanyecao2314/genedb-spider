package com.novelbio.gene.gene;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.geccocrawler.gecco.GeccoEngine;
import com.novelbio.base.dataOperate.TxtReadandWrite;

/**
 * 目标： http://qtaro.abr.affrc.go.jp/ogro/table
 * 
 * @author novelbio
 *
 */
public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		
		String path = "/home/novelbio/桌面/GeneBeans.txt";
		StringBuffer title = new StringBuffer("ID	Gene	Gene Symbol	Major Category	Category of object character	Chr	Genome start	Genome end	Locus ID	Method of Isolation	Objective character	Reference (doi)");
		// 写入文件
		TxtReadandWrite trw = new TxtReadandWrite(new FileOutputStream(path, true));
		trw.writefile(title.append("\t").toString());
		trw.close();
		
		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.gene.gene")
				// 开始抓取的页面地址
				.start("http://qtaro.abr.affrc.go.jp/ogro/table?page=1")
				// 开启几个爬虫线程
				.thread(1)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000)
				// 使用pc端userAgent
				.mobile(false)
				// 开始运行
				.run();

		/*// qtlEntry采用3线程抓取
		GeccoEngine.create().classpath("com.novelbio.gene.gene")
				// 开始抓取的页面地址
				.start(GeneResultPipelines.entryRequests "http://qtaro.abr.affrc.go.jp/ogro/entry/show/736" )
				// 开启几个爬虫线程
				.thread(3)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000).start();*/
		
		/*// references采用3线程抓取
		GeccoEngine.create().classpath("com.novelbio.gene.gene")
				// 开始抓取的页面地址
				.start( "http://qtaro.abr.affrc.go.jp/qtab/ref/detail/pha%3A814" QtlResultPipelines.referenceNoRequests)
				// 开启几个爬虫线程
				.thread(3)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000).start();
		
		*/
		
	}
}