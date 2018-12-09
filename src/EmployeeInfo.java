/**
 * @author Nathalie Crespo
 * Class to retrieve and verify inputted employee info.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  StringBuilder name;
  String code;
  String deptId;
  // Field name p is given error but specified by instructions.
  Pattern p = Pattern.compile("([A-Z])([a-z])([a-z])([a-z])([0-9])([0-9])");
  //Bug given, but unsure how to fix.
  Scanner in = new Scanner(System.in);

  /**
   * Constructor to prompt users for employee info.
   */
  public EmployeeInfo() {
    setName();
    setDeptId();
  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  /**
   * Method to set the name input for inputName method.
   * Calls createEmployeeId to convert name to id.
   */
  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  /**
   * Method to check if name is valid and converts it to an employee id.
   * @param name Name to convert to id.
   */
  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name) == true) {
      code = name.substring(0,1) + name.substring(name.indexOf(" ") + 1);
      //code = name.charAt(0) + name.subString(name.indexOf(" ") + 1);
    } else {
      code = "Guest";
    }
  }

  /**
   * Method to prompt user for input of their name.
   * @return Returns the input value
   */
  private String inputName() {
    String nameString;
    //Bug given, but unsure how to fix.
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your first and last name:");
    nameString = scan.nextLine();
    return nameString;
  }

  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Method to prompt user for input of department ID.
   * @return Returns the input value.
   */
  public String getDeptId() {
    String id;
    System.out.println("Please enter the department ID:");
    id = in.next();
    return id;
  }

  private void setDeptId() {
    deptId = getDeptId();
    if (validId(deptId) == false) {
      deptId = "None01";
    } else {
      deptId = reverseString(getId());
    }
  }

  private String getId() {
    return deptId;
  }

  /**
   * Method to check if string parameter matched p.
   * @param id String to be checked.
   * @return Returns true or false whether it matches or not.
   */
  private boolean validId(String id) {
    Matcher m = p.matcher(id);
    boolean b = m.matches();

    if (b == true) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Method to reverse the order of the string parameter.
   * @param id The string input to be reversed.
   * @return Returns the reversed string.
   */
  private String reverseString(String id) {
    if (id.isEmpty()) {
      return id;
    } else {
      return reverseString(id.substring(1)) + id.charAt(0);
    }
  }

  public String toString() {
    return "Employee Code : " + code + "\n"
         + "Department ID : " + deptId + "\n";
  }

}
