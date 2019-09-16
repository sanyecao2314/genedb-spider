package com.novelbio.gene.threek.codeinfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.GeccoEngine;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.util.WriteUtil;

/**
 * 目标： http://cgm.sjtu.edu.cn/3kricedb/rice-table.php?action=submit
 * 
 * @author novelbio
 *
 */
public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		// 写入表头信息
		String filePath = "/home/novelbio/桌面/GeneStatistics.csv";

		String title = "high quality	#Total genes	#Core genes	#Candidate core genes	#Distributed genes	#Subspecies-unbalanced genes	"
				+ "#Indica-dominant genes	#Japonica-dominant genes	#Subspecies-specific genes	#Indica-specific genes	#Japonica-specific genes	"
				+ "#AUS-specific genes	#ARO-specific genes	#Subgroup-unbalanced genes	#Indica-subgroup-unbalanced genes	#Japonica-subgroup-unbalanced genes"
				+ "	#Random genes";
		
		WriteUtil.writeTxt(title, filePath);

		// 读取所有code数据
		List<String> codes = TxtReadandWrite.readfileLs(new File("/home/novelbio/桌面/codes.csv"));
		
		String[] urlArr = new String[codes.size()];
		for(int i = 0; i < codes.size(); i++) {
			urlArr[i] = "http://cgm.sjtu.edu.cn/3kricedb/searchByRice.php?code=" + codes.get(i);
		}

		GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.gene.threek.codeinfo")
				// 开始抓取的页面地址
				.start(urlArr)
				// 开启几个爬虫线程
				.thread(30)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000)
				// 使用pc端userAgent
				.mobile(false)
				// 开始运行
				.run();

	}

	
}