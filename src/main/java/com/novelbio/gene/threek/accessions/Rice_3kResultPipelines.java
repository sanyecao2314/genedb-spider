package com.novelbio.gene.threek.accessions;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.gene.ricexpro.spatio.RiceBeanList;

@PipelineName("riceResultPipelines")
public class Rice_3kResultPipelines implements Pipeline<Rice_3kBeanList>{

	@Override
	public void process(Rice_3kBeanList rice_3kBeanList) {
		//List<RiceBean> riceBeans = riceBeanList.getRiceBeans();
		System.out.println(JSON.toJSONString(rice_3kBeanList.getRice_3kBeans()));
		System.out.println("......");
	}

}
