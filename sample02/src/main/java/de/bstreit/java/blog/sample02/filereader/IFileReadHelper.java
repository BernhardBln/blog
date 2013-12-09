package de.bstreit.java.blog.sample02.filereader;

import java.io.File;
import java.io.IOException;

import de.bstreit.java.blog.sample02.copier.MyObjects;


public interface IFileReadHelper {

  public MyObjects readFile(File fromFile) throws IOException;

}