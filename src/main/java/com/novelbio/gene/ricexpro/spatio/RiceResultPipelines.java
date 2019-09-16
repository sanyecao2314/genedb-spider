package com.novelbio.gene.ricexpro.spatio;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.novelbio.gene.qtl.QtlBean;
import com.novelbio.gene.qtl.QtlList;
import com.novelbio.gene.ricexpro.samplelist.RXP_009Bean;
import com.novelbio.gene.ricexpro.samplelist.part3.WriteUtil;

@PipelineName("riceResultPipelines")
public class RiceResultPipelines implements Pipeline<RiceBeanList> {

	//public static List<HttpRequest> featureRequests = new ArrayList<HttpRequest>();

	@Override
	public void process(RiceBeanList riceBeanList) {
		String path = "/home/novelbio/桌面/feature_" + riceBeanList.getRxp() + ".csv";
		

		System.out.println(JSON.toJSONString(riceBeanList.getRiceBeans()));
		System.out.println(JSON.toJSONString(riceBeanList.getRiceSpecBeans()));
		// 获得所有正常行对象的集合
		List<RiceBean> ricBeans = riceBeanList.getRiceBeans();
		// 获得所有特殊行对象的集合
		List<RiceSpecBean> specBeans = riceBeanList.getRiceSpecBeans();
		for (int i = 0; i < ricBeans.size(); i++) {
			RiceBean riceBean = ricBeans.get(i);
			// 对表格合并行进行处理
			if (riceBean.getLocusID() == null) {
				RiceSpecBean specBean = specBeans.get(i);
				riceBean.setLocusID(ricBeans.get(i - 1).getLocusID());
				riceBean.setLocusID(riceBean.getLocusID());
				riceBean.setFeatureNum(specBean.getFeatureNum());
				riceBean.setAccession(specBean.getAccession());
				riceBean.setSequenceID(specBean.getSequenceID());
				riceBean.setDescription(specBean.getDescription());
				riceBean.setMsuID(specBean.getMsuID());
			}

			// 将行对象内容按格式写入文档
			String result = riceBean.getLocusID() + "\t" + riceBean.getFeatureNum() + "\t" + riceBean.getAccession()
					+ "\t" + riceBean.getSequenceID() + "\t" + riceBean.getDescription() + "\t" + riceBean.getMsuID();
			WriteUtil.writeTxt(result, path);

		}

		// 深度抓取
		process(riceBeanList, ricBeans);
	}

	private void process(RiceBeanList riceBeanList, List<RiceBean> ricBeans) {

		if (ricBeans == null) {
			return;
		}
		for (RiceBean riceBean : ricBeans) {
			String featureNum = riceBean.getFeatureNum();
			if (featureNum != null) {
				String featureUrl = "http://ricexpro.dna.affrc.go.jp/" + riceBeanList.getRxp() + "/view-plot-data.php?featurenum="
						+ featureNum;
				HttpRequest currRequest = riceBeanList.getRequest(); //
				System.out.println(featureUrl); // 将feature地址暂存起来
				//featureRequests.add(currRequest.subRequest(featureUrl));
			}

		}

	}

}
