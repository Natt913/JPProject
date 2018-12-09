//Nathalie Crespo
//Driver class to test functionality of all the classes.

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  /**
   * Method to test if added collections functionality works.
   * @return returns an ArrayList with sample products stored into it.
   */
  public static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
            new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
            new Screen("1366x768", 40, 22), MonitorType.LED);

    ArrayList products = new ArrayList<Product>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;

  }

  /**
   * Generic method to print out contents of an ArrayList.
   * @param productList This is just the parameter for the name of the ArrayList.
   * @param <T> This is the symbol for the generic method for any datatype.
   */
  public static <T> void print(ArrayList<T> productList) {
    for (int i = 0; i < productList.size(); i++) {
      System.out.println(productList.get(i));
    }
  }

  /**
   * Tests all the files created from the JP Program until step 3.
   * Creates an object of Widget.
   * Prints the oobject using the toString() from the Product class.
   * @param args provides arguments for the String data type.
   */

  public static void  main(String[] args) {

    AudioPlayerDriver.testAudioPlayer();

    ScreenDriver.testScreen();

    MoviePlayerDriver.testMoviePlayer();

    PlayerDriver.testPlayer();

    //Specified to do this for step 16.
    ArrayList studentProducts = new ArrayList<Product>();

    studentProducts = testCollection();

    Collections.sort(studentProducts);

    print(studentProducts);


    ProcessFiles pf = new ProcessFiles();
    try {
      pf.WriteFile(studentProducts);
    } catch (Exception e) {
      System.out.println("Stop");
    }

    // int menuChoice;
    // Scanner scan = new Scanner;

    // do {
    //   do {
    //     System.out.println("Choose option");
    //     System.out.println("1: Add product");
    //     System.out.println("2: Display product");
    //     System.out.println("3: Show statistics");
    //     System.out.println("4: Quit");
    //     try {
    //       menuChoice = scan.nextInt();
    //     } catch (Exception ex) {
    //       System.out.println("Integer expected, please try again.");
    //       scan.nextLine();
    //     }

    //   } while (menuChoice < 1 || menuChoice > 4);
    //   switch (menuChoice) {
    //     case 1:
    //       System.out.println("Add");
    //       studentProducts = addProduct(scan, studentProducts);
    //       break;
    //     case 2:
    //       System.out.println("Display");
    //       studentProducts.toString();
    //       break;
    //     case 3:
    //       System.out.println("Statistics");
    //       break;
    //     case 4:
    //       System.out.println("Quit");
    //       break;
    //   }
    // }


  }
}
