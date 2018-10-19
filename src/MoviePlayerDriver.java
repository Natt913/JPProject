public class MoviePlayerDriver {

  public static void testMoviePlayer() {

    MoviePlayer mp1 = new MoviePlayer();

    MoviePlayer mp2 = new MoviePlayer(new Screen("600x400", 40,
        22));

    System.out.println(mp1);
    System.out.println(mp2);
  }

}
