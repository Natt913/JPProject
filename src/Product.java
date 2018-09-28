//Nathalie Crespo

//Required in order to use Date class
import java.util.Date;

public abstract class Product implements Item {

  //Instance variables
  private int serialNumber;
  private String manufacturer;
  private Date manufacturedOn;
  private String name;

  //Specified to be a class variable, therefore it will only be used in this class
  static int currentProductionNumber;

  //Add a constructor that will take in the name of the product and set this to the field variable name.
  //Will also assign a serial number from the currentProductionNumber.
  //The currentProductionNumber is incremented in readiness for the next instance.
  //Set manufacturedOn as the current date and time.
  public Product(String n){
    name = n;
    serialNumber = currentProductionNumber++;
    manufacturedOn = new Date();
  }


  public void setProductionNumber(int productionNumber){
  serialNumber = productionNumber;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public Date getManufacturerDate(){
    return manufacturedOn;
  }

  public int getSerialNumber(){
    return serialNumber;
  }

  public String toString(){
    return "Manufacturer      : " + manufacturer + "\n"
        +  "Serial Number     : " + serialNumber + "\n"
        +  "Date              : " + manufacturedOn + "\n"
        +  "Name              : " + name + "\n";
  }

}
