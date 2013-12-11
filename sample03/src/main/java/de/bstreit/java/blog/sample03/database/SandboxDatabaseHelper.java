package de.bstreit.java.blog.sample03.database;

import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.context.annotation.Profile;

import de.bstreit.java.blog.sample03.copier.MyObjects;

@Named
@Singleton
@Profile({ "dev", "prod" })
public class SandboxDatabaseHelper implements IDatabaseHelper {

  @Override
  public void writeToDB(MyObjects data) {
    System.out.println("Simulating database write:");
    for (String line : data.getLines()) {
      System.out.println(" > " + line);
    }
  }

}
