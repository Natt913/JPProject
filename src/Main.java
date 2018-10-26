//Testing the Product class
//September 28, 2018

import java.util.ArrayList;
import java.util.Collections;

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

    Widget w1 = new Widget();
    System.out.println(w1);

    Widget w2 = new Widget("Poop");
    System.out.println(w2);


    AudioPlayerDriver.testAudioPlayer();

    ScreenDriver.testScreen();

    MoviePlayerDriver.testMoviePlayer();

    PlayerDriver.testPlayer();

    ArrayList studentProducts = new ArrayList<Product>();

    studentProducts = testCollection();

    Collections.sort(studentProducts);

    print(studentProducts);

  }
}

