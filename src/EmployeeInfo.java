import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  StringBuilder name;
  String code;
  String deptId;
  Pattern p;
  Scanner in;

  public EmployeeInfo() {
    setName();
    in = new Scanner(System.in);
    setDeptId();
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
      code = "Guest";
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
    String iD;
    System.out.println("Please enter the department ID:");
    iD = in.next();
    return iD;
  }

  private void setDeptId() {
    deptId = getDeptId();
    if(validId(deptId) == false) {
      deptId = "None01";
    } else {
      reverseString(deptId);
      this.deptId = deptId;
    }
  }

  private String getId() {
    return deptId;
  }

  private boolean validId(String id) {
    p = Pattern.compile("([A-Z])([a-z])([a-z])([a-z])([0-9])([0-9])");
    Matcher m = p.matcher(id);
    boolean b = m.matches();

    if(b == true) {
      return true;
    } else {

      return false;
    }
  }

  private String reverseString(String id) {
    if(id.isEmpty()){
      return id;
    } else {
      return reverseString(id.substring(1))+id.charAt(0);
    }
  }

  public String toString() {
    return "Employee Code : " + code + "\n" +
           "Department ID : " + deptId + "\n";
  }

}
