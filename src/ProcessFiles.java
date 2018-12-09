/**
 * @author Nathalie Crespo
 * Class to process files.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;

public class ProcessFiles {

  //Field name p is given style error but is specified by instructions.
  private Path p;
  private Path p2;
  private Path p3;

  /**
   * Method to combine file and path name and put them in a directory.
   */
  public ProcessFiles() {
    //Specified to use these values but FindBugs considers to be dodgy code.
    p = Paths.get("C:\\LineTests");
    p2 = Paths.get("TestResults.txt");
    p3 = p.resolve(p2);
    CreateDirectory();
  }

  /**
   * Method to create the directory to put the combined file and path.
   * Method name given style error but is specified by instructions.
   */
  private void CreateDirectory() {
    try {
      if (Files.notExists(p)) {
        Files.createDirectory(p);
      }
    } catch (Exception e) {
      System.out.println("Problem creating directory");
    }
  }

  /**
   * Method to write into file and make sure it appends.
   * Method name given style error but is specified by instructions.
   * @param emp The information to be appended.
   * @throws IOException Exception to catch any errors.
   */
  public void WriteFile(EmployeeInfo emp) throws IOException {
    FileWriter writer = null;
    //Bug given, but unsure how to fix.
    writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.print(emp);

    printWriter.close();

  }

  /**
   * Method to write into file and make sure it appends.
   * Method name given style error but is specified by instructions.
   * @param products The information to be appended.
   * @throws IOException Exception to catch any errors.
   */
  public void WriteFile(ArrayList<Product> products) throws IOException {
    FileWriter writer = null;
    try {
      //Bug given, but unsure how to fix.
      writer = new FileWriter(p3.toString(), true);
    } catch (Exception e) {
      System.out.println("Error");
    }
    //Bug given, but unsure how to fix.
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.print(products);

    printWriter.close();
  }

}
