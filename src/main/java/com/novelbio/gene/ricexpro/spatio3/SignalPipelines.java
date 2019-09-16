package com.novelbio.gene.ricexpro.spatio3;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.gene.util.WriteUtil;

@PipelineName("signalPipelines")
public class SignalPipelines implements Pipeline<EntireBean>{

	private static Boolean flag = true;
	@Override
	public void process(EntireBean entireBean) {
		
		String filePath = "/home/novelbio/桌面/" + entireBean.getRxp() + "Signal.csv";
		WriteUtil.writeTxt(entireBean.getFeatureNum() + "Raw", filePath);
		List<RawBean> rawBeans = entireBean.getRawBeans();
		
		for (RawBean rawBean : rawBeans) {
			if(rawBean.getDat13() == null) {
				continue;
			}
			//表格一
			String rawContext = rawBean.getDat13() + "\t" + rawBean.getDat20() + "\t" + rawBean.getDat27() + "\t" + rawBean.getDat34() + "\t" +
								rawBean.getDat41() + "\t" + rawBean.getDat48() + "\t" + rawBean.getDat55() + "\t" + rawBean.getDat62() + "\t" + 
								rawBean.getDat69() + "\t" + rawBean.getDat76() + "\t" + rawBean.getDat83() + "\t" + rawBean.getDat90() + "\t" +
								rawBean.getDat97() + "\t" + rawBean.getDat104() + "\t" + rawBean.getDat111() + "\t" + rawBean.getDat118() + "\t" +
								rawBean.getDat125();
					
			
			WriteUtil.writeTxt(rawContext, filePath);
		}
		
		
		//表格二
		WriteUtil.writeTxt(entireBean.getFeatureNum() + "Normalized", filePath);
		List<NormalizedBean> normalizedBeans = entireBean.getNormalizedBeans();
		
		for (NormalizedBean nrmBean : normalizedBeans) {
			if(nrmBean.getDat13() == null) {
				continue;
			}
			String nrmContext = nrmBean.getDat13() + "\t" + nrmBean.getDat20() + "\t" + nrmBean.getDat27() + "\t" + nrmBean.getDat34() + "\t" +
					nrmBean.getDat41() + "\t" + nrmBean.getDat48() + "\t" + nrmBean.getDat55() + "\t" + nrmBean.getDat62() + "\t" + 
					nrmBean.getDat69() + "\t" + nrmBean.getDat76() + "\t" + nrmBean.getDat83() + "\t" + nrmBean.getDat90() + "\t" +
					nrmBean.getDat97() + "\t" + nrmBean.getDat104() + "\t" + nrmBean.getDat111() + "\t" + nrmBean.getDat118() + "\t" +
					nrmBean.getDat125();
			WriteUtil.writeTxt(nrmContext, filePath);
		}
	}

}
