public class PlayerDriver {

  /**
   * Method to demonstrate that any class that implements the MultimediaControl Interface.
   * Could be instantiated and use its methods used no matter if it was an audio or movie player.
   */
  public static void testPlayer() {

    MultimediaControl ap1 = new AudioPlayer();

    ap1.next();
    ap1.play();
    ap1.previous();
    ap1.stop();

    MultimediaControl mp1 = new MoviePlayer();

    mp1.next();
    mp1.play();
    mp1.previous();
    mp1.stop();
  }

}
