package de.bstreit.java.blog.sample04.componentscanstudy.study2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackageClasses = Starter.class)
public class Config {

  @Bean
  public IB getB1() {
    return new B1();
  }

}
