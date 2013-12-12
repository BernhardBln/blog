package de.bstreit.java.blog.sample03.config;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import de.bstreit.java.blog.sample03.StarterDev;
import de.bstreit.java.blog.sample03.database.IDatabaseHelper;
import de.bstreit.java.blog.sample03.database.SandboxDatabaseHelper;
import de.bstreit.java.blog.sample03.filereader.FileReadHelper;
import de.bstreit.java.blog.sample03.filereader.IFileReadHelper;


@Configuration
@ComponentScan(basePackageClasses = StarterDev.class)
public class ProdConfig {

  @Inject
  @Primary
  @Bean
  public IDatabaseHelper getDatabaseHelper(SandboxDatabaseHelper databaseHelper) {
    return databaseHelper;
  }

  @Inject
  @Primary
  @Bean
  public IFileReadHelper getFileReadHelper(FileReadHelper fileReadHelper) {
    return fileReadHelper;
  }

}
