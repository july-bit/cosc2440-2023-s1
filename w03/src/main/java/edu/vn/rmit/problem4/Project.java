package edu.vn.rmit.problem4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */

 public class Project {
  private String name;
  private double budget;

    public double getBudget() {
        return budget;
    }

    private Lecturer leader;
  private List<CanJoinProject> members;
  private static final int MAX_MEMBERS = 10;
  private int memberCount;
  
  public Project(String name, double budget) {
    this.name = name;
    this.budget = budget;
    members = new ArrayList<>();
  }

  // Getter methods
  public int getMemberCount() {
    return memberCount;
  }

  /**
   * get the current leader of this project
   * @return the Lecturer who is the leader,
   * or null if there is no leader for this project
   */
  public Lecturer getLeader() {
    return leader;
  }

  /**
   * assign a new leader for this project
   * <p>
   * Assign the given Lecturer as the new leader for this project.
   * It's the job of the Lecturer class to ensure this assignment
   * is valid. This class just does the assignment
   * </p>
   * @param leader the new leader for this project
   */
  public void assignLeader(Lecturer leader) {

      this.leader = leader;
      LeaderSet.addLeader(leader);
  }

  /**
   * add a new member to this project
   * <p>
   * Add a new member (lecturer or fulltime student) to this project.
   * At this point, there is no checking at all
   * </p>
   * @param newMember a member who want to join this project
   */
  public void addMember(CanJoinProject newMember) {
    members.add(newMember);
  }

  /**
   * display all members in this project (including leader and regular member)
   */
  public void displayMembers() {
    // display leader
    System.out.println("Leader: " + leader);

    // display members
      int i = 0;
    for(CanJoinProject member:members) {
      System.out.printf("Member #%d: " + member + "\n", i + 1);
      i++;
    }
  }
}
