package vn.edu.rmit.problem4;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

public class Lecturer implements CanJoinProject {
  private String employeeId;
  private String fullName;
  private String rank;
  private Project projectLed;
  private String profile;

  public Lecturer(String employeeId, String fullName, String rank) {
    this.employeeId = employeeId;
    this.fullName = fullName;
    this.rank = rank;
    this.profile = "";
  }

  /**
   * assign the current lecturer as the leader of a project
   * <p>
   * Given a project, assign the current lecturer as its leader.
   * If the assignment is successful, return true,
   * otherwise, return false
   * </p>
   * @param p the project to lead
   * @return true if the assignment is successful, otherwise, return false
   */
  public boolean leadProject(Project p) {
    /**
     * two conditions below must satisfy
     * the lecturer has no project to lead
     * the assigned project has no leader
     */
    if (projectLed == null && p.getLeader() == null) {
      projectLed = p;
      p.assignLeader(this);
      return true;
    }
    return false;
  }

  /**
   * assign the current lecturer as a member of a project
   * <p>
   * Join a project as a member. It's the job of the Project class
   * to check for validity of this action or to check if
   * this Lecturer member exists in the project already
   * </p>
   * @param p the project to join
   */
  public void joinProject(Project p) {
    p.addMember(this);
  }

  /**
   * String representation of this lecturer
   * <p>
   * This method is called automatically when you use a Lecturer object
   * in places where a String value is required.
   * More about this in later lessions
   * </p>
   */
  @Override
  public String toString() {
    // String.format() is similar to printf, but it return instead of display
    return String.format("<Id: %s, Name: %s, Rank: %s, Profile: %s>",
                         employeeId, fullName, rank, profile);
  }

  @Override
  public void setProfile(String profile) {
    this.profile = profile;
  }

  @Override
  public String getProfile() {
    return this.profile;
  }

  /**
   * compare two lecturer objects
   * <p>
   * Two lecturer objects are equal if they contain the same employee ids
   * otherwise, return false
   * </p>
   * @param other an object that compare with
   * @return true if two lecturers have the same ids, otherwise, return false
   */
  @Override
  public boolean equals(Object other) {
    
    // If the object is compared with itself then return true 
    if (other == this) {
      return true;
    }

    /* Check if other is an instance of Lecturer or not
      "null instanceof [type]" also returns false */
    if (!(other instanceof Lecturer)) {
      return false;
    }

    // typecast other to Project so that we can compare data members
    Lecturer otherLecturer = (Lecturer) other;

    // Compare student ids and return accordingly
    return this.employeeId.equals(otherLecturer.employeeId);
  }

  @Override
  public String getId() {
    return this.employeeId;
  }
}
