package com.novelbio.gene.qtl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.commons.io.monitor.FileAlterationListener;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.novelbio.base.dataOperate.TxtReadandWrite;

@PipelineName("qtlEntryResultPipelines")
public class QtlEntryResultPipelines implements Pipeline<QtlEntry> {

	@Override
	public void process(QtlEntry entry) {
		TxtReadandWrite trw = null;
		try {
			// 写入文件
			String path = "/home/novelbio/桌面/QtlEntry.txt";

			trw = new TxtReadandWrite(new FileOutputStream(new File(path)));

			StringBuffer context = new StringBuffer();
			context.append(entry.getId()).append("\t").append(entry.getQtl()).append("\t").append(entry.getMajor())
					.append("\t").append(entry.getObjectCharacter()).append("\t").append(entry.getCharacter())
					.append("\t").append(entry.getMarker()).append("\t").append(entry.getDetermination()).append("\t")
					.append(entry.getChr()).append("\t").append(entry.getStartGenome()).append("\t")
					.append(entry.getEndGenome()).append("\t").append(entry.getGenomeView()).append("\t")
					.append(entry.getMappingMethod()).append("\t").append(entry.getPopulation()).append("\t")
					.append(entry.getNoPlants()).append("\t").append(entry.getLod()).append("\t")
					.append(entry.getParentA()).append("\t").append(entry.getParentB()).append("\t")
					.append(entry.getDirection()).append("\t").append(entry.getReferenceSource()).append("\t")
					.append(entry.getReferenceNo()).append("\t").append(entry.getPhysical()).append("\t")
					.append(entry.getFine1()).append("\t").append(entry.getFine2()).append("\t")
					.append(entry.getFine3()).append("\t").append(entry.getInterval1()).append("\t")
					.append(entry.getInterval2()).append("\t").append(entry.getInterval3()).append("\t")
					.append(entry.getCoSegregated()).append("\t").append(entry.getExplained()).append("\t")
					.append(entry.getAdditive()).append("\t").append(entry.getYear());
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
