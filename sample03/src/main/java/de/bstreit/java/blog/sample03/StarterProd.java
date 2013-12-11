package de.bstreit.java.blog.sample03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import de.bstreit.java.blog.sample03.application.Application;

/**
 * Uses real FileReadHelper and System-out-DatabaseHelper.
 * 
 * @author streit
 */
public class StarterProd {

  public static void main(String[] args) throws Exception {
    final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    try {
      context.getEnvironment().addActiveProfile("prod");
      context.register(Config.class);

      context.refresh();

      final Application app = context.getBean(Application.class);
      app.start();

    } finally {
      context.close();
    }
  }

}
