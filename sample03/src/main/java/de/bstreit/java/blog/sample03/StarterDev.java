package de.bstreit.java.blog.sample03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import de.bstreit.java.blog.sample03.application.Application;
import de.bstreit.java.blog.sample03.config.DevConfig;

/**
 * Uses mocked FileReadHelper and System-out-DatabaseHelper.
 * 
 * @author streit
 */
public class StarterDev {

  public static void main(String[] args) throws Exception {
    final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DevConfig.class);

    try {
      final Application app = context.getBean(Application.class);
      app.start();

    } finally {
      context.close();
    }
  }

}
