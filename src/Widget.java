//Just created this as a little test.
//September 28, 2018

public class Widget extends Product {

  private String name;

  /**
   * Default constructor for the Widget class.
   * Using the default constructor from the parent class.
   */
  public Widget() {
    super();
  }

  /**
   * Constructor for the Widget class.
   * @param name Using name as parameter to also be passed into parent constructor.
   */
  public Widget(String name) {
    super(name);
  }

}
