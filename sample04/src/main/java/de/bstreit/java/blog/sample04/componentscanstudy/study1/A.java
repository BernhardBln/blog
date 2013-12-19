package de.bstreit.java.blog.sample04.componentscanstudy.study1;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class A {

  @Inject
  private B b;


  public void printB() {
    System.out.println("B: " + b);
  }
}
