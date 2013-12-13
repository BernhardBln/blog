package de.bstreit.java.blog.sample03.config;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import de.bstreit.java.blog.sample03.filereader.FileReadHelper;
import de.bstreit.java.blog.sample03.filereader.IFileReadHelper;


@Configuration
@Import(AbstractConfig.class)
public class ProdConfig {

  @Inject
  @Primary
  @Bean
  public IFileReadHelper getFileReadHelper(FileReadHelper fileReadHelper) {
    return fileReadHelper;
  }

}
