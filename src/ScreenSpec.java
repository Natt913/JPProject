//Nathalie Crespo
//Interface to be used to get data on screens.

public interface ScreenSpec {

  /**
   * Method to get the resolution rate.
   * @return Should return the type of resolution
   */
  public String getResolution();

  /**
   * Method to retrieve the rate at which the screen refreshes.
   * @return Should return an int.
   */
  public int getRefreshRate();

  /**
   * Method to get the time it takes for the screen to respond.
   * @return And int for the time.
   */
  public int getResponseTime();

}
