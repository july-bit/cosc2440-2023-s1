package w01.package1;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */

public class Student {
  /**
   * public access modifier
   * those fields can be accessed by any class from any package
   */
  public String studentId;
  public String fullName;
  public String major;

  /**
   * default access modifier
   * those fields can be accessed by classes from the same package only
   * uncomment the below declarations and try it yourself
   * (remember to comment the above declations too)
   */
  // String studentId;
  // String fullName;
  // String major;
}
