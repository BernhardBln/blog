package de.bstreit.java.blog.sample03;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.bstreit.java.blog.sample03.config.TestModule;
import de.bstreit.java.blog.sample03.copier.FileToDBCopier;

/**
 * Uses mocked FileReadHelper and the JUnit-MockedDatabaseHelper.
 * 
 * @author streit
 */
public class FileToDBCopierTest {

  /**
   * Here we test if the contents of the file "lines.txt" was correctly copied
   * into our mocked database.
   * 
   * @throws Exception
   */
  @Test
  public void testCopy() throws Exception {
    final Injector injector = Guice.createInjector(new TestModule());
    // INIT
    final File fileWithLines = new File("dummy");
    final FileToDBCopier copier = injector.getInstance(FileToDBCopier.class);

    // RUN
    copier.startCopying(fileWithLines);

    // ASSERT
    final JUnitDatabaseMock jUnitDatabaseMock = injector.getInstance(JUnitDatabaseMock.class);
    final List<String> actualLines = jUnitDatabaseMock.getLines();
    final List<String> expectedLines = Arrays.asList("line 1", "line 2", "line 3");

    Assert.assertEquals(expectedLines, actualLines);
  }


}
