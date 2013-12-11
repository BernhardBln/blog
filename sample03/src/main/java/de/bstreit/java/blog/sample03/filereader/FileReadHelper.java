package de.bstreit.java.blog.sample03.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.inject.Named;
import javax.inject.Singleton;

import de.bstreit.java.blog.sample03.copier.MyObjects;

@Named
@Singleton
public class FileReadHelper implements IFileReadHelper {

  @Override
  public MyObjects readFile(File fromFile) throws IOException {

    final BufferedReader reader = new BufferedReader(new FileReader(fromFile));

    try {
      final MyObjects myObjects = new MyObjects();
      readLines(reader, myObjects);
      return myObjects;

    } finally {
      reader.close();
    }

  }

  private void readLines(final BufferedReader reader, final MyObjects myObjects) throws IOException {
    String line;
    while ((line = reader.readLine()) != null) {
      myObjects.addLine(line);
    }
  }

}
