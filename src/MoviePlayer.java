public class MoviePlayer extends Product implements MultimediaControl {

  private Screen screen;
  private MonitorType monitorType;

  public MoviePlayer() {
    screen = new Screen();
    monitorType = MonitorType.LCD;
  }

  public MoviePlayer(Screen screen) {
    this.screen = screen;
    monitorType = MonitorType.LED;
  }

  /**
   * Method to print that its playing media.
   */
  public void play() {
    System.out.println("Playing movie");
  }

  /**
   * Method to print that its stopping the media.
   */
  public void stop() {
    System.out.println("Stopping movie");
  }

  /**
   * Method to print that its playing the previous media.
   */
  public void previous() {
    System.out.println("Previous movie");
  }

  /**
   * Method to print that its playing the next media.
   */
  public void next() {
    System.out.println("Next movie");
  }

  public String toString() {
    System.out.println(super.toString());
    return screen.toString() +
        "Monitor Type      : " + monitorType;
  }
}
