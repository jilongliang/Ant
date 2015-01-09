package com.ant.tool.extend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

/**
 *@Date:2015-1-9
 *@Author:liangjilong
 *@Email:jilongliang@sina.com
 *@Version:1.0
 *@Description£º×Ô¶¨ÒåTask
 */
public class AntTasks extends Task {
	private File srcFile;
	private File destFile;
	@Override
	public void execute() throws BuildException {
		try {
			BufferedReader fromFile = new BufferedReader(
					new FileReader(srcFile));
			BufferedWriter toFile = new BufferedWriter(new FileWriter(destFile));

			List<String> list = new ArrayList<String>();
			String line = fromFile.readLine();
			while (line != null) {
				list.add(line);
				line = fromFile.readLine();
			}
			Collections.sort(list);
			for (ListIterator<String> li = list.listIterator(); li.hasNext();) {
				String str = li.next();
				toFile.write(str);
				toFile.newLine();
			}
			fromFile.close();
			toFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	
	public File getSrcFile() {
		return srcFile;
	}

	public void setSrcFile(File srcFile) {
		this.srcFile = srcFile;
	}

	public File getDestFile() {
		return destFile;
	}

	public void setDestFile(File destFile) {
		this.destFile = destFile;
	}

}
