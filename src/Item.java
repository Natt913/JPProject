/**
 * @author Nathalie Crespo
 * This file is an interface with many parent methods meant to be used for the Product class.
 * Many of the comments were used from the Oracle JP Project.
 */

//Required in order to use Date class
import java.util.Date;

//Interface called Item
//Based on a project from Oracl

public interface Item {

  //A constant called manufacturer that would be set to “OraclProduction”
  final String manufacturer = "OraclProduction";

  /**
   * A method setProductionNumber that would have one integer parameter.
   * @param productionNumber Integer to represent the production number.
   */
  public void setProductionNumber(int productionNumber);

  /**
   * A method setName that would have one String parameter.
   * @param name String to represent the name of the item.
   */
  public void setName(String name);

  /**
   * A method getName that would return a String.
   * @return No return because this is an interface.
   */
  public String getName();

  /**
   * A method getManufactureDate that would return a Date.
   * @return No return because this is an interface.
   */
  public Date getManufacturerDate();

  /**
   * A method getSerialNumber that would return an integer.
   * @return No return because this is an interface.
   */
  public int getSerialNumber();

}