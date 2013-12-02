package de.bstreit.java.blog.firstsample;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class FileToDBCopier {

	@Inject
	private IDatabaseHelper dbHelper;

	@Inject
	private FileReadHelper fileReadHelper;


	public void startCopying(File fromFile) throws IOException {
		MyObjects data = fileReadHelper.readFile(fromFile);
		dbHelper.writeToDB(data);
	}

}