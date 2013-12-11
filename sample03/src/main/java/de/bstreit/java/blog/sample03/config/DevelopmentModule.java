package de.bstreit.java.blog.sample03.config;

import com.google.inject.AbstractModule;

import de.bstreit.java.blog.sample03.database.IDatabaseHelper;
import de.bstreit.java.blog.sample03.database.SandboxDatabaseHelper;
import de.bstreit.java.blog.sample03.filereader.IFileReadHelper;
import de.bstreit.java.blog.sample03.filereader.SandboxFileReadHelper;

public class DevelopmentModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(IDatabaseHelper.class).to(SandboxDatabaseHelper.class);
    bind(IFileReadHelper.class).to(SandboxFileReadHelper.class);
  }

}