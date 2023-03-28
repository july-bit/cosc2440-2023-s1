package edu.vn.rmit.problem3;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

public class Lecturer implements CanJoinProject {
  private String employeeId;
  private String fullName;
  private String rank;
  private Project projectLed;

  public Lecturer(String employeeId, String fullName, String rank) {
    this.employeeId = employeeId;
    this.fullName = fullName;
    this.rank = rank;
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
    return String.format("Id: %s, Name: %s, Rank: %s",
      employeeId, fullName, rank);
  }
}
