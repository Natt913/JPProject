public class MoviePlayerDriver {

  /**
   * Method to test functionality of MoviePlayer class and its methods.
   */
  public static void testMoviePlayer() {

    MoviePlayer mp1 = new MoviePlayer("DBPOWER MK101", new Screen("720x480",
        40, 22), MonitorType.LCD);

    MoviePlayer mp2 = new MoviePlayer("Pyle PDV156BK", new Screen("1366x768", 40,
        22), MonitorType.LED);

    System.out.println(mp1);
    System.out.println(mp2);
  }

}
