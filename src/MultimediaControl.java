//Nathalie Crespo
//Interface to be implemented by different media classes.

public interface MultimediaControl {

  /**
   * Method to play media.
   */
  public void play();

  /**
   * Method to stop media.
   */
  public void stop();

  /**
   * Method to play previous media.
   */
  public void previous();

  /**
   * Method to play next media.
   */
  public void next();
}
