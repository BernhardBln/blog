package de.bstreit.java.blog.sample02.database;

import javax.inject.Named;

import de.bstreit.java.blog.sample02.copier.MyObjects;

@Named
public class SandboxDatabaseHelper implements IDatabaseHelper {

	@Override
	public void writeToDB(MyObjects data) {
		System.out.println("Simulating database write:");
		for (String line : data.getLines()) {
			System.out.println(" > " + line);
		}
	}

}
