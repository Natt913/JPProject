//Nathalie Crespo
//This file is an interface with many parent methods meant to be used for the Product class.
//Many of the comments were used from the Oracle JP Project.
//September 28, 2018

//Required in order to use Date class
import java.util.Date;

//Interface called Item
//Based on a project from Oracl

public interface Item {

  //A constant called manufacturer that would be set to “OraclProduction”
  final String manufacturer = "OraclProduction";

  //A method setProductionNumber that would have one integer parameter
  public void setProductionNumber(int productionNumber);

  //A method setName that would have one String parameter
  public void setName(String name);

  //A method getName that would return a String
  public String getName();

  //A method getManufactureDate that would return a Date
  public Date getManufacturerDate();

  //A method getSerialNumber that would return an int
  public int getSerialNumber();

}