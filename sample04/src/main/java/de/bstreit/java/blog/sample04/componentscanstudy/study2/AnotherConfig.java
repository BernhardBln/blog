package de.bstreit.java.blog.sample04.componentscanstudy.study2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

// This config causes a NoUniqueBeanDefinitionException 
// if you uncomment the @Configuration annotation

// @Configuration
@ComponentScan(basePackageClasses = Starter.class)
public class AnotherConfig {

  @Bean
  public IB getB2() {
    return new B2();
  }

}
