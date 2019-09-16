package com.novelbio.gene.gene;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;

@PipelineName("entryResultPipelines")
public class EntryResultPipelines implements Pipeline<EntryBean> {

	@Override
	public void process(EntryBean entryBean) {
		
		try {
			System.out.println(JSON.toJSONString(entryBean));
			String path = "/home/novelbio/桌面/GeneEntry.txt";

			// 写入文件
			TxtReadandWrite trw = new TxtReadandWrite(new FileOutputStream(path, true));
			trw.writefile((JSON.toJSONString(entryBean) + "\t").getBytes(), true);
			trw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
