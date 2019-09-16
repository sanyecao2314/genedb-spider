package com.novelbio.gene.threek.gene;

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
		
		/*//写入表格头信息
		String filePath = "/home/novelbio/桌面/3kGene_Information.csv";
		String title = "ID	source	chrom	start	end	strand	CDS length	exon number	gene ID	Core gene	Candidate core gene	Distributed gene	"
				+ "Subspecies-unbalanced gene	Indica-dominant gene	Japonica-dominant gene	Subspecies-specific gene	Indica-specific gene	"
				+ "Japonica-specific gene	AUS-specific gene	ARO-specific gene	Subgroup-unbalanced gene	Indica-subgroup-unbalanced gene	"
				+ "Japonica-subgroup-unbalanced gene	Random gene	Gene age	Gene Family1	Gene Family2";
		
		WriteUtil.writeTxt(title, filePath);*/

		/*GeccoEngine.create()
				// 工程的包路径
				.classpath("com.novelbio.gene.threek.gene")
				// 开始抓取的页面地址
				.start("http://cgm.sjtu.edu.cn/3kricedb/gene-table.php?page=1")
				// 开启几个爬虫线程
				.thread(30)
				// 单个爬虫每次抓取完一个请求后的间隔时间
				.interval(2000)
				// 使用pc端userAgent
				.mobile(false)
				// 开始运行
				.run();*/
		
		GeccoEngine.create()
		// 工程的包路径
		.classpath("com.novelbio.gene.threek.gene")
		// 开始抓取的页面地址
		.start("http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Os03g0689100",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Os03g0689300",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Os03g0689350",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Os03g0689400",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Os03g0689544",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Os03g0689688",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Os03g0689833",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Un_maker_115093",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Un_maker_115043",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Un_maker_115261",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Un_maker_115331",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Un_maker_115332",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Un_maker_115253",
				"http://cgm.sjtu.edu.cn/3kricedb/searchByGene.php?gene_id=Un_maker_115679")
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