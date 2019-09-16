package com.novelbio.genedb.ricexpro.allrice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.request.HttpGetRequest;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.sun.tools.doclets.internal.toolkit.MemberSummaryWriter;

/**
 * 目标： http://ricexpro.dna.affrc.go.jp/gene-search.php
 * 
 * @author novelbio
 *
 */
public class AllriceMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		// 使用ClassLoader加载properties配置文件生成对应的输入流
		InputStream in = RiceResultPipelines.class.getClassLoader().getResourceAsStream("ricexpro/path.properties");
		// 使用properties对象加载输入流
		properties.load(in);
		// 获取key对应的value值
		String path = properties.getProperty("path");
		String unUrlPath = path + "unUrls.txt";
		String succPath = properties.getProperty("succPath");
		succPath += "succUrl.txt";
		// 处理url
		addUnUrl(unUrlPath);

		/*
		 * // 读取执行成功的文件 TxtReadandWrite suTrw = new TxtReadandWrite(new
		 * FileInputStream(new File(succPath))); // 读取爬取成功的rul Iterable<String> suUrls =
		 * suTrw.readlines(-1); for (String url : suUrls) { if ("".equals(url) && url !=
		 * null) { Urls.successUrls.add(url); } }
		 */
		// 读取爬取成功的url,放入set集合中
		readSuccUrls(succPath);

		TxtReadandWrite unTrw = new TxtReadandWrite(new File(unUrlPath));
		// 读取未爬取的url
		Iterable<String> unUrls = unTrw.readlines(-1);
		for (String url : unUrls) {
			if (!"".equals(url) && url != null) {
				if (!Urls.successUrls.contains(url)) {
					Urls.unUrls.add(new HttpGetRequest(url));
				}
			}
		}

		// 释放资源
		unTrw.close();

		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.genedb.ricexpro.allrice")
				// 开始抓取的页面地址
				.start(Urls.unUrls)
				// 开启几个爬虫线程
				.thread(1)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000)
				// 使用pc端userAgent
				.mobile(false)
				// 开始运行
				.run();

		// 读取爬取成功的url,放入set集合中
		readSuccUrls(succPath);

		// 读取要爬取的子url
		String childUrls = path + "child.txt";

		TxtReadandWrite chiTrw = new TxtReadandWrite(new File(childUrls));
		// 读取要要爬取的url
		Iterable<String> chiUrls = chiTrw.readlines(-1);
		for (String url : chiUrls) {
			if (!"".equals(url) && url != null) {
				if (!Urls.successUrls.contains(url)) {
					Urls.chiUrls.add(new HttpGetRequest(url));
				}
			}
		}
		
		GeccoEngine.create()
		// 工程的包路径
		.classpath("com.novelbio.genedb.ricexpro.allrice")
		// 开始抓取的页面地址
		.start(Urls.chiUrls)
		// 开启几个爬虫线程
		.thread(1)
		// 单个爬虫每次抓取完一个请求后的间隔时间
		.interval(2000)
		// 使用pc端userAgent
		.mobile(false)
		// 开始运行
		.run();

	}

	// 读取成功抓取的url信息
	public static void readSuccUrls(String succPath) throws IOException {
		// 清空原有记录
		Urls.unUrls.clear();
		// 读取执行成功的文件
		TxtReadandWrite suTrw = new TxtReadandWrite(new FileInputStream(new File(succPath)));
		// 读取爬取成功的rul
		Iterable<String> suUrls = suTrw.readlines(-1);
		for (String url : suUrls) {
			if (!"".equals(url) && url != null) {
				Urls.successUrls.add(url);
			}
		}
		suTrw.close();

	}

	// 处理抓取的url
	public static void addUnUrl(String unUrlPath) throws IOException {
		String[] rxps = { "GGEP", "RXP_0002", "RXP_0003", "RXP_0004", "RXP_0005", "RXP_0006", "RXP_0007", "RXP_0008",
				"RXP_0009", "RXP_0010", "RXP_0011", "RXP_0012", "RXP_1000", "RXP_1001", "RXP_1006", "RXP_1002",
				"RXP_1007", "RXP_1003", "RXP_1008", "RXP_1004", "RXP_1009", "RXP_1005", "RXP_1010", "RXP_1011",
				"RXP_1012", "RXP_3001", "RXP_3002", "RXP_3003", "RXP_4001", "RXP_4002", "RXP_5002" };

		TxtReadandWrite trw = new TxtReadandWrite(new FileOutputStream(new File(unUrlPath), true));
		for (String rxp : rxps) {
			for (int i = 1; i <= 278; i++) {
				trw.writefile("http://ricexpro.dna.affrc.go.jp/" + rxp + "/gene-search.php?page=" + i + "\n");
			}
		}

		trw.close();

	}

}