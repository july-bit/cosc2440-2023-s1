package vn.edu.rmit.problem1;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */

public class Student {
  /**
   * student attributes   
   */
  public String studentId;
  public String fullName;
  public String major;

  /**
   * Constructor
   */
  public Student(String id, String name, String major) {
    studentId = id;
    fullName = name;
    this.major = major;
  }

  /**
   * String representation of this student
   * <p>
   * This method is called automatically when you use a Student object
   * in places where a String value is required.
   * </p>
   */
  @Override
  public String toString() {
    // String.format() is similar to printf, but it return instead of display
    return String.format("studentId: %s, fullName: %s, major: %s",
      studentId, fullName, major);
  }

  // Using the ideas
  // from https://www.geeksforgeeks.org/overriding-equals-method-in-java/
  /**
   * compare two student objects
   * <p>
   * Two Student objects are equal if they contain the same student ids
   * otherwise, return false
   * </p>
   * @param other an object that compare with
   * @return true if two students have the same ids, otherwise, return false
   */
  @Override
  public boolean equals(Object other) {
    
    // If the object is compared with itself then return true 
    if (other == this) {
      return true;
    }

    /* Check if other is an instance of Student or not
      "null instanceof [type]" also returns false */
    if (!(other instanceof Student)) {
      return false;
    }

    // typecast other to Student so that we can compare data members
    Student otherStudent = (Student) other;

    // Compare student ids and return accordingly
    return this.studentId.equals(otherStudent.studentId);
    
    // Question: Can we do?
    // return this.studentId == otherStudent.studentId;
  }
}
