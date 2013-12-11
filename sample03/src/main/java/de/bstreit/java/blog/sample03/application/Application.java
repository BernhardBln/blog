package de.bstreit.java.blog.sample03.application;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.inject.Inject;
import javax.inject.Named;

import de.bstreit.java.blog.sample03.copier.FileToDBCopier;

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
    fileToDBCopier.startCopying(getLinesFileFromClasspath());
  }

  /**
   * The file lines.txt is located under "src/test/resources". Maven copies it
   * into the target folder, along with the compiled classes. Since it is then
   * part of the class path, we can use
   * {@link ClassLoader#getSystemResource(String)} in order to get its path.
   * 
   * @return the desired file
   */
  private File getLinesFileFromClasspath() {
    final URL resourceURL = ClassLoader.getSystemResource("lines.txt");
    final String filename = resourceURL.getFile();
    return new File(filename);
  }
}
