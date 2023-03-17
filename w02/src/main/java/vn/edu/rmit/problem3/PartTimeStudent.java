package vn.edu.rmit.problem3;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */

import vn.edu.rmit.problem1.Student;

public class PartTimeStudent extends Student {
  /**
   * Part-time student attributes
   */
  private int minHour;
  private int maxHour;

  /**
   * static variables belong to a whole class
   */
  private static int counter = 0;

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
    counter++;
  }

  // Getter methods
  public int getMaxHour() {
    return maxHour;
  }

  public int getMinHour() {
    return minHour;
  }

  // Setter methods
  public void setMaxHour(int maxHour) {
    this.maxHour = maxHour;
  }

  public void setMinHour(int minHour) {
    this.minHour = minHour;
  }

  /**
   * @return the number of Part time student instances
   */
  public static int count() {
    return counter;
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
    String fromParent = super.toString();
    String added = String.format(", minHour: %d, maxHour: %d",
      minHour, maxHour);
    return fromParent + added;
  }
}
