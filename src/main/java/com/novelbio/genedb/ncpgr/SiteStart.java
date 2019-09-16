package com.novelbio.genedb.ncpgr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.request.HttpRequest;
import com.novelbio.base.dataOperate.ExcelTxtRead;
import com.novelbio.base.dataOperate.TxtReadandWrite;

/**
 * 目标：http://structuralbiology.cau.edu.cn/PlantGSEA/GSEAresult.php?session=775006486
 * @author novelbio
 *
 */
public class SiteStart {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		/*//读取位点信息
		ArrayList<String[]> readLsExcelTxtFile = ExcelTxtRead.readLsExcelTxtFile("/home/novelbio/桌面/gene.csv", 2, 1, 1000000, 1);
		ArrayList<String> urlList = new ArrayList<String>();
		for (String[] strings : readLsExcelTxtFile) {
			System.out.println(strings[0]);
			urlList.add("http://ricevarmap.ncpgr.cn/v2/vars_info//?var=" + strings[0]);
		}
		
		String[] urlArr = new String[urlList.size()];
		urlList.toArray(urlArr);*/
		String path = "/home/novelbio/桌面/gene.csv";
		TxtReadandWrite tRW = new TxtReadandWrite(new FileOutputStream(new File(path), true));
		Iterable<String> readlines = tRW.readlines(2);
		for (String lin : readlines) {
			String[] site = lin.split("\t");
			System.out.println(site[0]);
			
			
			GeccoEngine.create()
	        //工程的包路径
	        .classpath("com.novelbio.genedb.ncpgr")
	        //开始抓取的页面地址
	        .start("http://ricevarmap.ncpgr.cn/v2/vars_info//?var=" + site[0])
	        //开启几个爬虫线程
	        .thread(1)
	        //单个爬虫每次抓取完一个请求后的间隔时间
	        .interval(2000)
	        //使用pc端userAgent
	        .mobile(false)
	        //开始运行
	        .run();
			
		}
		
		
	}
}
