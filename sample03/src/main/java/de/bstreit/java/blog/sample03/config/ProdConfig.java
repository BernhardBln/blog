package de.bstreit.java.blog.sample03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import de.bstreit.java.blog.sample03.filereader.FileReadHelper;
import de.bstreit.java.blog.sample03.filereader.IFileReadHelper;


@Configuration
@Import(GeneralConfig.class)
public class ProdConfig {

  @Bean
  public IFileReadHelper getFileReadHelper() {
    return new FileReadHelper();
  }

}
