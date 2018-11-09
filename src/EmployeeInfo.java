import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

  StringBuilder name;
  String code;
  String deptId;
  Pattern p;
  Scanner in;

  public EmployeeInfo() {
    setName();

  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  private void createEmployeeCode(StringBuilder name) {
    if(checkName(name) == true) {
      code = name.substring(0,1) + name.substring(name.indexOf(" ") + 1);
      //code = name.charAt(0) + name.subString(name.indexOf(" ") + 1);
    }
    else {
      code = "guest";
    }
  }

  private String inputName() {
    String nameString;
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your first and last name:");
    nameString = scan.nextLine();
    return nameString;
  }

  private boolean checkName(StringBuilder name) {
    if(name.indexOf(" ") > 0) {
      return true;
    }
    else {
      return false;
    }
  }

  public String getDeptId() {
    System.out.println("Please enter the department ID");
    deptId = in.next();
    return deptId;
  }

  //11/09/18
  private void setDeptId() {
    getDeptId();

  }

  private String getId() {
    return "";
  }

  private boolean validId(String id) {
    if(id.isEmpty()) {
      return false;
    } else {
      return true;
    }
  }

}
