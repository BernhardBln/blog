package de.bstreit.java.blog.sample02.beans.filereader;

import java.io.File;
import java.io.IOException;

import de.bstreit.java.blog.sample02.beans.copier.MyObjects;


public interface IFileReadHelper {

  public MyObjects readFile(File fromFile) throws IOException;

}