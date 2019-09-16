package com.novelbio.gene.ricexpro.allrice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;

@PipelineName("riceResultPipelines")
public class RiceResultPipelines implements Pipeline<RiceBeanList> {

	// public static List<HttpRequest> featureRequests = new
	// ArrayList<HttpRequest>();

	@Override
	public void process(RiceBeanList riceBeanList) {
		TxtReadandWrite trw = null;
		try {
			String path = "/home/novelbio/桌面/feature_" + riceBeanList.getRxp() + ".csv";

			trw = new TxtReadandWrite(new FileOutputStream(new File(path), true));

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
				StringBuffer result = new StringBuffer();
				result.append(riceBean.getLocusID()).append("\t").append(riceBean.getFeatureNum()).append("\t")
						.append(riceBean.getAccession()).append("\t").append(riceBean.getSequenceID()).append("\t")
						.append(riceBean.getDescription()).append("\t").append(riceBean.getMsuID());
				trw.writefile(result.append("\n").toString(), true);

			}

			// 深度抓取
			process(riceBeanList, ricBeans);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (trw != null) {
				trw.close();
			}
		}
	}

	private void process(RiceBeanList riceBeanList, List<RiceBean> ricBeans) {
		TxtReadandWrite trw = null;
		try {
			if (ricBeans == null) {
				return;
			}
			String urlPath = "/home/novelbio/桌面/signalUrl_" + riceBeanList.getRxp() + ".csv";
			trw = new TxtReadandWrite(new FileOutputStream(new File(urlPath), true));
			for (RiceBean riceBean : ricBeans) {
				String featureNum = riceBean.getFeatureNum();
				if (featureNum != null) {
					String featureUrl = "http://ricexpro.dna.affrc.go.jp/" + riceBeanList.getRxp()
							+ "/view-plot-data.php?featurenum=" + featureNum;
					// HttpRequest currRequest = riceBeanList.getRequest(); //
					System.out.println(featureUrl); // 将feature地址暂存起来
					// featureRequests.add(currRequest.subRequest(featureUrl));

					trw.writefile(featureUrl + "\n");

				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (trw != null) {
				trw.close();
			}
		}

	}

}
