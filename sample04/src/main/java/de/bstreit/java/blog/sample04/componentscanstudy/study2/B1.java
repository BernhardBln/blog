package de.bstreit.java.blog.sample04.componentscanstudy.study2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class B1 implements IB {

  private Logger logger = LoggerFactory.getLogger(B1.class);


  public B1() {
    logger.info("Creating B1 instance");
  }
}
