//Nathalie Crespo
//This file is an interface,

//Required in order to use Date class
import java.util.Date;

//Interface called Item
//Based on a project from Oracl

public interface Item {

  //A constant called manufacturer that would be set to “OracleProduction”
  final String manucaturer = "OraclProduction";

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
