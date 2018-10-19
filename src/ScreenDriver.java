public class ScreenDriver {

  public static void testScreen() {

    Screen screen1 = new Screen();
    Screen screen2 = new Screen("600x400", 40, 22);

    System.out.println(screen1);
    System.out.println(screen2);
  }
}
