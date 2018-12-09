//Nathalie Crespo
//Class to act as a template for any movieplayer objects that
//Subclasses Product and implements MultimediaControl.

public class MoviePlayer extends Product implements MultimediaControl {

  private Screen screen;
  private MonitorType monitorType;

  /**
   * Default constructor with generic data for an object of MoviePlayer.
   */
  public MoviePlayer() {
    super();
    screen = new Screen();
    monitorType = MonitorType.LCD;
  }

  /**
   * Overloaded constructor with parameters to be passed for data of an object of MoviePlayer.
   * @param name The name of the movie player with String value.
   * @param screen Data on the screen of the movie player from the Screen class.
   * @param monitorType The monitor data for the monitor of class type MonitorType.
   */
  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  /**
   * Method to print that its playing movie.
   */
  public void play() {
    System.out.println("Playing movie");
  }

  /**
   * Method to print that its stopping the movie.
   */
  public void stop() {
    System.out.println("Stopping movie");
  }

  /**
   * Method to print that its playing the previous movie.
   */
  public void previous() {
    System.out.println("Previous movie");
  }

  /**
   * Method to print that its playing the next movie.
   */
  public void next() {
    System.out.println("Next movie");
  }

  /**
   * Method to print out product, screen, and movieplayer data.
   * @return
   */
  public String toString() {
    return super.toString() + screen.toString()
        + "Monitor Type      : " + monitorType;
  }
}
