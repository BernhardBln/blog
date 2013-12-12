package de.bstreit.java.blog.sample03.config;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import de.bstreit.java.blog.sample03.JUnitDatabaseMock;
import de.bstreit.java.blog.sample03.StarterDev;
import de.bstreit.java.blog.sample03.database.IDatabaseHelper;
import de.bstreit.java.blog.sample03.filereader.IFileReadHelper;
import de.bstreit.java.blog.sample03.filereader.SandboxFileReadHelper;


@Configuration
@ComponentScan(basePackageClasses = StarterDev.class)
public class TestConfig {

  @Inject
  @Primary
  @Bean
  public IDatabaseHelper getDatabaseHelper(JUnitDatabaseMock databaseHelper) {
    return databaseHelper;
  }

  @Inject
  @Primary
  @Bean
  public IFileReadHelper getFileReadHelper(SandboxFileReadHelper fileReadHelper) {
    return fileReadHelper;
  }

}
