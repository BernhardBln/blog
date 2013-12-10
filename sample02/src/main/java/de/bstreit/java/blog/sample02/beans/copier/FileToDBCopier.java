package de.bstreit.java.blog.sample02.beans.copier;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import de.bstreit.java.blog.sample02.beans.database.IDatabaseHelper;
import de.bstreit.java.blog.sample02.beans.filereader.IFileReadHelper;

@Named
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