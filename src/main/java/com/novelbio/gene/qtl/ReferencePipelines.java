package com.novelbio.gene.qtl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;

@PipelineName("referencePipelines")
public class ReferencePipelines implements Pipeline<ReferenceBean> {

	@SuppressWarnings("resource")
	@Override
	public void process(ReferenceBean referenceBean) {
		TxtReadandWrite trw = null;
		try {
			String path = "/home/novelbio/桌面/referenceBean.txt";
			// 写入文件
			trw = new TxtReadandWrite(new FileOutputStream(new File(path)));

			StringBuffer context = new StringBuffer();
			context.append(referenceBean.getJournal()).append("\t").append(referenceBean.getNumber()).append("\t")
					.append(referenceBean.getReference()).append("\t").append(referenceBean.getAbstrac()).append("\t")
					.append(referenceBean.getLocation());
			trw.writefile(context.append("\n").toString(), true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (trw != null) {
				trw.close();
			}
		}
	}

}
