package de.bstreit.java.blog.sample03.filereader;

import java.io.File;
import java.io.IOException;

import javax.inject.Named;
import javax.inject.Singleton;

import de.bstreit.java.blog.sample03.copier.MyObjects;

@Named
@Singleton
public class SandboxFileReadHelper implements IFileReadHelper {

  @Override
  public MyObjects readFile(File fromFile) throws IOException {
    return new MyObjects("line 1", "line 2", "line 3");
  }

}
