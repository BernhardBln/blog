package de.bstreit.java.blog.sample04.componentscanstudy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import de.bstreit.java.blog.sample04.componentscanstudy.beans.ABean;


public class Starter {

  public static void main(String[] args) {
    final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
        MainConfig.class);

    try {
      final ABean aBean = context.getBean(ABean.class);
      System.out.println(aBean);

    } finally {
      context.close();
    }
  }

}
