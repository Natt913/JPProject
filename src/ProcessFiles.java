import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Locale;

public class ProcessFiles {

  private Path p;
  private Path p2;
  private Path p3;

  public ProcessFiles() {
    p = Paths.get("C:\\LineTests");
    p2 = Paths.get("TestResults.txt");
    p3 = p.resolve(p2);
    CreateDirectory();
  }

  private void CreateDirectory() {
    try {
      if(Files.notExists(p)) {
        Files.createDirectory(p);
      }
    } catch (Exception e) {
      System.out.println("Problem creating directory");
    }
  }


  public void WriteFile(EmployeeInfo emp) throws IOException {
    FileWriter writer = null;
    writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.print(emp);

    printWriter.close();

  }
  public void WriteFile(ArrayList<Product> products) throws IOException {
    FileWriter writer = null;
    try {
      writer = new FileWriter(p3.toString(), true);
    } catch (Exception e) {
      System.out.println("Error");
    }
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.print(products);

    printWriter.close();
  }

}
