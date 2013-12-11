package de.bstreit.java.blog.sample03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import de.bstreit.java.blog.sample03.filereader.IFileReadHelper;
import de.bstreit.java.blog.sample03.filereader.SandboxFileReadHelper;


@Configuration
@Import(GeneralConfig.class)
public class DevConfig {

  @Bean
  public IFileReadHelper getFileReadHelper() {
    return new SandboxFileReadHelper();
  }

}
