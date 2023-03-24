package edu.vn.rmit.problem4;

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
    return "FullTimeStudent: <id=" + id + ", name=" 
           + name + ", major=" + major
           + "profile=" + profile + ">";
  }

  @Override
  public void setProfile(String profile) {
    this.profile = profile;
  }

  @Override
  public String getProfile() {
    return this.profile;
  }
}


