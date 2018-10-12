//Testing the Product class
//September 28, 2018

public class Main {

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

    AudioPlayer ap1 = new AudioPlayer();
    System.out.println(ap1);

    AudioPlayer ap2 = new AudioPlayer("Ipod","Mp3");
    System.out.println(ap2);

    Screen s1 = new Screen("600x400", 40, 22);
    System.out.println(s1);

    Screen s2 = new Screen();
    System.out.println(s2);
  }

}