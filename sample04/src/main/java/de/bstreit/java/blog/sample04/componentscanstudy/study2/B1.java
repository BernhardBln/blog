package de.bstreit.java.blog.sample04.componentscanstudy.study2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.bstreit.java.blog.sample04.componentscanstudy.study1.ClassC;


public class B1 implements IB {

  private Logger logger = LoggerFactory.getLogger(ClassC.class);


  public B1() {
    logger.info("Creating B1 instance");
  }
}