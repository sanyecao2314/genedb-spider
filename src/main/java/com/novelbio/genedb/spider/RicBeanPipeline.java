package com.novelbio.genedb.spider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;

@PipelineName("ricUrlBeanPipeline")
public class RicBeanPipeline implements Pipeline<RicListBean> {

	public void process(RicListBean listBean) {
		TxtReadandWrite trw = null;
		try {
			String rootUrl = "wget http://s3.amazonaws.com/3kricegenome/";
			String path = "/home/novelbio/桌面/urlList.txt";

			trw = new TxtReadandWrite(new FileOutputStream(new File(path), true));

			// 遍历url的结果集
			for (String key : listBean.getLsKeys()) {
				// 判断是否是vcf文件
				if (key.contains("vcf.gz")) {
					// 将url拼接完整并存入文件
					trw.writefile(rootUrl + key, true);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			trw.close();
		}
	}

}
