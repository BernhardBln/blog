package de.bstreit.java.blog.sample03.copier;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import de.bstreit.java.blog.sample03.database.IDatabaseHelper;
import de.bstreit.java.blog.sample03.filereader.IFileReadHelper;

@Named
@Singleton
public class FileToDBCopier {

  @Inject
  private IDatabaseHelper dbHelper;

  @Inject
  private IFileReadHelper fileReadHelper;


  public void startCopying(File fromFile) throws IOException {
    MyObjects data = fileReadHelper.readFile(fromFile);
    dbHelper.writeToDB(data);
  }

}