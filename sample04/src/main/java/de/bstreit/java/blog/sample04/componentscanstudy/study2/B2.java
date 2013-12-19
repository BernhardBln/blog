package de.bstreit.java.blog.sample04.componentscanstudy.study2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class B2 implements IB {

  private Logger logger = LoggerFactory.getLogger(B2.class);


  public B2() {
    logger.info("Creating B2 instance");
  }
}
