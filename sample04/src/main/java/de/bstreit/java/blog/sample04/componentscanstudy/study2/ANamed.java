package de.bstreit.java.blog.sample04.componentscanstudy.study2;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
public class ANamed {

  private Logger logger = LoggerFactory.getLogger(ANamed.class);


  public ANamed() {
    logger.info("Creating ANamed instance");
  }
}
