public class PlayerDriver {

  public static void testPlayer() {

     MultimediaControl ap1 = new AudioPlayer();
     MultimediaControl mp1 = new MoviePlayer();

     ap1.next();
     ap1.play();
     ap1.previous();
     ap1.stop();

     mp1.next();
     mp1.play();
     mp1.previous();
     mp1.stop();
  }

}
