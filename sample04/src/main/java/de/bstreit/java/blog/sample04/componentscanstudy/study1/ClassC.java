package de.bstreit.java.blog.sample04.componentscanstudy.study1;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
public class ClassC {

  private Logger logger = LoggerFactory.getLogger(ClassC.class);


  public ClassC() {
    logger.info("Created C");
  }
}
