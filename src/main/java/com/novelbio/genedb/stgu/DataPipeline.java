/**
 *
 * @author novelbio fans.fan
 * @date 2018年9月10日
 */
package com.novelbio.genedb.stgu;

import com.alibaba.fastjson.JSONArray;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;

/**
 * Data
 * @author novelbio fans.fan
 */
@PipelineName("dataPipeline")
public class DataPipeline implements Pipeline<DataBean> {
	

	/* (non-Javadoc)
	 * @see com.geccocrawler.gecco.pipeline.Pipeline#process(com.geccocrawler.gecco.spider.SpiderBean)
	 */
	@Override
	public void process(DataBean bean) {
		String assayId = bean.getRequest().getUrl().split("/")[6];
		TxtReadandWrite txtWrite = new TxtReadandWrite("/home/novelbio/tmp/" + assayId + "_data.txt", true, true);
		StringBuffer stringBuffer = new StringBuffer();
		for (JSONArray array : bean.getData()) {
			stringBuffer.append(assayId).append("\t").append(array.get(4)).append("\t").append(array.get(1)).append("\t").append(array.get(2)).append("\n");
		}
		txtWrite.writefile(stringBuffer.toString());
		txtWrite.close();
	}

}
