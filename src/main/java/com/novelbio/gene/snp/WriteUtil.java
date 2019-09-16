package com.novelbio.gene.snp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUtil {
	public static void writeTxt(String context, String filePath) {

		try {
			FileOutputStream fos = new FileOutputStream(filePath, true);
			// true表示在文件末尾追加
			fos.write(context.getBytes());
			fos.write("\n".getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
