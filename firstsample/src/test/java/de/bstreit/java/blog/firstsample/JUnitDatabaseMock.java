package de.bstreit.java.blog.firstsample;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

/**
 * Does not write to db, only saves all lines that were saved to the DB.
 * 
 * @author streit
 */
@Named
public class JUnitDatabaseMock implements IDatabaseHelper {

	private List<String> lines = new ArrayList<String>();


	@Override
	public void writeToDB(MyObjects data) {
		for (String line : data.getLines()) {
			lines.add(line);
		}
	}

	List<String> getLines() {
		return lines;
	}
}
