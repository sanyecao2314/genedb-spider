package com.novelbio.genedb.spider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.geccocrawler.gecco.GeccoEngine;

public class Start {
	public static void main(String[] args) {
		GeccoEngine.create()
		// 工程的包路径
		.classpath("com.novelbio.genedb.spider")
		// 开始抓取的页面地址
		.start("http://s3.amazonaws.com/3kricegenome")
		// 开启几个爬虫线程
		.thread(1)
		// 单个爬虫每次抓取完一个请求后的间隔时间
		.interval(2000)
		// 使用pc端userAgent
		.mobile(false)
		// 开始运行
		.start();
		
		System.out.println("....");
	}

	
}
