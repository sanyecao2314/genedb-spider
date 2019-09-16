package com.novelbio.genedb.snpseek;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.novelbio.base.dataOperate.TxtReadandWrite;

public class Start {
	public static void main(String[] args) throws FileNotFoundException {
		TxtReadandWrite tRW = new TxtReadandWrite(new FileInputStream(new File("/home/novelbio/桌面/NB_final_snp.fam")));
		Iterable<String> readlines = tRW.readlines(1);
		
		
		for (String lin : readlines) {
			String[] site = lin.split(" ");
			System.out.println(site[0]);
			//WriteUtil.writeTxt("wget https://s3.amazonaws.com/3kricegenome/Nipponbare/" + site[0] + ".snp.vcf.gz", "/home/novelbio/桌面/snpurls.txt");
			
		}
	}
}
