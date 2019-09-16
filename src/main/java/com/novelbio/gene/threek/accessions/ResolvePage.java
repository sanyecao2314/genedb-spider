package com.novelbio.gene.threek.accessions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.ricexpro.samplelist.RXP_0010Bean;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

public class ResolvePage {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TxtReadandWrite readandWrite = new TxtReadandWrite(new
		// File("/home/novelbio/桌面/3K rice table.html"), true);
		String context = readToString("/home/novelbio/桌面/3K rice table.html");
		
		// System.out.println(context);
		Document document = Jsoup.parse(context);

		Elements elements = document.getElementsByClass("trlist");
		Rice_3kBeanList beanList = new Rice_3kBeanList();
		List<Rice_3kBean> beans = new ArrayList<>();

		for (Element element : elements) {
			Rice_3kBean rice_3kBean = new Rice_3kBean();
			Elements elementsByTag = element.getElementsByTag("td");

			rice_3kBean.setId(elementsByTag.get(1).text());
			rice_3kBean.setCode(elementsByTag.get(2).text());
			rice_3kBean.setName(elementsByTag.get(3).text());
			rice_3kBean.setMetaSubspecies(elementsByTag.get(4).text());
			rice_3kBean.setSnpSubspecies(elementsByTag.get(5).text());
			rice_3kBean.setSnpSubgroup(elementsByTag.get(6).text());
			rice_3kBean.setCountry(elementsByTag.get(7).text());
			rice_3kBean.setRegion(elementsByTag.get(8).text());
			rice_3kBean.setSequencingDepth(elementsByTag.get(9).text());
			rice_3kBean.setMappingDepth(elementsByTag.get(10).text());
			rice_3kBean.setMappingCoverage(elementsByTag.get(11).text());
			beans.add(rice_3kBean);

		}

		// 写入文件
		String ricePath = "/home/novelbio/桌面/3K_rice_table.csv";
		String codePath = "/home/novelbio/桌面/codes.csv";
		String title = "ID	code	name	meta-infomation-based subspecies	SNP-based subspecies	SNP-based subgroup	country	region	sequencing depth	mapping depth	mapping coverage";
		WriteUtil.writeTxt(title, ricePath);
		for (Rice_3kBean bean : beans) {
			String result = bean.getId() + "\t" + bean.getCode() + "\t" + bean.getName() + "\t"
					+ bean.getMetaSubspecies() + "\t" + bean.getSnpSubspecies() + "\t" + bean.getSnpSubgroup() + "\t"
					+ bean.getCountry() + "\t" + bean.getRegion() + "\t" + bean.getSequencingDepth() + "\t"
					+ bean.getMappingDepth() + "\t" + bean.getMappingCoverage();
			WriteUtil.writeTxt(bean.getCode(), codePath);
			WriteUtil.writeTxt(result, ricePath);
		}

	}

	public static String readToString(String fileName) {
		String encoding = "UTF-8";
		File file = new File(fileName);
		Long filelength = file.length();
		byte[] filecontent = new byte[filelength.intValue()];
		try {
			FileInputStream in = new FileInputStream(file);
			in.read(filecontent);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			return new String(filecontent, encoding);
		} catch (UnsupportedEncodingException e) {
			System.err.println("The OS does not support " + encoding);
			e.printStackTrace();
			return null;
		}
	}
}
