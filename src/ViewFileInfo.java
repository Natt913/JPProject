/**
 * @author Nathalie Crespo
 * Driver class to test the ProcessFiles class and read the file.
 */

import java.io.FileReader;
import java.io.IOException;

public class ViewFileInfo {

  /**
   * Driver class to test the ProcessFiles class and read the file.
   * @param args Just the standard parameter for a main method.
   */
  public static void main(String[] args) {
    try {
      //Specified to do this in instructions but considered to be dodgy code.
      FileReader fr = new FileReader("C:\\LineTests\\TestResults.txt");

      int i;
      while ((i = fr.read()) != -1) {
        System.out.println((char) i);
      }

    } catch (RuntimeException e) {
      throw e;

    } catch (Exception e) {
      System.out.println("Unable to read file");
    }
  }

}
