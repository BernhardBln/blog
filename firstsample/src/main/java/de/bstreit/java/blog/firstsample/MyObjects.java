package de.bstreit.java.blog.firstsample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MyObjects {

	final List<String> data = new ArrayList<String>();


	public void addLine(String line) {
		data.add(line);
	}

	public List<String> getLines() {
		return Collections.unmodifiableList(data);
	}
}
