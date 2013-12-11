package de.bstreit.java.blog.sample03.filereader;

import java.io.File;
import java.io.IOException;

import de.bstreit.java.blog.sample03.copier.MyObjects;


public interface IFileReadHelper {

  public MyObjects readFile(File fromFile) throws IOException;

}