package de.bstreit.java.blog.sample02;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {

  public static void main(String[] args) throws Exception {
    final ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    try {

      final Application app = context.getBean(Application.class);
      app.start();

    } finally {
      context.close();
    }
  }

}
