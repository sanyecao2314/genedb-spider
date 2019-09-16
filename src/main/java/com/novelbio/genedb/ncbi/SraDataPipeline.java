package com.novelbio.genedb.ncbi;

import java.io.BufferedWriter;
import java.io.FileWriter;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

@PipelineName("sraDataPipeline")
public class SraDataPipeline implements Pipeline<SraDataBean> {

	@Override
	public void process(SraDataBean bean) {
		System.out.println(bean);
		
//		wget -O "ERR630003" "https://sra-downloadb.be-md.ncbi.nlm.nih.gov/sos/sra-pub-run-1/ERR630003/ERR630003.1" 
//		&& coscmd upload -rs /home/ubuntu/ERR630003 ricedata/3krice/ERR630/ && rm ERR630003  

		StringBuffer stringBuffer = new StringBuffer("wget -O ");
		stringBuffer.append("\"").append(bean.getErrNo()).append("\" \"").append(bean.getUrl()).append("\"");
		stringBuffer.append(" && coscmd upload -rs /home/ubuntu/").append(bean.getErrNo()).append(" ricedata/3krice/").append(bean.getErrNo().substring(0, 6)).append("/");
		stringBuffer.append(" && rm ").append(bean.getErrNo()).append("  ");
		
		writeFile(stringBuffer.toString());
	}
	
	
	private synchronized void writeFile(String content) {
		try {
			BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(Start.writeFile,true));
			bufferedWriter.write(content + "\n");
			bufferedWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}