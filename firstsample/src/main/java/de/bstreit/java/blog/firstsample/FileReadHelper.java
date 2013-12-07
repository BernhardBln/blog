package de.bstreit.java.blog.firstsample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.inject.Named;

@Named
public class FileReadHelper {

	public MyObjects readFile(File fromFile) throws IOException {

		final MyObjects myObjects = new MyObjects();
		final BufferedReader reader = new BufferedReader(new FileReader(fromFile));

		readLines(myObjects, reader);

		return myObjects;
	}

	private void readLines(final MyObjects myObjects, final BufferedReader reader) throws IOException {
		String line;

		try {

			while ((line = reader.readLine()) != null) {
				myObjects.addLine(line);
			}

		} finally {
			reader.close();
		}
	}
}
