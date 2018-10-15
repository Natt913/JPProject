public class AudioPlayerDriver {

  AudioPlayer ap1;
  AudioPlayer ap2;

  public static void testAudioPlayer() {

    AudioPlayer ap1 = new AudioPlayer("iPod Mini", "MP3");

    AudioPlayer ap2 = new AudioPlayer("Walkman", "WAV");


    ap1.play();
    ap2.stop();
    ap1.next();
    ap2.previous();
    System.out.println(ap1);
    System.out.println(ap2);
  }
  }

