package vn.edu.rmit.problem1;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

public class PartTimeStudent extends Student {
  /**
   * Part-time student attributes
   */
  private int minHour;
  private int maxHour;

  /**
   * The constructor is not inherited
   * but we can access it with "super"
   * @param id student Id
   * @param name full name
   * @param major major (IT, SE, IS, etc.)
   * @param minHour minimum hour per week
   * @param maxHour maximum hour per week
   */
  public PartTimeStudent(String id, String name, String major, int minHour, int maxHour) {
    super(id, name, major);
    this.minHour = minHour;
    this.maxHour = maxHour;
  }

  /**
   * String representation of this student
   * <p>
   * This method is called automatically when you use a PartTimeStudent
   * object in places where a String value is required.
   * </p>
   */
  @Override
  public String toString() {
    String id = getStudentId();
    String name = getFullName();
    String major = getMajor();
    String hourString = String.format(", MinHour: %d, MaxHour: %d", minHour, maxHour);
    return "PartTimeStudent: <Id: " + id
           + ", Name: " + name
           + ", Major: " + major
           + hourString + ">";
  }
}
