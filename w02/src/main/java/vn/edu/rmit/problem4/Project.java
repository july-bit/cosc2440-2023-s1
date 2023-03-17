package vn.edu.rmit.problem4;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */

 public class Project {
  private String name;
  private double budget;
  private Lecturer leader;
  private Lecturer[] lecturerMembers;
  private FullTimeStudent[] studentMembers;
  private static final int MAX_MEMBERS = 10;
  private int lecturerMemberCount;
  private int studentMemberCount;

  public Project(String name, double budget) {
    this.name = name;
    this.budget = budget;
    lecturerMemberCount = 0;
    studentMemberCount = 0;
    lecturerMembers = new Lecturer[MAX_MEMBERS];
    studentMembers = new FullTimeStudent[MAX_MEMBERS];
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
  }

  /**
   * add a new lecturer to this project
   * <p>
   * Add a new lecturer to this project. At this point, there
   * is no checking at all
   * </p>
   * @param newMember a Lecturer who want to join this project
   */
  public void addMember(Lecturer newMember) {
    lecturerMembers[lecturerMemberCount++] = newMember;
  }

  /**
   * add a new fulltime student to this project
   * <p>
   * Add a new fulltime student to this project. At this point, there
   * is no checking at all
   * </p>
   * @param newMember a FullTimeStudent who want to join this project
   */
  public void addMember(FullTimeStudent newMember) {
    studentMembers[studentMemberCount++] = newMember;
  }

  /**
   * display all members in this project (including leader and regular member)
   */
  public void displayMembers() {
    // display leader
    System.out.println("Leader: " + leader);

    // display lecturer members
    for(int i = 0; i < lecturerMemberCount; i++) {
      System.out.printf("Lecturer member #%d: " + lecturerMembers[i] + "\n", i + 1);
    }
    
    // display student members
    for(int i = 0; i < studentMemberCount; i++) {
      System.out.printf("Student member #%d: " + studentMembers[i] + "\n", i + 1);
    }
  }
}
