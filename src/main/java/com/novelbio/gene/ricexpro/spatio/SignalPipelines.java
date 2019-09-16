package com.novelbio.gene.ricexpro.spatio;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.gene.util.WriteUtil;

@PipelineName("signalPipelines")
public class SignalPipelines implements Pipeline<EntireBean>{

	@Override
	public void process(EntireBean entireBean) {
		
		String filePath = "/home/novelbio/桌面/RXP/" + entireBean.getFeatureNum() + "Raw.csv";
		RawBean rawBean = entireBean.getRawBean();
		//表格一
		String rawContext = 
				//第一行
				  "Vegetative1_10_rep1:" + rawBean.getV1_10_rep1() + "\tVegetative1_12_rep1:" + rawBean.getV1_12_rep1() + "\tVegetative1_14_rep1:" + rawBean.getV1_14_rep1() + 
				"\tVegetative1_16_rep1:" + rawBean.getV1_16_rep1() + "\tVegetative1_18_rep1:" + rawBean.getV1_18_rep1() + "\tVegetative1_20_rep1:" + rawBean.getV1_20_rep1() +
				"\tVegetative1_22_rep1:" + rawBean.getV1_22_rep1() + "\tVegetative1_00_rep1:" + rawBean.getV1_00_rep1() + "\tVegetative1_02_rep1:" + rawBean.getV1_02_rep1() +
				"\tVegetative1_04_rep1:" + rawBean.getV1_04_rep1() + "\tVegetative1_06_rep1:" + rawBean.getV1_06_rep1() + "\tVegetative1_08_rep1:" + rawBean.getV1_08_rep1() +
				
				"\tVegetative2_10_rep1:" + rawBean.getV2_10_rep1() + "\tVegetative2_12_rep1:" + rawBean.getV2_12_rep1() + "\tVegetative2_14_rep1:" + rawBean.getV2_14_rep1() + 
				"\tVegetative2_16_rep1:" + rawBean.getV2_16_rep1() + "\tVegetative2_18_rep1:" + rawBean.getV2_18_rep1() + "\tVegetative2_20_rep1:" + rawBean.getV2_20_rep1() +
				"\tVegetative2_22_rep1:" + rawBean.getV2_22_rep1() + "\tVegetative2_00_rep1:" + rawBean.getV2_00_rep1() + "\tVegetative2_02_rep1:" + rawBean.getV2_02_rep1() +
				"\tVegetative2_04_rep1:" + rawBean.getV2_04_rep1() + "\tVegetative2_06_rep1:" + rawBean.getV2_06_rep1() + "\tVegetative2_08_rep1:" + rawBean.getV2_08_rep1() +
				
				"\tVegetative3_10_rep1:" + rawBean.getV3_10_rep1() + "\tVegetative3_12_rep1:" + rawBean.getV3_12_rep1() + "\tVegetative3_14_rep1:" + rawBean.getV3_14_rep1() + 
				"\tVegetative3_16_rep1:" + rawBean.getV3_16_rep1() + "\tVegetative3_18_rep1:" + rawBean.getV3_18_rep1() + "\tVegetative3_20_rep1:" + rawBean.getV3_20_rep1() +
				"\tVegetative3_22_rep1:" + rawBean.getV3_22_rep1() + "\tVegetative3_00_rep1:" + rawBean.getV3_00_rep1() + "\tVegetative3_02_rep1:" + rawBean.getV3_02_rep1() +
				"\tVegetative3_04_rep1:" + rawBean.getV3_04_rep1() + "\tVegetative3_06_rep1:" + rawBean.getV3_06_rep1() + "\tVegetative3_08_rep1:" + rawBean.getV3_08_rep1() +
				
				"\tVegetativeReproductive_10_rep1:" + rawBean.getVr_10_rep1() + "\tVegetativeReproductive_12_rep1:" + rawBean.getVr_12_rep1() + "\tVegetativeReproductive_14_rep1:" + rawBean.getVr_14_rep1() + 
				"\tVegetativeReproductive_16_rep1:" + rawBean.getVr_16_rep1() + "\tVegetativeReproductive_18_rep1:" + rawBean.getVr_18_rep1() + "\tVegetativeReproductive_20_rep1:" + rawBean.getVr_20_rep1() +
				"\tVegetativeReproductive_22_rep1:" + rawBean.getVr_22_rep1() + "\tVegetativeReproductive_00_rep1:" + rawBean.getVr_00_rep1() + "\tVegetativeReproductive_02_rep1:" + rawBean.getVr_02_rep1() +
				"\tVegetativeReproductive_04_rep1:" + rawBean.getVr_04_rep1() + "\tVegetativeReproductive_06_rep1:" + rawBean.getVr_06_rep1() + "\tVegetativeReproductive_08_rep1:" + rawBean.getVr_08_rep1() +
				
				"\tReproductive1_10_rep1:" + rawBean.getRd1_10_rep1() + "\tReproductive1_12_rep1:" + rawBean.getRd1_12_rep1() + "\tReproductive1_14_rep1:" + rawBean.getRd1_14_rep1() + 
				"\tReproductive1_16_rep1:" + rawBean.getRd1_16_rep1() + "\tReproductive1_18_rep1:" + rawBean.getRd1_18_rep1() + "\tReproductive1_20_rep1:" + rawBean.getRd1_20_rep1() +
				"\tReproductive1_22_rep1:" + rawBean.getRd1_22_rep1() + "\tReproductive1_00_rep1:" + rawBean.getRd1_00_rep1() + "\tReproductive1_02_rep1:" + rawBean.getRd1_02_rep1() +
				"\tReproductive1_04_rep1:" + rawBean.getRd1_04_rep1() + "\tReproductive1_06_rep1:" + rawBean.getRd1_06_rep1() + "\tReproductive1_08_rep1:" + rawBean.getRd1_08_rep1() +
				
				"\tReproductiveRipening_10_rep1:" + rawBean.getRr_10_rep1() + "\tReproductiveRipening_12_rep1:" + rawBean.getRr_12_rep1() + "\tReproductiveRipening_14_rep1:" + rawBean.getRr_14_rep1() + 
				"\tReproductiveRipening_16_rep1:" + rawBean.getRr_16_rep1() + "\tReproductiveRipening_18_rep1:" + rawBean.getRr_18_rep1() + "\tReproductiveRipening_20_rep1:" + rawBean.getRr_20_rep1() +
				"\tReproductiveRipening_22_rep1:" + rawBean.getRr_22_rep1() + "\tReproductiveRipening_00_rep1:" + rawBean.getRr_00_rep1() + "\tReproductiveRipening_02_rep1:" + rawBean.getRr_02_rep1() +
				"\tReproductiveRipening_04_rep1:" + rawBean.getRr_04_rep1() + "\tReproductiveRipening_06_rep1:" + rawBean.getRr_06_rep1() + "\tReproductiveRipening_08_rep1:" + rawBean.getRr_08_rep1() +
				
				"\tRipening1_10_rep1:" + rawBean.getR1_10_rep1() + "\tRipening1_12_rep1:" + rawBean.getR1_12_rep1() + "\tRipening1_14_rep1:" + rawBean.getR1_14_rep1() + 
				"\tRipening1_16_rep1:" + rawBean.getR1_16_rep1() + "\tRipening1_18_rep1:" + rawBean.getR1_18_rep1() + "\tRipening1_20_rep1:" + rawBean.getR1_20_rep1() +
				"\tRipening1_22_rep1:" + rawBean.getR1_22_rep1() + "\tRipening1_00_rep1:" + rawBean.getR1_00_rep1() + "\tRipening1_02_rep1:" + rawBean.getR1_02_rep1() +
				"\tRipening1_04_rep1:" + rawBean.getR1_04_rep1() + "\tRipening1_06_rep1:" + rawBean.getR1_06_rep1() + "\tRipening1_08_rep1:" + rawBean.getR1_08_rep1() +
				
				"\tRipening2_10_rep1:" + rawBean.getR2_10_rep1() + "\tRipening2_12_rep1:" + rawBean.getR2_12_rep1() + "\tRipening2_14_rep1:" + rawBean.getR2_14_rep1() + 
				"\tRipening2_16_rep1:" + rawBean.getR2_16_rep1() + "\tRipening2_18_rep1:" + rawBean.getR2_18_rep1() + "\tRipening2_20_rep1:" + rawBean.getR2_20_rep1() +
				"\tRipening2_22_rep1:" + rawBean.getR2_22_rep1() + "\tRipening2_00_rep1:" + rawBean.getR2_00_rep1() + "\tRipening2_02_rep1:" + rawBean.getR2_02_rep1() +
				"\tRipening2_04_rep1:" + rawBean.getR2_04_rep1() + "\tRipening2_06_rep1:" + rawBean.getR2_06_rep1() + "\tRipening2_08_rep1:" + rawBean.getR2_08_rep1() +
				
				//第二行
				"\nVegetative1_10_rep2:" + rawBean.getV1_10_rep2() + "\tVegetative1_12_rep2:" + rawBean.getV1_12_rep2() + "\tVegetative1_14_rep2:" + rawBean.getV1_14_rep2() + 
				"\tVegetative1_16_rep2:" + rawBean.getV1_16_rep2() + "\tVegetative1_18_rep2:" + rawBean.getV1_18_rep2() + "\tVegetative1_20_rep2:" + rawBean.getV1_20_rep2() +
				"\tVegetative1_22_rep2:" + rawBean.getV1_22_rep2() + "\tVegetative1_00_rep2:" + rawBean.getV1_00_rep2() + "\tVegetative1_02_rep2:" + rawBean.getV1_02_rep2() +
				"\tVegetative1_04_rep2:" + rawBean.getV1_04_rep2() + "\tVegetative1_06_rep2:" + rawBean.getV1_06_rep2() + "\tVegetative1_08_rep2:" + rawBean.getV1_08_rep2() +
				
				"\tVegetative2_10_rep2:" + rawBean.getV2_10_rep2() + "\tVegetative2_12_rep2:" + rawBean.getV2_12_rep2() + "\tVegetative2_14_rep2:" + rawBean.getV2_14_rep2() + 
				"\tVegetative2_16_rep2:" + rawBean.getV2_16_rep2() + "\tVegetative2_18_rep2:" + rawBean.getV2_18_rep2() + "\tVegetative2_20_rep2:" + rawBean.getV2_20_rep2() +
				"\tVegetative2_22_rep2:" + rawBean.getV2_22_rep2() + "\tVegetative2_00_rep2:" + rawBean.getV2_00_rep2() + "\tVegetative2_02_rep2:" + rawBean.getV2_02_rep2() +
				"\tVegetative2_04_rep2:" + rawBean.getV2_04_rep2() + "\tVegetative2_06_rep2:" + rawBean.getV2_06_rep2() + "\tVegetative2_08_rep2:" + rawBean.getV2_08_rep2() +
				
				"\tVegetative3_10_rep2:" + rawBean.getV3_10_rep2() + "\tVegetative3_12_rep2:" + rawBean.getV3_12_rep2() + "\tVegetative3_14_rep2:" + rawBean.getV3_14_rep2() + 
				"\tVegetative3_16_rep2:" + rawBean.getV3_16_rep2() + "\tVegetative3_18_rep2:" + rawBean.getV3_18_rep2() + "\tVegetative3_20_rep2:" + rawBean.getV3_20_rep2() +
				"\tVegetative3_22_rep2:" + rawBean.getV3_22_rep2() + "\tVegetative3_00_rep2:" + rawBean.getV3_00_rep2() + "\tVegetative3_02_rep2:" + rawBean.getV3_02_rep2() +
				"\tVegetative3_04_rep2:" + rawBean.getV3_04_rep2() + "\tVegetative3_06_rep2:" + rawBean.getV3_06_rep2() + "\tVegetative3_08_rep2:" + rawBean.getV3_08_rep2() +
				
				"\tVegetativeReproductive_10_rep2:" + rawBean.getVr_10_rep2() + "\tVegetativeReproductive_12_rep2:" + rawBean.getVr_12_rep2() + "\tVegetativeReproductive_14_rep2:" + rawBean.getVr_14_rep2() + 
				"\tVegetativeReproductive_16_rep2:" + rawBean.getVr_16_rep2() + "\tVegetativeReproductive_18_rep2:" + rawBean.getVr_18_rep2() + "\tVegetativeReproductive_20_rep2:" + rawBean.getVr_20_rep2() +
				"\tVegetativeReproductive_22_rep2:" + rawBean.getVr_22_rep2() + "\tVegetativeReproductive_00_rep2:" + rawBean.getVr_00_rep2() + "\tVegetativeReproductive_02_rep2:" + rawBean.getVr_02_rep2() +
				"\tVegetativeReproductive_04_rep2:" + rawBean.getVr_04_rep2() + "\tVegetativeReproductive_06_rep2:" + rawBean.getVr_06_rep2() + "\tVegetativeReproductive_08_rep2:" + rawBean.getVr_08_rep2() +
				
				"\tReproductive1_10_rep2:" + rawBean.getRd1_10_rep2() + "\tReproductive1_12_rep2:" + rawBean.getRd1_12_rep2() + "\tReproductive1_14_rep2:" + rawBean.getRd1_14_rep2() + 
				"\tReproductive1_16_rep2:" + rawBean.getRd1_16_rep2() + "\tReproductive1_18_rep2:" + rawBean.getRd1_18_rep2() + "\tReproductive1_20_rep2:" + rawBean.getRd1_20_rep2() +
				"\tReproductive1_22_rep2:" + rawBean.getRd1_22_rep2() + "\tReproductive1_00_rep2:" + rawBean.getRd1_00_rep2() + "\tReproductive1_02_rep2:" + rawBean.getRd1_02_rep2() +
				"\tReproductive1_04_rep2:" + rawBean.getRd1_04_rep2() + "\tReproductive1_06_rep2:" + rawBean.getRd1_06_rep2() + "\tReproductive1_08_rep2:" + rawBean.getRd1_08_rep2() +
				
				"\tReproductiveRipening_10_rep2:" + rawBean.getRr_10_rep2() + "\tReproductiveRipening_12_rep2:" + rawBean.getRr_12_rep2() + "\tReproductiveRipening_14_rep2:" + rawBean.getRr_14_rep2() + 
				"\tReproductiveRipening_16_rep2:" + rawBean.getRr_16_rep2() + "\tReproductiveRipening_18_rep2:" + rawBean.getRr_18_rep2() + "\tReproductiveRipening_20_rep2:" + rawBean.getRr_20_rep2() +
				"\tReproductiveRipening_22_rep2:" + rawBean.getRr_22_rep2() + "\tReproductiveRipening_00_rep2:" + rawBean.getRr_00_rep2() + "\tReproductiveRipening_02_rep2:" + rawBean.getRr_02_rep2() +
				"\tReproductiveRipening_04_rep2:" + rawBean.getRr_04_rep2() + "\tReproductiveRipening_06_rep2:" + rawBean.getRr_06_rep2() + "\tReproductiveRipening_08_rep2:" + rawBean.getRr_08_rep2() +
				
				"\tRipening1_10_rep2:" + rawBean.getR1_10_rep2() + "\tRipening1_12_rep2:" + rawBean.getR1_12_rep2() + "\tRipening1_14_rep2:" + rawBean.getR1_14_rep2() + 
				"\tRipening1_16_rep2:" + rawBean.getR1_16_rep2() + "\tRipening1_18_rep2:" + rawBean.getR1_18_rep2() + "\tRipening1_20_rep2:" + rawBean.getR1_20_rep2() +
				"\tRipening1_22_rep2:" + rawBean.getR1_22_rep2() + "\tRipening1_00_rep2:" + rawBean.getR1_00_rep2() + "\tRipening1_02_rep2:" + rawBean.getR1_02_rep2() +
				"\tRipening1_04_rep2:" + rawBean.getR1_04_rep2() + "\tRipening1_06_rep2:" + rawBean.getR1_06_rep2() + "\tRipening1_08_rep2:" + rawBean.getR1_08_rep2() +
				
				"\tRipening2_10_rep2:" + rawBean.getR2_10_rep2() + "\tRipening2_12_rep2:" + rawBean.getR2_12_rep2() + "\tRipening2_14_rep2:" + rawBean.getR2_14_rep2() + 
				"\tRipening2_16_rep2:" + rawBean.getR2_16_rep2() + "\tRipening2_18_rep2:" + rawBean.getR2_18_rep2() + "\tRipening2_20_rep2:" + rawBean.getR2_20_rep2() +
				"\tRipening2_22_rep2:" + rawBean.getR2_22_rep2() + "\tRipening2_00_rep2:" + rawBean.getR2_00_rep2() + "\tRipening2_02_rep2:" + rawBean.getR2_02_rep2() +
				"\tRipening2_04_rep2:" + rawBean.getR2_04_rep2() + "\tRipening2_06_rep2:" + rawBean.getR2_06_rep2() + "\tRipening2_08_rep2:" + rawBean.getR2_08_rep2() +
				
				//第三行
				"\nVegetative1_10_rep3:" + rawBean.getV1_10_rep3() + "\tVegetative1_12_rep3:" + rawBean.getV1_12_rep3() + "\tVegetative1_14_rep3:" + rawBean.getV1_14_rep3() + 
				"\tVegetative1_16_rep3:" + rawBean.getV1_16_rep3() + "\tVegetative1_18_rep3:" + rawBean.getV1_18_rep3() + "\tVegetative1_20_rep3:" + rawBean.getV1_20_rep3() +
				"\tVegetative1_22_rep3:" + rawBean.getV1_22_rep3() + "\tVegetative1_00_rep3:" + rawBean.getV1_00_rep3() + "\tVegetative1_02_rep3:" + rawBean.getV1_02_rep3() +
				"\tVegetative1_04_rep3:" + rawBean.getV1_04_rep3() + "\tVegetative1_06_rep3:" + rawBean.getV1_06_rep3() + "\tVegetative1_08_rep3:" + rawBean.getV1_08_rep3() +
				
				"\tVegetative2_10_rep3:" + rawBean.getV2_10_rep3() + "\tVegetative2_12_rep3:" + rawBean.getV2_12_rep3() + "\tVegetative2_14_rep3:" + rawBean.getV2_14_rep3() + 
				"\tVegetative2_16_rep3:" + rawBean.getV2_16_rep3() + "\tVegetative2_18_rep3:" + rawBean.getV2_18_rep3() + "\tVegetative2_20_rep3:" + rawBean.getV2_20_rep3() +
				"\tVegetative2_22_rep3:" + rawBean.getV2_22_rep3() + "\tVegetative2_00_rep3:" + rawBean.getV2_00_rep3() + "\tVegetative2_02_rep3:" + rawBean.getV2_02_rep3() +
				"\tVegetative2_04_rep3:" + rawBean.getV2_04_rep3() + "\tVegetative2_06_rep3:" + rawBean.getV2_06_rep3() + "\tVegetative2_08_rep3:" + rawBean.getV2_08_rep3() +
				
				"\tVegetative3_10_rep3:" + rawBean.getV3_10_rep3() + "\tVegetative3_12_rep3:" + rawBean.getV3_12_rep3() + "\tVegetative3_14_rep3:" + rawBean.getV3_14_rep3() + 
				"\tVegetative3_16_rep3:" + rawBean.getV3_16_rep3() + "\tVegetative3_18_rep3:" + rawBean.getV3_18_rep3() + "\tVegetative3_20_rep3:" + rawBean.getV3_20_rep3() +
				"\tVegetative3_22_rep3:" + rawBean.getV3_22_rep3() + "\tVegetative3_00_rep3:" + rawBean.getV3_00_rep3() + "\tVegetative3_02_rep3:" + rawBean.getV3_02_rep3() +
				"\tVegetative3_04_rep3:" + rawBean.getV3_04_rep3() + "\tVegetative3_06_rep3:" + rawBean.getV3_06_rep3() + "\tVegetative3_08_rep3:" + rawBean.getV3_08_rep3() +
				
				"\tVegetativeReproductive_10_rep3:" + rawBean.getVr_10_rep3() + "\tVegetativeReproductive_12_rep3:" + rawBean.getVr_12_rep3() + "\tVegetativeReproductive_14_rep3:" + rawBean.getVr_14_rep3() + 
				"\tVegetativeReproductive_16_rep3:" + rawBean.getVr_16_rep3() + "\tVegetativeReproductive_18_rep3:" + rawBean.getVr_18_rep3() + "\tVegetativeReproductive_20_rep3:" + rawBean.getVr_20_rep3() +
				"\tVegetativeReproductive_22_rep3:" + rawBean.getVr_22_rep3() + "\tVegetativeReproductive_00_rep3:" + rawBean.getVr_00_rep3() + "\tVegetativeReproductive_02_rep3:" + rawBean.getVr_02_rep3() +
				"\tVegetativeReproductive_04_rep3:" + rawBean.getVr_04_rep3() + "\tVegetativeReproductive_06_rep3:" + rawBean.getVr_06_rep3() + "\tVegetativeReproductive_08_rep3:" + rawBean.getVr_08_rep3() +
				
				"\tReproductive1_10_rep3:" + rawBean.getRd1_10_rep3() + "\tReproductive1_12_rep3:" + rawBean.getRd1_12_rep3() + "\tReproductive1_14_rep3:" + rawBean.getRd1_14_rep3() + 
				"\tReproductive1_16_rep3:" + rawBean.getRd1_16_rep3() + "\tReproductive1_18_rep3:" + rawBean.getRd1_18_rep3() + "\tReproductive1_20_rep3:" + rawBean.getRd1_20_rep3() +
				"\tReproductive1_22_rep3:" + rawBean.getRd1_22_rep3() + "\tReproductive1_00_rep3:" + rawBean.getRd1_00_rep3() + "\tReproductive1_02_rep3:" + rawBean.getRd1_02_rep3() +
				"\tReproductive1_04_rep3:" + rawBean.getRd1_04_rep3() + "\tReproductive1_06_rep3:" + rawBean.getRd1_06_rep3() + "\tReproductive1_08_rep3:" + rawBean.getRd1_08_rep3() +
				
				"\tReproductiveRipening_10_rep3:" + rawBean.getRr_10_rep3() + "\tReproductiveRipening_12_rep3:" + rawBean.getRr_12_rep3() + "\tReproductiveRipening_14_rep3:" + rawBean.getRr_14_rep3() + 
				"\tReproductiveRipening_16_rep3:" + rawBean.getRr_16_rep3() + "\tReproductiveRipening_18_rep3:" + rawBean.getRr_18_rep3() + "\tReproductiveRipening_20_rep3:" + rawBean.getRr_20_rep3() +
				"\tReproductiveRipening_22_rep3:" + rawBean.getRr_22_rep3() + "\tReproductiveRipening_00_rep3:" + rawBean.getRr_00_rep3() + "\tReproductiveRipening_02_rep3:" + rawBean.getRr_02_rep3() +
				"\tReproductiveRipening_04_rep3:" + rawBean.getRr_04_rep3() + "\tReproductiveRipening_06_rep3:" + rawBean.getRr_06_rep3() + "\tReproductiveRipening_08_rep3:" + rawBean.getRr_08_rep3() +
				
				"\tRipening1_10_rep3:" + rawBean.getR1_10_rep3() + "\tRipening1_12_rep3:" + rawBean.getR1_12_rep3() + "\tRipening1_14_rep3:" + rawBean.getR1_14_rep3() + 
				"\tRipening1_16_rep3:" + rawBean.getR1_16_rep3() + "\tRipening1_18_rep3:" + rawBean.getR1_18_rep3() + "\tRipening1_20_rep3:" + rawBean.getR1_20_rep3() +
				"\tRipening1_22_rep3:" + rawBean.getR1_22_rep3() + "\tRipening1_00_rep3:" + rawBean.getR1_00_rep3() + "\tRipening1_02_rep3:" + rawBean.getR1_02_rep3() +
				"\tRipening1_04_rep3:" + rawBean.getR1_04_rep3() + "\tRipening1_06_rep3:" + rawBean.getR1_06_rep3() + "\tRipening1_08_rep3:" + rawBean.getR1_08_rep3() +
				
				"\tRipening2_10_rep3:" + rawBean.getR2_10_rep3() + "\tRipening2_12_rep3:" + rawBean.getR2_12_rep3() + "\tRipening2_14_rep3:" + rawBean.getR2_14_rep3() + 
				"\tRipening2_16_rep3:" + rawBean.getR2_16_rep3() + "\tRipening2_18_rep3:" + rawBean.getR2_18_rep3() + "\tRipening2_20_rep3:" + rawBean.getR2_20_rep3() +
				"\tRipening2_22_rep3:" + rawBean.getR2_22_rep3() + "\tRipening2_00_rep3:" + rawBean.getR2_00_rep3() + "\tRipening2_02_rep3:" + rawBean.getR2_02_rep3() +
				"\tRipening2_04_rep3:" + rawBean.getR2_04_rep3() + "\tRipening2_06_rep3:" + rawBean.getR2_06_rep3() + "\tRipening2_08_rep3:" + rawBean.getR2_08_rep3() +
				
				
				//第四行
				"\nVegetative1_10_mean:" + rawBean.getV1_10_mean() + "\tVegetative1_12_mean:" + rawBean.getV1_12_mean() + "\tVegetative1_14_mean:" + rawBean.getV1_14_mean() + 
				"\tVegetative1_16_mean:" + rawBean.getV1_16_mean() + "\tVegetative1_18_mean:" + rawBean.getV1_18_mean() + "\tVegetative1_20_mean:" + rawBean.getV1_20_mean() +
				"\tVegetative1_22_mean:" + rawBean.getV1_22_mean() + "\tVegetative1_00_mean:" + rawBean.getV1_00_mean() + "\tVegetative1_02_mean:" + rawBean.getV1_02_mean() +
				"\tVegetative1_04_mean:" + rawBean.getV1_04_mean() + "\tVegetative1_06_mean:" + rawBean.getV1_06_mean() + "\tVegetative1_08_mean:" + rawBean.getV1_08_mean() +
				
				"\tVegetative2_10_mean:" + rawBean.getV2_10_mean() + "\tVegetative2_12_mean:" + rawBean.getV2_12_mean() + "\tVegetative2_14_mean:" + rawBean.getV2_14_mean() + 
				"\tVegetative2_16_mean:" + rawBean.getV2_16_mean() + "\tVegetative2_18_mean:" + rawBean.getV2_18_mean() + "\tVegetative2_20_mean:" + rawBean.getV2_20_mean() +
				"\tVegetative2_22_mean:" + rawBean.getV2_22_mean() + "\tVegetative2_00_mean:" + rawBean.getV2_00_mean() + "\tVegetative2_02_mean:" + rawBean.getV2_02_mean() +
				"\tVegetative2_04_mean:" + rawBean.getV2_04_mean() + "\tVegetative2_06_mean:" + rawBean.getV2_06_mean() + "\tVegetative2_08_mean:" + rawBean.getV2_08_mean() +
				
				"\tVegetative3_10_mean:" + rawBean.getV3_10_mean() + "\tVegetative3_12_mean:" + rawBean.getV3_12_mean() + "\tVegetative3_14_mean:" + rawBean.getV3_14_mean() + 
				"\tVegetative3_16_mean:" + rawBean.getV3_16_mean() + "\tVegetative3_18_mean:" + rawBean.getV3_18_mean() + "\tVegetative3_20_mean:" + rawBean.getV3_20_mean() +
				"\tVegetative3_22_mean:" + rawBean.getV3_22_mean() + "\tVegetative3_00_mean:" + rawBean.getV3_00_mean() + "\tVegetative3_02_mean:" + rawBean.getV3_02_mean() +
				"\tVegetative3_04_mean:" + rawBean.getV3_04_mean() + "\tVegetative3_06_mean:" + rawBean.getV3_06_mean() + "\tVegetative3_08_mean:" + rawBean.getV3_08_mean() +
				
				"\tVegetativeReproductive_10_mean:" + rawBean.getVr_10_mean() + "\tVegetativeReproductive_12_mean:" + rawBean.getVr_12_mean() + "\tVegetativeReproductive_14_mean:" + rawBean.getVr_14_mean() + 
				"\tVegetativeReproductive_16_mean:" + rawBean.getVr_16_mean() + "\tVegetativeReproductive_18_mean:" + rawBean.getVr_18_mean() + "\tVegetativeReproductive_20_mean:" + rawBean.getVr_20_mean() +
				"\tVegetativeReproductive_22_mean:" + rawBean.getVr_22_mean() + "\tVegetativeReproductive_00_mean:" + rawBean.getVr_00_mean() + "\tVegetativeReproductive_02_mean:" + rawBean.getVr_02_mean() +
				"\tVegetativeReproductive_04_mean:" + rawBean.getVr_04_mean() + "\tVegetativeReproductive_06_mean:" + rawBean.getVr_06_mean() + "\tVegetativeReproductive_08_mean:" + rawBean.getVr_08_mean() +
				
				"\tReproductive1_10_mean:" + rawBean.getRd1_10_mean() + "\tReproductive1_12_mean:" + rawBean.getRd1_12_mean() + "\tReproductive1_14_mean:" + rawBean.getRd1_14_mean() + 
				"\tReproductive1_16_mean:" + rawBean.getRd1_16_mean() + "\tReproductive1_18_mean:" + rawBean.getRd1_18_mean() + "\tReproductive1_20_mean:" + rawBean.getRd1_20_mean() +
				"\tReproductive1_22_mean:" + rawBean.getRd1_22_mean() + "\tReproductive1_00_mean:" + rawBean.getRd1_00_mean() + "\tReproductive1_02_mean:" + rawBean.getRd1_02_mean() +
				"\tReproductive1_04_mean:" + rawBean.getRd1_04_mean() + "\tReproductive1_06_mean:" + rawBean.getRd1_06_mean() + "\tReproductive1_08_mean:" + rawBean.getRd1_08_mean() +
				
				"\tReproductiveRipening_10_mean:" + rawBean.getRr_10_mean() + "\tReproductiveRipening_12_mean:" + rawBean.getRr_12_mean() + "\tReproductiveRipening_14_mean:" + rawBean.getRr_14_mean() + 
				"\tReproductiveRipening_16_mean:" + rawBean.getRr_16_mean() + "\tReproductiveRipening_18_mean:" + rawBean.getRr_18_mean() + "\tReproductiveRipening_20_mean:" + rawBean.getRr_20_mean() +
				"\tReproductiveRipening_22_mean:" + rawBean.getRr_22_mean() + "\tReproductiveRipening_00_mean:" + rawBean.getRr_00_mean() + "\tReproductiveRipening_02_mean:" + rawBean.getRr_02_mean() +
				"\tReproductiveRipening_04_mean:" + rawBean.getRr_04_mean() + "\tReproductiveRipening_06_mean:" + rawBean.getRr_06_mean() + "\tReproductiveRipening_08_mean:" + rawBean.getRr_08_mean() +
				
				"\tRipening1_10_mean:" + rawBean.getR1_10_mean() + "\tRipening1_12_mean:" + rawBean.getR1_12_mean() + "\tRipening1_14_mean:" + rawBean.getR1_14_mean() + 
				"\tRipening1_16_mean:" + rawBean.getR1_16_mean() + "\tRipening1_18_mean:" + rawBean.getR1_18_mean() + "\tRipening1_20_mean:" + rawBean.getR1_20_mean() +
				"\tRipening1_22_mean:" + rawBean.getR1_22_mean() + "\tRipening1_00_mean:" + rawBean.getR1_00_mean() + "\tRipening1_02_mean:" + rawBean.getR1_02_mean() +
				"\tRipening1_04_mean:" + rawBean.getR1_04_mean() + "\tRipening1_06_mean:" + rawBean.getR1_06_mean() + "\tRipening1_08_mean:" + rawBean.getR1_08_mean() +
				
				"\tRipening2_10_mean:" + rawBean.getR2_10_mean() + "\tRipening2_12_mean:" + rawBean.getR2_12_mean() + "\tRipening2_14_mean:" + rawBean.getR2_14_mean() + 
				"\tRipening2_16_mean:" + rawBean.getR2_16_mean() + "\tRipening2_18_mean:" + rawBean.getR2_18_mean() + "\tRipening2_20_mean:" + rawBean.getR2_20_mean() +
				"\tRipening2_22_mean:" + rawBean.getR2_22_mean() + "\tRipening2_00_mean:" + rawBean.getR2_00_mean() + "\tRipening2_02_mean:" + rawBean.getR2_02_mean() +
				"\tRipening2_04_mean:" + rawBean.getR2_04_mean() + "\tRipening2_06_mean:" + rawBean.getR2_06_mean() + "\tRipening2_08_mean:" + rawBean.getR2_08_mean() +
				
				
				//第五行
				"\nVegetative1_10_median:" + rawBean.getV1_10_median() + "\tVegetative1_12_median:" + rawBean.getV1_12_median() + "\tVegetative1_14_median:" + rawBean.getV1_14_median() + 
				"\tVegetative1_16_median:" + rawBean.getV1_16_median() + "\tVegetative1_18_median:" + rawBean.getV1_18_median() + "\tVegetative1_20_median:" + rawBean.getV1_20_median() +
				"\tVegetative1_22_median:" + rawBean.getV1_22_median() + "\tVegetative1_00_median:" + rawBean.getV1_00_median() + "\tVegetative1_02_median:" + rawBean.getV1_02_median() +
				"\tVegetative1_04_median:" + rawBean.getV1_04_median() + "\tVegetative1_06_median:" + rawBean.getV1_06_median() + "\tVegetative1_08_median:" + rawBean.getV1_08_median() +
				
				"\tVegetative2_10_median:" + rawBean.getV2_10_median() + "\tVegetative2_12_median:" + rawBean.getV2_12_median() + "\tVegetative2_14_median:" + rawBean.getV2_14_median() + 
				"\tVegetative2_16_median:" + rawBean.getV2_16_median() + "\tVegetative2_18_median:" + rawBean.getV2_18_median() + "\tVegetative2_20_median:" + rawBean.getV2_20_median() +
				"\tVegetative2_22_median:" + rawBean.getV2_22_median() + "\tVegetative2_00_median:" + rawBean.getV2_00_median() + "\tVegetative2_02_median:" + rawBean.getV2_02_median() +
				"\tVegetative2_04_median:" + rawBean.getV2_04_median() + "\tVegetative2_06_median:" + rawBean.getV2_06_median() + "\tVegetative2_08_median:" + rawBean.getV2_08_median() +
				
				"\tVegetative3_10_median:" + rawBean.getV3_10_median() + "\tVegetative3_12_median:" + rawBean.getV3_12_median() + "\tVegetative3_14_median:" + rawBean.getV3_14_median() + 
				"\tVegetative3_16_median:" + rawBean.getV3_16_median() + "\tVegetative3_18_median:" + rawBean.getV3_18_median() + "\tVegetative3_20_median:" + rawBean.getV3_20_median() +
				"\tVegetative3_22_median:" + rawBean.getV3_22_median() + "\tVegetative3_00_median:" + rawBean.getV3_00_median() + "\tVegetative3_02_median:" + rawBean.getV3_02_median() +
				"\tVegetative3_04_median:" + rawBean.getV3_04_median() + "\tVegetative3_06_median:" + rawBean.getV3_06_median() + "\tVegetative3_08_median:" + rawBean.getV3_08_median() +
				
				"\tVegetativeReproductive_10_median:" + rawBean.getVr_10_median() + "\tVegetativeReproductive_12_median:" + rawBean.getVr_12_median() + "\tVegetativeReproductive_14_median:" + rawBean.getVr_14_median() + 
				"\tVegetativeReproductive_16_median:" + rawBean.getVr_16_median() + "\tVegetativeReproductive_18_median:" + rawBean.getVr_18_median() + "\tVegetativeReproductive_20_median:" + rawBean.getVr_20_median() +
				"\tVegetativeReproductive_22_median:" + rawBean.getVr_22_median() + "\tVegetativeReproductive_00_median:" + rawBean.getVr_00_median() + "\tVegetativeReproductive_02_median:" + rawBean.getVr_02_median() +
				"\tVegetativeReproductive_04_median:" + rawBean.getVr_04_median() + "\tVegetativeReproductive_06_median:" + rawBean.getVr_06_median() + "\tVegetativeReproductive_08_median:" + rawBean.getVr_08_median() +
				
				"\tReproductive1_10_median:" + rawBean.getRd1_10_median() + "\tReproductive1_12_median:" + rawBean.getRd1_12_median() + "\tReproductive1_14_median:" + rawBean.getRd1_14_median() + 
				"\tReproductive1_16_median:" + rawBean.getRd1_16_median() + "\tReproductive1_18_median:" + rawBean.getRd1_18_median() + "\tReproductive1_20_median:" + rawBean.getRd1_20_median() +
				"\tReproductive1_22_median:" + rawBean.getRd1_22_median() + "\tReproductive1_00_median:" + rawBean.getRd1_00_median() + "\tReproductive1_02_median:" + rawBean.getRd1_02_median() +
				"\tReproductive1_04_median:" + rawBean.getRd1_04_median() + "\tReproductive1_06_median:" + rawBean.getRd1_06_median() + "\tReproductive1_08_median:" + rawBean.getRd1_08_median() +
				
				"\tReproductiveRipening_10_median:" + rawBean.getRr_10_median() + "\tReproductiveRipening_12_median:" + rawBean.getRr_12_median() + "\tReproductiveRipening_14_median:" + rawBean.getRr_14_median() + 
				"\tReproductiveRipening_16_median:" + rawBean.getRr_16_median() + "\tReproductiveRipening_18_median:" + rawBean.getRr_18_median() + "\tReproductiveRipening_20_median:" + rawBean.getRr_20_median() +
				"\tReproductiveRipening_22_median:" + rawBean.getRr_22_median() + "\tReproductiveRipening_00_median:" + rawBean.getRr_00_median() + "\tReproductiveRipening_02_median:" + rawBean.getRr_02_median() +
				"\tReproductiveRipening_04_median:" + rawBean.getRr_04_median() + "\tReproductiveRipening_06_median:" + rawBean.getRr_06_median() + "\tReproductiveRipening_08_median:" + rawBean.getRr_08_median() +
				
				"\tRipening1_10_median:" + rawBean.getR1_10_median() + "\tRipening1_12_median:" + rawBean.getR1_12_median() + "\tRipening1_14_median:" + rawBean.getR1_14_median() + 
				"\tRipening1_16_median:" + rawBean.getR1_16_median() + "\tRipening1_18_median:" + rawBean.getR1_18_median() + "\tRipening1_20_median:" + rawBean.getR1_20_median() +
				"\tRipening1_22_median:" + rawBean.getR1_22_median() + "\tRipening1_00_median:" + rawBean.getR1_00_median() + "\tRipening1_02_median:" + rawBean.getR1_02_median() +
				"\tRipening1_04_median:" + rawBean.getR1_04_median() + "\tRipening1_06_median:" + rawBean.getR1_06_median() + "\tRipening1_08_median:" + rawBean.getR1_08_median() +
				
				"\tRipening2_10_median:" + rawBean.getR2_10_median() + "\tRipening2_12_median:" + rawBean.getR2_12_median() + "\tRipening2_14_median:" + rawBean.getR2_14_median() + 
				"\tRipening2_16_median:" + rawBean.getR2_16_median() + "\tRipening2_18_median:" + rawBean.getR2_18_median() + "\tRipening2_20_median:" + rawBean.getR2_20_median() +
				"\tRipening2_22_median:" + rawBean.getR2_22_median() + "\tRipening2_00_median:" + rawBean.getR2_00_median() + "\tRipening2_02_median:" + rawBean.getR2_02_median() +
				"\tRipening2_04_median:" + rawBean.getR2_04_median() + "\tRipening2_06_median:" + rawBean.getR2_06_median() + "\tRipening2_08_median:" + rawBean.getR2_08_median() ;
		
		WriteUtil.writeTxt(rawContext, filePath);
		
		//表格二
		String nrmFilePath = "/home/novelbio/桌面/RXP/" + entireBean.getFeatureNum() + "nrm.csv";
		NormalizedBean nrmBean = entireBean.getNormalizedBean();
		
		String nrmContext = 
				//第一行
				  "Vegetative1_10_rep1:" + nrmBean.getV1_10_rep1() + "\tVegetative1_12_rep1:" + nrmBean.getV1_12_rep1() + "\tVegetative1_14_rep1:" + nrmBean.getV1_14_rep1() + 
				"\tVegetative1_16_rep1:" + nrmBean.getV1_16_rep1() + "\tVegetative1_18_rep1:" + nrmBean.getV1_18_rep1() + "\tVegetative1_20_rep1:" + nrmBean.getV1_20_rep1() +
				"\tVegetative1_22_rep1:" + nrmBean.getV1_22_rep1() + "\tVegetative1_00_rep1:" + nrmBean.getV1_00_rep1() + "\tVegetative1_02_rep1:" + nrmBean.getV1_02_rep1() +
				"\tVegetative1_04_rep1:" + nrmBean.getV1_04_rep1() + "\tVegetative1_06_rep1:" + nrmBean.getV1_06_rep1() + "\tVegetative1_08_rep1:" + nrmBean.getV1_08_rep1() +
				
				"\tVegetative2_10_rep1:" + nrmBean.getV2_10_rep1() + "\tVegetative2_12_rep1:" + nrmBean.getV2_12_rep1() + "\tVegetative2_14_rep1:" + nrmBean.getV2_14_rep1() + 
				"\tVegetative2_16_rep1:" + nrmBean.getV2_16_rep1() + "\tVegetative2_18_rep1:" + nrmBean.getV2_18_rep1() + "\tVegetative2_20_rep1:" + nrmBean.getV2_20_rep1() +
				"\tVegetative2_22_rep1:" + nrmBean.getV2_22_rep1() + "\tVegetative2_00_rep1:" + nrmBean.getV2_00_rep1() + "\tVegetative2_02_rep1:" + nrmBean.getV2_02_rep1() +
				"\tVegetative2_04_rep1:" + nrmBean.getV2_04_rep1() + "\tVegetative2_06_rep1:" + nrmBean.getV2_06_rep1() + "\tVegetative2_08_rep1:" + nrmBean.getV2_08_rep1() +
				
				"\tVegetative3_10_rep1:" + nrmBean.getV3_10_rep1() + "\tVegetative3_12_rep1:" + nrmBean.getV3_12_rep1() + "\tVegetative3_14_rep1:" + nrmBean.getV3_14_rep1() + 
				"\tVegetative3_16_rep1:" + nrmBean.getV3_16_rep1() + "\tVegetative3_18_rep1:" + nrmBean.getV3_18_rep1() + "\tVegetative3_20_rep1:" + nrmBean.getV3_20_rep1() +
				"\tVegetative3_22_rep1:" + nrmBean.getV3_22_rep1() + "\tVegetative3_00_rep1:" + nrmBean.getV3_00_rep1() + "\tVegetative3_02_rep1:" + nrmBean.getV3_02_rep1() +
				"\tVegetative3_04_rep1:" + nrmBean.getV3_04_rep1() + "\tVegetative3_06_rep1:" + nrmBean.getV3_06_rep1() + "\tVegetative3_08_rep1:" + nrmBean.getV3_08_rep1() +
				
				"\tVegetativeReproductive_10_rep1:" + nrmBean.getVr_10_rep1() + "\tVegetativeReproductive_12_rep1:" + nrmBean.getVr_12_rep1() + "\tVegetativeReproductive_14_rep1:" + nrmBean.getVr_14_rep1() + 
				"\tVegetativeReproductive_16_rep1:" + nrmBean.getVr_16_rep1() + "\tVegetativeReproductive_18_rep1:" + nrmBean.getVr_18_rep1() + "\tVegetativeReproductive_20_rep1:" + nrmBean.getVr_20_rep1() +
				"\tVegetativeReproductive_22_rep1:" + nrmBean.getVr_22_rep1() + "\tVegetativeReproductive_00_rep1:" + nrmBean.getVr_00_rep1() + "\tVegetativeReproductive_02_rep1:" + nrmBean.getVr_02_rep1() +
				"\tVegetativeReproductive_04_rep1:" + nrmBean.getVr_04_rep1() + "\tVegetativeReproductive_06_rep1:" + nrmBean.getVr_06_rep1() + "\tVegetativeReproductive_08_rep1:" + nrmBean.getVr_08_rep1() +
				
				"\tReproductive1_10_rep1:" + nrmBean.getRd1_10_rep1() + "\tReproductive1_12_rep1:" + nrmBean.getRd1_12_rep1() + "\tReproductive1_14_rep1:" + nrmBean.getRd1_14_rep1() + 
				"\tReproductive1_16_rep1:" + nrmBean.getRd1_16_rep1() + "\tReproductive1_18_rep1:" + nrmBean.getRd1_18_rep1() + "\tReproductive1_20_rep1:" + nrmBean.getRd1_20_rep1() +
				"\tReproductive1_22_rep1:" + nrmBean.getRd1_22_rep1() + "\tReproductive1_00_rep1:" + nrmBean.getRd1_00_rep1() + "\tReproductive1_02_rep1:" + nrmBean.getRd1_02_rep1() +
				"\tReproductive1_04_rep1:" + nrmBean.getRd1_04_rep1() + "\tReproductive1_06_rep1:" + nrmBean.getRd1_06_rep1() + "\tReproductive1_08_rep1:" + nrmBean.getRd1_08_rep1() +
				
				"\tReproductiveRipening_10_rep1:" + nrmBean.getRr_10_rep1() + "\tReproductiveRipening_12_rep1:" + nrmBean.getRr_12_rep1() + "\tReproductiveRipening_14_rep1:" + nrmBean.getRr_14_rep1() + 
				"\tReproductiveRipening_16_rep1:" + nrmBean.getRr_16_rep1() + "\tReproductiveRipening_18_rep1:" + nrmBean.getRr_18_rep1() + "\tReproductiveRipening_20_rep1:" + nrmBean.getRr_20_rep1() +
				"\tReproductiveRipening_22_rep1:" + nrmBean.getRr_22_rep1() + "\tReproductiveRipening_00_rep1:" + nrmBean.getRr_00_rep1() + "\tReproductiveRipening_02_rep1:" + nrmBean.getRr_02_rep1() +
				"\tReproductiveRipening_04_rep1:" + nrmBean.getRr_04_rep1() + "\tReproductiveRipening_06_rep1:" + nrmBean.getRr_06_rep1() + "\tReproductiveRipening_08_rep1:" + nrmBean.getRr_08_rep1() +
				
				"\tRipening1_10_rep1:" + nrmBean.getR1_10_rep1() + "\tRipening1_12_rep1:" + nrmBean.getR1_12_rep1() + "\tRipening1_14_rep1:" + nrmBean.getR1_14_rep1() + 
				"\tRipening1_16_rep1:" + nrmBean.getR1_16_rep1() + "\tRipening1_18_rep1:" + nrmBean.getR1_18_rep1() + "\tRipening1_20_rep1:" + nrmBean.getR1_20_rep1() +
				"\tRipening1_22_rep1:" + nrmBean.getR1_22_rep1() + "\tRipening1_00_rep1:" + nrmBean.getR1_00_rep1() + "\tRipening1_02_rep1:" + nrmBean.getR1_02_rep1() +
				"\tRipening1_04_rep1:" + nrmBean.getR1_04_rep1() + "\tRipening1_06_rep1:" + nrmBean.getR1_06_rep1() + "\tRipening1_08_rep1:" + nrmBean.getR1_08_rep1() +
				
				"\tRipening2_10_rep1:" + nrmBean.getR2_10_rep1() + "\tRipening2_12_rep1:" + nrmBean.getR2_12_rep1() + "\tRipening2_14_rep1:" + nrmBean.getR2_14_rep1() + 
				"\tRipening2_16_rep1:" + nrmBean.getR2_16_rep1() + "\tRipening2_18_rep1:" + nrmBean.getR2_18_rep1() + "\tRipening2_20_rep1:" + nrmBean.getR2_20_rep1() +
				"\tRipening2_22_rep1:" + nrmBean.getR2_22_rep1() + "\tRipening2_00_rep1:" + nrmBean.getR2_00_rep1() + "\tRipening2_02_rep1:" + nrmBean.getR2_02_rep1() +
				"\tRipening2_04_rep1:" + nrmBean.getR2_04_rep1() + "\tRipening2_06_rep1:" + nrmBean.getR2_06_rep1() + "\tRipening2_08_rep1:" + nrmBean.getR2_08_rep1() +
				
				//第二行
				"\nVegetative1_10_rep2:" + nrmBean.getV1_10_rep2() + "\tVegetative1_12_rep2:" + nrmBean.getV1_12_rep2() + "\tVegetative1_14_rep2:" + nrmBean.getV1_14_rep2() + 
				"\tVegetative1_16_rep2:" + nrmBean.getV1_16_rep2() + "\tVegetative1_18_rep2:" + nrmBean.getV1_18_rep2() + "\tVegetative1_20_rep2:" + nrmBean.getV1_20_rep2() +
				"\tVegetative1_22_rep2:" + nrmBean.getV1_22_rep2() + "\tVegetative1_00_rep2:" + nrmBean.getV1_00_rep2() + "\tVegetative1_02_rep2:" + nrmBean.getV1_02_rep2() +
				"\tVegetative1_04_rep2:" + nrmBean.getV1_04_rep2() + "\tVegetative1_06_rep2:" + nrmBean.getV1_06_rep2() + "\tVegetative1_08_rep2:" + nrmBean.getV1_08_rep2() +
				
				"\tVegetative2_10_rep2:" + nrmBean.getV2_10_rep2() + "\tVegetative2_12_rep2:" + nrmBean.getV2_12_rep2() + "\tVegetative2_14_rep2:" + nrmBean.getV2_14_rep2() + 
				"\tVegetative2_16_rep2:" + nrmBean.getV2_16_rep2() + "\tVegetative2_18_rep2:" + nrmBean.getV2_18_rep2() + "\tVegetative2_20_rep2:" + nrmBean.getV2_20_rep2() +
				"\tVegetative2_22_rep2:" + nrmBean.getV2_22_rep2() + "\tVegetative2_00_rep2:" + nrmBean.getV2_00_rep2() + "\tVegetative2_02_rep2:" + nrmBean.getV2_02_rep2() +
				"\tVegetative2_04_rep2:" + nrmBean.getV2_04_rep2() + "\tVegetative2_06_rep2:" + nrmBean.getV2_06_rep2() + "\tVegetative2_08_rep2:" + nrmBean.getV2_08_rep2() +
				
				"\tVegetative3_10_rep2:" + nrmBean.getV3_10_rep2() + "\tVegetative3_12_rep2:" + nrmBean.getV3_12_rep2() + "\tVegetative3_14_rep2:" + nrmBean.getV3_14_rep2() + 
				"\tVegetative3_16_rep2:" + nrmBean.getV3_16_rep2() + "\tVegetative3_18_rep2:" + nrmBean.getV3_18_rep2() + "\tVegetative3_20_rep2:" + nrmBean.getV3_20_rep2() +
				"\tVegetative3_22_rep2:" + nrmBean.getV3_22_rep2() + "\tVegetative3_00_rep2:" + nrmBean.getV3_00_rep2() + "\tVegetative3_02_rep2:" + nrmBean.getV3_02_rep2() +
				"\tVegetative3_04_rep2:" + nrmBean.getV3_04_rep2() + "\tVegetative3_06_rep2:" + nrmBean.getV3_06_rep2() + "\tVegetative3_08_rep2:" + nrmBean.getV3_08_rep2() +
				
				"\tVegetativeReproductive_10_rep2:" + nrmBean.getVr_10_rep2() + "\tVegetativeReproductive_12_rep2:" + nrmBean.getVr_12_rep2() + "\tVegetativeReproductive_14_rep2:" + nrmBean.getVr_14_rep2() + 
				"\tVegetativeReproductive_16_rep2:" + nrmBean.getVr_16_rep2() + "\tVegetativeReproductive_18_rep2:" + nrmBean.getVr_18_rep2() + "\tVegetativeReproductive_20_rep2:" + nrmBean.getVr_20_rep2() +
				"\tVegetativeReproductive_22_rep2:" + nrmBean.getVr_22_rep2() + "\tVegetativeReproductive_00_rep2:" + nrmBean.getVr_00_rep2() + "\tVegetativeReproductive_02_rep2:" + nrmBean.getVr_02_rep2() +
				"\tVegetativeReproductive_04_rep2:" + nrmBean.getVr_04_rep2() + "\tVegetativeReproductive_06_rep2:" + nrmBean.getVr_06_rep2() + "\tVegetativeReproductive_08_rep2:" + nrmBean.getVr_08_rep2() +
				
				"\tReproductive1_10_rep2:" + nrmBean.getRd1_10_rep2() + "\tReproductive1_12_rep2:" + nrmBean.getRd1_12_rep2() + "\tReproductive1_14_rep2:" + nrmBean.getRd1_14_rep2() + 
				"\tReproductive1_16_rep2:" + nrmBean.getRd1_16_rep2() + "\tReproductive1_18_rep2:" + nrmBean.getRd1_18_rep2() + "\tReproductive1_20_rep2:" + nrmBean.getRd1_20_rep2() +
				"\tReproductive1_22_rep2:" + nrmBean.getRd1_22_rep2() + "\tReproductive1_00_rep2:" + nrmBean.getRd1_00_rep2() + "\tReproductive1_02_rep2:" + nrmBean.getRd1_02_rep2() +
				"\tReproductive1_04_rep2:" + nrmBean.getRd1_04_rep2() + "\tReproductive1_06_rep2:" + nrmBean.getRd1_06_rep2() + "\tReproductive1_08_rep2:" + nrmBean.getRd1_08_rep2() +
				
				"\tReproductiveRipening_10_rep2:" + nrmBean.getRr_10_rep2() + "\tReproductiveRipening_12_rep2:" + nrmBean.getRr_12_rep2() + "\tReproductiveRipening_14_rep2:" + nrmBean.getRr_14_rep2() + 
				"\tReproductiveRipening_16_rep2:" + nrmBean.getRr_16_rep2() + "\tReproductiveRipening_18_rep2:" + nrmBean.getRr_18_rep2() + "\tReproductiveRipening_20_rep2:" + nrmBean.getRr_20_rep2() +
				"\tReproductiveRipening_22_rep2:" + nrmBean.getRr_22_rep2() + "\tReproductiveRipening_00_rep2:" + nrmBean.getRr_00_rep2() + "\tReproductiveRipening_02_rep2:" + nrmBean.getRr_02_rep2() +
				"\tReproductiveRipening_04_rep2:" + nrmBean.getRr_04_rep2() + "\tReproductiveRipening_06_rep2:" + nrmBean.getRr_06_rep2() + "\tReproductiveRipening_08_rep2:" + nrmBean.getRr_08_rep2() +
				
				"\tRipening1_10_rep2:" + nrmBean.getR1_10_rep2() + "\tRipening1_12_rep2:" + nrmBean.getR1_12_rep2() + "\tRipening1_14_rep2:" + nrmBean.getR1_14_rep2() + 
				"\tRipening1_16_rep2:" + nrmBean.getR1_16_rep2() + "\tRipening1_18_rep2:" + nrmBean.getR1_18_rep2() + "\tRipening1_20_rep2:" + nrmBean.getR1_20_rep2() +
				"\tRipening1_22_rep2:" + nrmBean.getR1_22_rep2() + "\tRipening1_00_rep2:" + nrmBean.getR1_00_rep2() + "\tRipening1_02_rep2:" + nrmBean.getR1_02_rep2() +
				"\tRipening1_04_rep2:" + nrmBean.getR1_04_rep2() + "\tRipening1_06_rep2:" + nrmBean.getR1_06_rep2() + "\tRipening1_08_rep2:" + nrmBean.getR1_08_rep2() +
				
				"\tRipening2_10_rep2:" + nrmBean.getR2_10_rep2() + "\tRipening2_12_rep2:" + nrmBean.getR2_12_rep2() + "\tRipening2_14_rep2:" + nrmBean.getR2_14_rep2() + 
				"\tRipening2_16_rep2:" + nrmBean.getR2_16_rep2() + "\tRipening2_18_rep2:" + nrmBean.getR2_18_rep2() + "\tRipening2_20_rep2:" + nrmBean.getR2_20_rep2() +
				"\tRipening2_22_rep2:" + nrmBean.getR2_22_rep2() + "\tRipening2_00_rep2:" + nrmBean.getR2_00_rep2() + "\tRipening2_02_rep2:" + nrmBean.getR2_02_rep2() +
				"\tRipening2_04_rep2:" + nrmBean.getR2_04_rep2() + "\tRipening2_06_rep2:" + nrmBean.getR2_06_rep2() + "\tRipening2_08_rep2:" + nrmBean.getR2_08_rep2() +
				
				//第三行
				"\nVegetative1_10_rep3:" + nrmBean.getV1_10_rep3() + "\tVegetative1_12_rep3:" + nrmBean.getV1_12_rep3() + "\tVegetative1_14_rep3:" + nrmBean.getV1_14_rep3() + 
				"\tVegetative1_16_rep3:" + nrmBean.getV1_16_rep3() + "\tVegetative1_18_rep3:" + nrmBean.getV1_18_rep3() + "\tVegetative1_20_rep3:" + nrmBean.getV1_20_rep3() +
				"\tVegetative1_22_rep3:" + nrmBean.getV1_22_rep3() + "\tVegetative1_00_rep3:" + nrmBean.getV1_00_rep3() + "\tVegetative1_02_rep3:" + nrmBean.getV1_02_rep3() +
				"\tVegetative1_04_rep3:" + nrmBean.getV1_04_rep3() + "\tVegetative1_06_rep3:" + nrmBean.getV1_06_rep3() + "\tVegetative1_08_rep3:" + nrmBean.getV1_08_rep3() +
				
				"\tVegetative2_10_rep3:" + nrmBean.getV2_10_rep3() + "\tVegetative2_12_rep3:" + nrmBean.getV2_12_rep3() + "\tVegetative2_14_rep3:" + nrmBean.getV2_14_rep3() + 
				"\tVegetative2_16_rep3:" + nrmBean.getV2_16_rep3() + "\tVegetative2_18_rep3:" + nrmBean.getV2_18_rep3() + "\tVegetative2_20_rep3:" + nrmBean.getV2_20_rep3() +
				"\tVegetative2_22_rep3:" + nrmBean.getV2_22_rep3() + "\tVegetative2_00_rep3:" + nrmBean.getV2_00_rep3() + "\tVegetative2_02_rep3:" + nrmBean.getV2_02_rep3() +
				"\tVegetative2_04_rep3:" + nrmBean.getV2_04_rep3() + "\tVegetative2_06_rep3:" + nrmBean.getV2_06_rep3() + "\tVegetative2_08_rep3:" + nrmBean.getV2_08_rep3() +
				
				"\tVegetative3_10_rep3:" + nrmBean.getV3_10_rep3() + "\tVegetative3_12_rep3:" + nrmBean.getV3_12_rep3() + "\tVegetative3_14_rep3:" + nrmBean.getV3_14_rep3() + 
				"\tVegetative3_16_rep3:" + nrmBean.getV3_16_rep3() + "\tVegetative3_18_rep3:" + nrmBean.getV3_18_rep3() + "\tVegetative3_20_rep3:" + nrmBean.getV3_20_rep3() +
				"\tVegetative3_22_rep3:" + nrmBean.getV3_22_rep3() + "\tVegetative3_00_rep3:" + nrmBean.getV3_00_rep3() + "\tVegetative3_02_rep3:" + nrmBean.getV3_02_rep3() +
				"\tVegetative3_04_rep3:" + nrmBean.getV3_04_rep3() + "\tVegetative3_06_rep3:" + nrmBean.getV3_06_rep3() + "\tVegetative3_08_rep3:" + nrmBean.getV3_08_rep3() +
				
				"\tVegetativeReproductive_10_rep3:" + nrmBean.getVr_10_rep3() + "\tVegetativeReproductive_12_rep3:" + nrmBean.getVr_12_rep3() + "\tVegetativeReproductive_14_rep3:" + nrmBean.getVr_14_rep3() + 
				"\tVegetativeReproductive_16_rep3:" + nrmBean.getVr_16_rep3() + "\tVegetativeReproductive_18_rep3:" + nrmBean.getVr_18_rep3() + "\tVegetativeReproductive_20_rep3:" + nrmBean.getVr_20_rep3() +
				"\tVegetativeReproductive_22_rep3:" + nrmBean.getVr_22_rep3() + "\tVegetativeReproductive_00_rep3:" + nrmBean.getVr_00_rep3() + "\tVegetativeReproductive_02_rep3:" + nrmBean.getVr_02_rep3() +
				"\tVegetativeReproductive_04_rep3:" + nrmBean.getVr_04_rep3() + "\tVegetativeReproductive_06_rep3:" + nrmBean.getVr_06_rep3() + "\tVegetativeReproductive_08_rep3:" + nrmBean.getVr_08_rep3() +
				
				"\tReproductive1_10_rep3:" + nrmBean.getRd1_10_rep3() + "\tReproductive1_12_rep3:" + nrmBean.getRd1_12_rep3() + "\tReproductive1_14_rep3:" + nrmBean.getRd1_14_rep3() + 
				"\tReproductive1_16_rep3:" + nrmBean.getRd1_16_rep3() + "\tReproductive1_18_rep3:" + nrmBean.getRd1_18_rep3() + "\tReproductive1_20_rep3:" + nrmBean.getRd1_20_rep3() +
				"\tReproductive1_22_rep3:" + nrmBean.getRd1_22_rep3() + "\tReproductive1_00_rep3:" + nrmBean.getRd1_00_rep3() + "\tReproductive1_02_rep3:" + nrmBean.getRd1_02_rep3() +
				"\tReproductive1_04_rep3:" + nrmBean.getRd1_04_rep3() + "\tReproductive1_06_rep3:" + nrmBean.getRd1_06_rep3() + "\tReproductive1_08_rep3:" + nrmBean.getRd1_08_rep3() +
				
				"\tReproductiveRipening_10_rep3:" + nrmBean.getRr_10_rep3() + "\tReproductiveRipening_12_rep3:" + nrmBean.getRr_12_rep3() + "\tReproductiveRipening_14_rep3:" + nrmBean.getRr_14_rep3() + 
				"\tReproductiveRipening_16_rep3:" + nrmBean.getRr_16_rep3() + "\tReproductiveRipening_18_rep3:" + nrmBean.getRr_18_rep3() + "\tReproductiveRipening_20_rep3:" + nrmBean.getRr_20_rep3() +
				"\tReproductiveRipening_22_rep3:" + nrmBean.getRr_22_rep3() + "\tReproductiveRipening_00_rep3:" + nrmBean.getRr_00_rep3() + "\tReproductiveRipening_02_rep3:" + nrmBean.getRr_02_rep3() +
				"\tReproductiveRipening_04_rep3:" + nrmBean.getRr_04_rep3() + "\tReproductiveRipening_06_rep3:" + nrmBean.getRr_06_rep3() + "\tReproductiveRipening_08_rep3:" + nrmBean.getRr_08_rep3() +
				
				"\tRipening1_10_rep3:" + nrmBean.getR1_10_rep3() + "\tRipening1_12_rep3:" + nrmBean.getR1_12_rep3() + "\tRipening1_14_rep3:" + nrmBean.getR1_14_rep3() + 
				"\tRipening1_16_rep3:" + nrmBean.getR1_16_rep3() + "\tRipening1_18_rep3:" + nrmBean.getR1_18_rep3() + "\tRipening1_20_rep3:" + nrmBean.getR1_20_rep3() +
				"\tRipening1_22_rep3:" + nrmBean.getR1_22_rep3() + "\tRipening1_00_rep3:" + nrmBean.getR1_00_rep3() + "\tRipening1_02_rep3:" + nrmBean.getR1_02_rep3() +
				"\tRipening1_04_rep3:" + nrmBean.getR1_04_rep3() + "\tRipening1_06_rep3:" + nrmBean.getR1_06_rep3() + "\tRipening1_08_rep3:" + nrmBean.getR1_08_rep3() +
				
				"\tRipening2_10_rep3:" + nrmBean.getR2_10_rep3() + "\tRipening2_12_rep3:" + nrmBean.getR2_12_rep3() + "\tRipening2_14_rep3:" + nrmBean.getR2_14_rep3() + 
				"\tRipening2_16_rep3:" + nrmBean.getR2_16_rep3() + "\tRipening2_18_rep3:" + nrmBean.getR2_18_rep3() + "\tRipening2_20_rep3:" + nrmBean.getR2_20_rep3() +
				"\tRipening2_22_rep3:" + nrmBean.getR2_22_rep3() + "\tRipening2_00_rep3:" + nrmBean.getR2_00_rep3() + "\tRipening2_02_rep3:" + nrmBean.getR2_02_rep3() +
				"\tRipening2_04_rep3:" + nrmBean.getR2_04_rep3() + "\tRipening2_06_rep3:" + nrmBean.getR2_06_rep3() + "\tRipening2_08_rep3:" + nrmBean.getR2_08_rep3() +
				
				
				//第四行
				"\nVegetative1_10_mean:" + nrmBean.getV1_10_mean() + "\tVegetative1_12_mean:" + nrmBean.getV1_12_mean() + "\tVegetative1_14_mean:" + nrmBean.getV1_14_mean() + 
				"\tVegetative1_16_mean:" + nrmBean.getV1_16_mean() + "\tVegetative1_18_mean:" + nrmBean.getV1_18_mean() + "\tVegetative1_20_mean:" + nrmBean.getV1_20_mean() +
				"\tVegetative1_22_mean:" + nrmBean.getV1_22_mean() + "\tVegetative1_00_mean:" + nrmBean.getV1_00_mean() + "\tVegetative1_02_mean:" + nrmBean.getV1_02_mean() +
				"\tVegetative1_04_mean:" + nrmBean.getV1_04_mean() + "\tVegetative1_06_mean:" + nrmBean.getV1_06_mean() + "\tVegetative1_08_mean:" + nrmBean.getV1_08_mean() +
				
				"\tVegetative2_10_mean:" + nrmBean.getV2_10_mean() + "\tVegetative2_12_mean:" + nrmBean.getV2_12_mean() + "\tVegetative2_14_mean:" + nrmBean.getV2_14_mean() + 
				"\tVegetative2_16_mean:" + nrmBean.getV2_16_mean() + "\tVegetative2_18_mean:" + nrmBean.getV2_18_mean() + "\tVegetative2_20_mean:" + nrmBean.getV2_20_mean() +
				"\tVegetative2_22_mean:" + nrmBean.getV2_22_mean() + "\tVegetative2_00_mean:" + nrmBean.getV2_00_mean() + "\tVegetative2_02_mean:" + nrmBean.getV2_02_mean() +
				"\tVegetative2_04_mean:" + nrmBean.getV2_04_mean() + "\tVegetative2_06_mean:" + nrmBean.getV2_06_mean() + "\tVegetative2_08_mean:" + nrmBean.getV2_08_mean() +
				
				"\tVegetative3_10_mean:" + nrmBean.getV3_10_mean() + "\tVegetative3_12_mean:" + nrmBean.getV3_12_mean() + "\tVegetative3_14_mean:" + nrmBean.getV3_14_mean() + 
				"\tVegetative3_16_mean:" + nrmBean.getV3_16_mean() + "\tVegetative3_18_mean:" + nrmBean.getV3_18_mean() + "\tVegetative3_20_mean:" + nrmBean.getV3_20_mean() +
				"\tVegetative3_22_mean:" + nrmBean.getV3_22_mean() + "\tVegetative3_00_mean:" + nrmBean.getV3_00_mean() + "\tVegetative3_02_mean:" + nrmBean.getV3_02_mean() +
				"\tVegetative3_04_mean:" + nrmBean.getV3_04_mean() + "\tVegetative3_06_mean:" + nrmBean.getV3_06_mean() + "\tVegetative3_08_mean:" + nrmBean.getV3_08_mean() +
				
				"\tVegetativeReproductive_10_mean:" + nrmBean.getVr_10_mean() + "\tVegetativeReproductive_12_mean:" + nrmBean.getVr_12_mean() + "\tVegetativeReproductive_14_mean:" + nrmBean.getVr_14_mean() + 
				"\tVegetativeReproductive_16_mean:" + nrmBean.getVr_16_mean() + "\tVegetativeReproductive_18_mean:" + nrmBean.getVr_18_mean() + "\tVegetativeReproductive_20_mean:" + nrmBean.getVr_20_mean() +
				"\tVegetativeReproductive_22_mean:" + nrmBean.getVr_22_mean() + "\tVegetativeReproductive_00_mean:" + nrmBean.getVr_00_mean() + "\tVegetativeReproductive_02_mean:" + nrmBean.getVr_02_mean() +
				"\tVegetativeReproductive_04_mean:" + nrmBean.getVr_04_mean() + "\tVegetativeReproductive_06_mean:" + nrmBean.getVr_06_mean() + "\tVegetativeReproductive_08_mean:" + nrmBean.getVr_08_mean() +
				
				"\tReproductive1_10_mean:" + nrmBean.getRd1_10_mean() + "\tReproductive1_12_mean:" + nrmBean.getRd1_12_mean() + "\tReproductive1_14_mean:" + nrmBean.getRd1_14_mean() + 
				"\tReproductive1_16_mean:" + nrmBean.getRd1_16_mean() + "\tReproductive1_18_mean:" + nrmBean.getRd1_18_mean() + "\tReproductive1_20_mean:" + nrmBean.getRd1_20_mean() +
				"\tReproductive1_22_mean:" + nrmBean.getRd1_22_mean() + "\tReproductive1_00_mean:" + nrmBean.getRd1_00_mean() + "\tReproductive1_02_mean:" + nrmBean.getRd1_02_mean() +
				"\tReproductive1_04_mean:" + nrmBean.getRd1_04_mean() + "\tReproductive1_06_mean:" + nrmBean.getRd1_06_mean() + "\tReproductive1_08_mean:" + nrmBean.getRd1_08_mean() +
				
				"\tReproductiveRipening_10_mean:" + nrmBean.getRr_10_mean() + "\tReproductiveRipening_12_mean:" + nrmBean.getRr_12_mean() + "\tReproductiveRipening_14_mean:" + nrmBean.getRr_14_mean() + 
				"\tReproductiveRipening_16_mean:" + nrmBean.getRr_16_mean() + "\tReproductiveRipening_18_mean:" + nrmBean.getRr_18_mean() + "\tReproductiveRipening_20_mean:" + nrmBean.getRr_20_mean() +
				"\tReproductiveRipening_22_mean:" + nrmBean.getRr_22_mean() + "\tReproductiveRipening_00_mean:" + nrmBean.getRr_00_mean() + "\tReproductiveRipening_02_mean:" + nrmBean.getRr_02_mean() +
				"\tReproductiveRipening_04_mean:" + nrmBean.getRr_04_mean() + "\tReproductiveRipening_06_mean:" + nrmBean.getRr_06_mean() + "\tReproductiveRipening_08_mean:" + nrmBean.getRr_08_mean() +
				
				"\tRipening1_10_mean:" + nrmBean.getR1_10_mean() + "\tRipening1_12_mean:" + nrmBean.getR1_12_mean() + "\tRipening1_14_mean:" + nrmBean.getR1_14_mean() + 
				"\tRipening1_16_mean:" + nrmBean.getR1_16_mean() + "\tRipening1_18_mean:" + nrmBean.getR1_18_mean() + "\tRipening1_20_mean:" + nrmBean.getR1_20_mean() +
				"\tRipening1_22_mean:" + nrmBean.getR1_22_mean() + "\tRipening1_00_mean:" + nrmBean.getR1_00_mean() + "\tRipening1_02_mean:" + nrmBean.getR1_02_mean() +
				"\tRipening1_04_mean:" + nrmBean.getR1_04_mean() + "\tRipening1_06_mean:" + nrmBean.getR1_06_mean() + "\tRipening1_08_mean:" + nrmBean.getR1_08_mean() +
				
				"\tRipening2_10_mean:" + nrmBean.getR2_10_mean() + "\tRipening2_12_mean:" + nrmBean.getR2_12_mean() + "\tRipening2_14_mean:" + nrmBean.getR2_14_mean() + 
				"\tRipening2_16_mean:" + nrmBean.getR2_16_mean() + "\tRipening2_18_mean:" + nrmBean.getR2_18_mean() + "\tRipening2_20_mean:" + nrmBean.getR2_20_mean() +
				"\tRipening2_22_mean:" + nrmBean.getR2_22_mean() + "\tRipening2_00_mean:" + nrmBean.getR2_00_mean() + "\tRipening2_02_mean:" + nrmBean.getR2_02_mean() +
				"\tRipening2_04_mean:" + nrmBean.getR2_04_mean() + "\tRipening2_06_mean:" + nrmBean.getR2_06_mean() + "\tRipening2_08_mean:" + nrmBean.getR2_08_mean() +
				
				
				//第五行
				"\nVegetative1_10_median:" + nrmBean.getV1_10_median() + "\tVegetative1_12_median:" + nrmBean.getV1_12_median() + "\tVegetative1_14_median:" + nrmBean.getV1_14_median() + 
				"\tVegetative1_16_median:" + nrmBean.getV1_16_median() + "\tVegetative1_18_median:" + nrmBean.getV1_18_median() + "\tVegetative1_20_median:" + nrmBean.getV1_20_median() +
				"\tVegetative1_22_median:" + nrmBean.getV1_22_median() + "\tVegetative1_00_median:" + nrmBean.getV1_00_median() + "\tVegetative1_02_median:" + nrmBean.getV1_02_median() +
				"\tVegetative1_04_median:" + nrmBean.getV1_04_median() + "\tVegetative1_06_median:" + nrmBean.getV1_06_median() + "\tVegetative1_08_median:" + nrmBean.getV1_08_median() +
				
				"\tVegetative2_10_median:" + nrmBean.getV2_10_median() + "\tVegetative2_12_median:" + nrmBean.getV2_12_median() + "\tVegetative2_14_median:" + nrmBean.getV2_14_median() + 
				"\tVegetative2_16_median:" + nrmBean.getV2_16_median() + "\tVegetative2_18_median:" + nrmBean.getV2_18_median() + "\tVegetative2_20_median:" + nrmBean.getV2_20_median() +
				"\tVegetative2_22_median:" + nrmBean.getV2_22_median() + "\tVegetative2_00_median:" + nrmBean.getV2_00_median() + "\tVegetative2_02_median:" + nrmBean.getV2_02_median() +
				"\tVegetative2_04_median:" + nrmBean.getV2_04_median() + "\tVegetative2_06_median:" + nrmBean.getV2_06_median() + "\tVegetative2_08_median:" + nrmBean.getV2_08_median() +
				
				"\tVegetative3_10_median:" + nrmBean.getV3_10_median() + "\tVegetative3_12_median:" + nrmBean.getV3_12_median() + "\tVegetative3_14_median:" + nrmBean.getV3_14_median() + 
				"\tVegetative3_16_median:" + nrmBean.getV3_16_median() + "\tVegetative3_18_median:" + nrmBean.getV3_18_median() + "\tVegetative3_20_median:" + nrmBean.getV3_20_median() +
				"\tVegetative3_22_median:" + nrmBean.getV3_22_median() + "\tVegetative3_00_median:" + nrmBean.getV3_00_median() + "\tVegetative3_02_median:" + nrmBean.getV3_02_median() +
				"\tVegetative3_04_median:" + nrmBean.getV3_04_median() + "\tVegetative3_06_median:" + nrmBean.getV3_06_median() + "\tVegetative3_08_median:" + nrmBean.getV3_08_median() +
				
				"\tVegetativeReproductive_10_median:" + nrmBean.getVr_10_median() + "\tVegetativeReproductive_12_median:" + nrmBean.getVr_12_median() + "\tVegetativeReproductive_14_median:" + nrmBean.getVr_14_median() + 
				"\tVegetativeReproductive_16_median:" + nrmBean.getVr_16_median() + "\tVegetativeReproductive_18_median:" + nrmBean.getVr_18_median() + "\tVegetativeReproductive_20_median:" + nrmBean.getVr_20_median() +
				"\tVegetativeReproductive_22_median:" + nrmBean.getVr_22_median() + "\tVegetativeReproductive_00_median:" + nrmBean.getVr_00_median() + "\tVegetativeReproductive_02_median:" + nrmBean.getVr_02_median() +
				"\tVegetativeReproductive_04_median:" + nrmBean.getVr_04_median() + "\tVegetativeReproductive_06_median:" + nrmBean.getVr_06_median() + "\tVegetativeReproductive_08_median:" + nrmBean.getVr_08_median() +
				
				"\tReproductive1_10_median:" + nrmBean.getRd1_10_median() + "\tReproductive1_12_median:" + nrmBean.getRd1_12_median() + "\tReproductive1_14_median:" + nrmBean.getRd1_14_median() + 
				"\tReproductive1_16_median:" + nrmBean.getRd1_16_median() + "\tReproductive1_18_median:" + nrmBean.getRd1_18_median() + "\tReproductive1_20_median:" + nrmBean.getRd1_20_median() +
				"\tReproductive1_22_median:" + nrmBean.getRd1_22_median() + "\tReproductive1_00_median:" + nrmBean.getRd1_00_median() + "\tReproductive1_02_median:" + nrmBean.getRd1_02_median() +
				"\tReproductive1_04_median:" + nrmBean.getRd1_04_median() + "\tReproductive1_06_median:" + nrmBean.getRd1_06_median() + "\tReproductive1_08_median:" + nrmBean.getRd1_08_median() +
				
				"\tReproductiveRipening_10_median:" + nrmBean.getRr_10_median() + "\tReproductiveRipening_12_median:" + nrmBean.getRr_12_median() + "\tReproductiveRipening_14_median:" + nrmBean.getRr_14_median() + 
				"\tReproductiveRipening_16_median:" + nrmBean.getRr_16_median() + "\tReproductiveRipening_18_median:" + nrmBean.getRr_18_median() + "\tReproductiveRipening_20_median:" + nrmBean.getRr_20_median() +
				"\tReproductiveRipening_22_median:" + nrmBean.getRr_22_median() + "\tReproductiveRipening_00_median:" + nrmBean.getRr_00_median() + "\tReproductiveRipening_02_median:" + nrmBean.getRr_02_median() +
				"\tReproductiveRipening_04_median:" + nrmBean.getRr_04_median() + "\tReproductiveRipening_06_median:" + nrmBean.getRr_06_median() + "\tReproductiveRipening_08_median:" + nrmBean.getRr_08_median() +
				
				"\tRipening1_10_median:" + nrmBean.getR1_10_median() + "\tRipening1_12_median:" + nrmBean.getR1_12_median() + "\tRipening1_14_median:" + nrmBean.getR1_14_median() + 
				"\tRipening1_16_median:" + nrmBean.getR1_16_median() + "\tRipening1_18_median:" + nrmBean.getR1_18_median() + "\tRipening1_20_median:" + nrmBean.getR1_20_median() +
				"\tRipening1_22_median:" + nrmBean.getR1_22_median() + "\tRipening1_00_median:" + nrmBean.getR1_00_median() + "\tRipening1_02_median:" + nrmBean.getR1_02_median() +
				"\tRipening1_04_median:" + nrmBean.getR1_04_median() + "\tRipening1_06_median:" + nrmBean.getR1_06_median() + "\tRipening1_08_median:" + nrmBean.getR1_08_median() +
				
				"\tRipening2_10_median:" + nrmBean.getR2_10_median() + "\tRipening2_12_median:" + nrmBean.getR2_12_median() + "\tRipening2_14_median:" + nrmBean.getR2_14_median() + 
				"\tRipening2_16_median:" + nrmBean.getR2_16_median() + "\tRipening2_18_median:" + nrmBean.getR2_18_median() + "\tRipening2_20_median:" + nrmBean.getR2_20_median() +
				"\tRipening2_22_median:" + nrmBean.getR2_22_median() + "\tRipening2_00_median:" + nrmBean.getR2_00_median() + "\tRipening2_02_median:" + nrmBean.getR2_02_median() +
				"\tRipening2_04_median:" + nrmBean.getR2_04_median() + "\tRipening2_06_median:" + nrmBean.getR2_06_median() + "\tRipening2_08_median:" + nrmBean.getR2_08_median() ;
		WriteUtil.writeTxt(nrmContext, nrmFilePath);
	}

}
