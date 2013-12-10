package de.bstreit.java.blog.sample02.beans;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import de.bstreit.java.blog.sample02.beans.copier.FileToDBCopier;

@Named
public class Application {

  @Inject
  private FileToDBCopier fileToDBCopier;


  /**
   * Starting point for the application.
   * 
   * @throws IOException
   */
  public void start() throws IOException {
    fileToDBCopier.startCopying(new File("test"));
  }
}
