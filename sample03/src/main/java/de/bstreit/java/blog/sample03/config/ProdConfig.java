package de.bstreit.java.blog.sample03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import de.bstreit.java.blog.sample03.filereader.FileReadHelper;
import de.bstreit.java.blog.sample03.filereader.IFileReadHelper;


@Configuration
@ComponentScan
public class ProdConfig {

  @Bean
  public IFileReadHelper getFileReadHelper() {
    return new FileReadHelper();
  }

}
