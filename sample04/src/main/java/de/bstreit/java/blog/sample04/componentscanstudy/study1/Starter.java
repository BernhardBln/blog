package de.bstreit.java.blog.sample04.componentscanstudy.study1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Starter {

  public static void main(String[] args) throws Exception {

    final ConfigurableApplicationContext context =
        new AnnotationConfigApplicationContext(Starter.class);
    try {
      final A a = context.getBean(A.class);
      a.printB();

    } finally {
      context.close();
    }
  }
}