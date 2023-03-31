package vn.edu.rmit.problem3;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */

 public abstract class Student {
  /**
  * student attributes   
  */
  private String studentId;
  private String fullName;
  private String major;

  /**
  * Constructor
  */
  public Student(String id, String name, String major) {
    studentId = id;
    fullName = name;
    this.major = major;
  }

  // Getter methods
  public String getStudentId() {
    return studentId;
  }

  public String getFullName() {
    return fullName;
  }

  public String getMajor() {
    return major;
  }

  @Override
  abstract public String toString();
}