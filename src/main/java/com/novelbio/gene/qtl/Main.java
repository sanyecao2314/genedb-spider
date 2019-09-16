package com.novelbio.gene.qtl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.geccocrawler.gecco.GeccoEngine;
import com.novelbio.base.dataOperate.TxtReadandWrite;

/**
 * 目标： http://qtaro.abr.affrc.go.jp/qtab/table
 * 
 * @author novelbio
 *
 */

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		String path = "/home/novelbio/桌面/qtlBeans.txt";
		String title = "ID	QTL/Gene	Major category	Category of object character	No of marker for position determination	Chr	Genome* start	Genome end	Mapping method	LOD	Parent A	Parent B	Direction (Parent)	Reference Source	Reference no";
		TxtReadandWrite trwtitle = new TxtReadandWrite(new FileOutputStream(new File(path), true));
		trwtitle.writefile(title + "\n", true);
		trwtitle.close();
		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.gene.qtl")
				// 开始抓取的页面地址
				.start("http://qtaro.abr.affrc.go.jp/qtab/table?page=1")
				// 开启几个爬虫线程
				.thread(1)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000)
				// 使用pc端userAgent
				.mobile(false)
				// 开始运行
				.run();

		String refPath = "/home/novelbio/桌面/referenceBean.txt";
		String refTitle = "Journal	Number	Reference	Abstract	Location";
		TxtReadandWrite trwRefTitle = new TxtReadandWrite(new FileOutputStream(new File(refPath), true));
		trwRefTitle.writefile(refTitle + "\n", true);
		trwRefTitle.close();

		String qtlPath = "/home/novelbio/桌面/QtlEntry.txt";
		String qtlTitle = "ID	QTL/Gene	Major category	Category of object character	Character	Marker	No of marker for position determination"
				+ "	Chr	Genome Start	Genome End	Genome View	Mapping method	Population	No of plants	LOD	Parent A	Parent B	Direction ( Parent )	"
				+ "Reference source	Reference no	a) Physical	b) Fine1; interval		b) Fine2; interval	b) Fine3; co-segregated	c) Interval1; interval	"
				+ "c) Interval2; interval	c) Interval3; co-segregated	d) Co-segregated	Explained variance	Additive effect	Year";
		TxtReadandWrite trwQtlTitle = new TxtReadandWrite(new FileOutputStream(new File(qtlPath), true));
		trwQtlTitle.writefile(qtlTitle + "\n", true);
		trwQtlTitle.close();

		// qtlEntry采用3线程抓取
		GeccoEngine.create().classpath("com.novelbio.gene.qtl")
				// 开始抓取的页面地址
				.start(/* "http://qtaro.abr.affrc.go.jp/qtab/entry/show/916" */ QtlResultPipelines.qtlRequests)
				// 开启几个爬虫线程
				.thread(3)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000).start();

		// references采用3线程抓取
		GeccoEngine.create().classpath("com.novelbio.gene.qtl")
				// 开始抓取的页面地址
				.start(/* "http://qtaro.abr.affrc.go.jp/qtab/ref/detail/pha%3A814" */ QtlResultPipelines.referenceNoRequests)
				// 开启几个爬虫线程
				.thread(3)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000).start();

	}
}