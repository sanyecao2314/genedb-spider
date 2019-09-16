package com.novelbio.gene.gsea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;
import com.novelbio.gene.util.WriteUtil;

@PipelineName(value = "txtResultPipelines")
public class TxtResultPipelines implements Pipeline<FileBean> {

	@Override
	public void process(FileBean fileBean) {
		System.out.println("开始写入");
		//System.out.println(fileBean.getTxtResult());
		String path = "/home/novelbio/桌面/1.txt";
		TxtReadandWrite trw = null;
		try {
			trw = new TxtReadandWrite(new FileOutputStream(new File(path), true));
			trw.writefile(fileBean.getTxtResult() + "\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			trw.close();
		}
		
		
	}
}
