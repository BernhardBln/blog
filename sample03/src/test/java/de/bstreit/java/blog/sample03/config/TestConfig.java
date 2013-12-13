package de.bstreit.java.blog.sample03.config;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import de.bstreit.java.blog.sample03.JUnitDatabaseMock;
import de.bstreit.java.blog.sample03.database.IDatabaseHelper;


@Configuration
@Import(AbstractConfig.class)
public class TestConfig {

  @Inject
  @Primary
  @Bean
  public IDatabaseHelper getDatabaseHelper(JUnitDatabaseMock databaseHelper) {
    return databaseHelper;
  }


}
