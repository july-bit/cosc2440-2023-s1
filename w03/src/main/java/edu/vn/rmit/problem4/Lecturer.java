package edu.vn.rmit.problem4;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import static edu.vn.rmit.problem4.LeaderSet.LeaderSet;
import static edu.vn.rmit.problem4.ProjectMember.ProjectMember;
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

  public Project getProjectLed() {
    return projectLed;
  }

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
      LeaderSet.add(this);
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
//    ProjectMember.put(this, );
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
    return String.format("Id: %s, Name: %s, Rank: %s, Profile: %s",
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
  @Override
  public boolean equals(Object lec) {
    if (lec == this) {
      return true;
    }
    if (lec instanceof Lecturer) {
      return Objects.equals(this.employeeId, ((Lecturer) lec).employeeId);
    }
    return false;
  }
  @Override
  public int hashCode() {
    return 1;
  }
}
