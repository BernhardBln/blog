package de.bstreit.java.blog.sample03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import de.bstreit.java.blog.sample03.application.Application;
import de.bstreit.java.blog.sample03.copier.FileToDBCopier;
import de.bstreit.java.blog.sample03.database.IDatabaseHelper;
import de.bstreit.java.blog.sample03.database.SandboxDatabaseHelper;

@Configuration
@ComponentScan(basePackageClasses = { Application.class, FileToDBCopier.class })
class GeneralConfig {

  @Bean
  public IDatabaseHelper getDatabaseHelper() {
    return new SandboxDatabaseHelper();
  }

}
