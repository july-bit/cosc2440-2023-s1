package vn.edu.rmit.problem3;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */

 public class FullTimeStudent extends Student implements CanJoinProject {

  private String profile;

  /**
   * The constructor is not inherited
   * but we can access it with "super"
   * @param id student Id
   * @param name full name
   * @param major major (IT, SE, IS, etc.)
   */
  public FullTimeStudent(String id, String name, String major) {
    super(id, name, major);
    this.profile = "";
  }

  /**
   * String representation of this student
   * <p>
   * This method is called automatically when you use a FullTimeStudent
   * object in places where a String value is required.
   * </p>
   */
  @Override
  public String toString() {
    String id = getStudentId();
    String name = getFullName();
    String major = getMajor();
    return "FullTimeStudent: <Id: " + id
           + ", Name: " + name
           + ", Major:" + major
           + ", Profile=" + profile + ">";
  }

  @Override
  public void setProfile(String profile) {
    this.profile = profile;
  }

  @Override
  public String getProfile() {
    return this.profile;
  }

  @Override
  public String getId() {
    return super.getStudentId();
  }

  /**
   * compare two fulltime student objects
   * <p>
   * Two fulltime student objects are equal if they contain the same student ids
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

    /* Check if other is an instance of FullTimeStudent or not
      "null instanceof [type]" also returns false */
    if (!(other instanceof FullTimeStudent)) {
      return false;
    }

    // typecast other to FullTimeStudent so that we can compare data members
    FullTimeStudent otherStudent = (FullTimeStudent)other;

    // Compare student ids and return accordingly
    return getId().equals(otherStudent.getId());
  }

  @Override
  public int hashCode() {
    return getId().length();
  }
}
