package de.bstreit.java.blog.sample02.beans.copier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MyObjects {

  final List<String> data = new ArrayList<String>();


  public MyObjects() {

  }

  public MyObjects(String... lines) {
    data.addAll(Arrays.asList(lines));
  }

  public void addLine(String line) {
    data.add(line);
  }

  public List<String> getLines() {
    return Collections.unmodifiableList(data);
  }
}
