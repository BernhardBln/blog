package de.bstreit.java.blog.sample04.componentscanstudy.study2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Starter {

  public static void main(String[] args) {
    final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        Config.class);

    try {
      final ANamed aBean = context.getBean(ANamed.class);
      System.out.println(aBean);

      final IB bBean = context.getBean(IB.class);
      System.out.println(bBean);

    } finally {
      context.close();
    }
  }

}
