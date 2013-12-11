package de.bstreit.java.blog.sample03;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import de.bstreit.java.blog.sample03.config.TestConfig;
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
    final ConfigurableApplicationContext context = getContext();
    try {
      // INIT
      final File fileWithLines = getLinesFileFromClasspath();
      final FileToDBCopier copier = context.getBean(FileToDBCopier.class);

      // RUN
      copier.startCopying(fileWithLines);

      // ASSERT
      final JUnitDatabaseMock jUnitDatabaseMock = context.getBean(JUnitDatabaseMock.class);
      final List<String> actualLines = jUnitDatabaseMock.getLines();
      final List<String> expectedLines = Arrays.asList("line 1", "line 2", "line 3");

      Assert.assertEquals(expectedLines, actualLines);

    } finally {
      context.close();
    }
  }

  private AnnotationConfigApplicationContext getContext() {
    return new AnnotationConfigApplicationContext(TestConfig.class);
  }

  /**
   * The file lines.txt is located under "src/test/resources". Maven copies it
   * into the target folder, along with the compiled classes. Since it is then
   * part of the class path, we can use
   * {@link ClassLoader#getSystemResource(String)} in order to get its path.
   * 
   * @return the desired file
   */
  private File getLinesFileFromClasspath() {
    final URL resourceURL = ClassLoader.getSystemResource("lines.txt");
    final String filename = resourceURL.getFile();
    return new File(filename);
  }

}
