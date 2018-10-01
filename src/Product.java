//Nathalie Crespo
//Many of the notes were used from the JP Project file
//Septemeber 28, 2018

//Required in order to use Date class
import java.util.Date;

public abstract class Product implements Item {

  //Instance variables
  private int serialNumber;
  private String manufacturer = Item.manufacturer;
  private Date manufacturedOn;
  private String name;

  //Specified to be a class variable, therefore it will only be used in this class.
  private static int currentProductionNumber = 1;


  /**
   * A constructor that will take in the name of the product.
   * And set this to the field variable name.
   * Will also assign a serial number from the currentProductionNumber.
   * The currentProductionNumber is incremented in readiness for the next instance.
   * Set manufacturedOn as the current date and time.
   * @param n It takes a String as the name for the product.
   */

  public Product(String n) {
    name = n;
    serialNumber = currentProductionNumber++;
    manufacturedOn = new Date();
  }

  //Completing all the methods from the Item interface
  public void setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;
    //serialNumber = productionNumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getManufacturerDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  /**
   * Method to return a template provided by Oracle.
   * Adds non-sample data.
   * @return The template that is required to use.
   */
  public String toString() {
    return "Manufacturer      : " + manufacturer + "\n"
        +  "Serial Number     : " + serialNumber + "\n"
        +  "Date              : " + manufacturedOn + "\n"
        +  "Name              : " + name + "\n";
  }

}