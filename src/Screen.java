//Nathalie Crespo
//Class to input data on screens.

public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshRate;
  private int responseTime;

  /**
   *Default constuctor that assigns field with generic values.
   */
  public Screen() {
    resolution = "Generic";
    refreshRate = 0;
    responseTime = 0;
  }

  /**
   * Overloaded constructor with values to be passed for the fields.
   * @param resolution Assigns passed resolution value to resolution field.
   * @param refreshRate Assigns passed screen refresh rate into field for rate of refreshing.
   * @param responseTime Assigns passed response time for the response time field.
   */
  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  /**
   * Method to get the resolution of the screen.
   * @return The String value of the resolution.
   */
  public String getResolution() {
    return resolution;
  }

  /**
   * Method to get the rate in which the screen refreshes.
   * @return The value of the refresh rate.
   */
  public int getRefreshRate() {
    return refreshRate;
  }

  /**
   * Method to get the time it takes for the screen responds.
   * @return The value of the response time of the screen.
   */
  public int getResponseTime() {
    return responseTime;
  }

  /**
   * A method to return a certain format with details of the three fields.
   * @return The value of the three fields.
   */
  public String toString() {
    return "Resolution        : " + resolution + "\n"
        +  "Refresh Rate      : " + refreshRate + "\n"
        +  "Response Time     : " + responseTime + "\n";
  }
}

