package de.bstreit.java.blog.sample02.beans.filereader;

import java.io.File;
import java.io.IOException;

import javax.inject.Named;

import de.bstreit.java.blog.sample02.beans.copier.MyObjects;

@Named
public class SandboxFileReadHelper implements IFileReadHelper {

	@Override
	public MyObjects readFile(File fromFile) throws IOException {
		return new MyObjects("line 1", "line 2", "line 3");
	}

}
