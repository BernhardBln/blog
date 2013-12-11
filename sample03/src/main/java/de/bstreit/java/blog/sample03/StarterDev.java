package de.bstreit.java.blog.sample03;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.bstreit.java.blog.sample03.application.Application;
import de.bstreit.java.blog.sample03.config.TestModule;

/**
 * Uses mocked FileReadHelper and System-out-DatabaseHelper.
 * 
 * @author streit
 */
public class StarterDev {

  public static void main(String[] args) throws Exception {
    final Injector injector = Guice.createInjector(new TestModule());

    final Application app = injector.getInstance(Application.class);
    app.start();
  }

}
