package vn.edu.rmit.problem2;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Unit test for LeaderSet class.
 */
public class LeaderSetTest {
  @Test
  public void canAddLeader()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    LeaderSet leaderSet = new LeaderSet();
    assertTrue(leaderSet.addLeader(lecturer));
  }

  @Test
  public void cannotAddLeaderTwice()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    LeaderSet leaderSet = new LeaderSet();
    assertTrue(leaderSet.addLeader(lecturer));
    assertFalse(leaderSet.addLeader(lecturer));
  }

  @Test
  public void cannotAddTwoLeadersWithSameIDs()
  {
    Lecturer lecturer1 = new Lecturer("e001", "Alice1", "Professor");
    Lecturer lecturer2 = new Lecturer("e001", "Alice2", "Professor");
    LeaderSet leaderSet = new LeaderSet();
    assertTrue(leaderSet.addLeader(lecturer1));
    assertFalse(leaderSet.addLeader(lecturer2));
  }

  @Test
  public void notLeadAnyProject()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    LeaderSet leaderSet = new LeaderSet();
    assertFalse(leaderSet.isLeadingProject(lecturer));
  }
  
  @Test
  public void isLeadingProject()
  {
    Project project = new Project("Java", 999);
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    LeaderSet leaderSet = new LeaderSet();
    
    lecturer.leadProject(project);
    leaderSet.addLeader(lecturer);
    
    assertTrue(leaderSet.isLeadingProject(lecturer));
  }

  @Test
  public void leadingStatusBasedOnIDOnly()
  {
    Lecturer lecturer1 = new Lecturer("e001", "Alice1", "Professor");
    Lecturer lecturer2 = new Lecturer("e001", "Alice2", "Professor");
    LeaderSet leaderSet = new LeaderSet();
    assertFalse(leaderSet.isLeadingProject(lecturer1));

    leaderSet.addLeader(lecturer1);
    assertTrue(leaderSet.isLeadingProject(lecturer1));
    assertTrue(leaderSet.isLeadingProject(lecturer2));
  }

  @Test
  public void cannotRemoveLeader()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    LeaderSet leaderSet = new LeaderSet();
    assertFalse(leaderSet.removeLeader(lecturer));
  }

  @Test
  public void canRemoveLeader()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    LeaderSet leaderSet = new LeaderSet();
    assertTrue(leaderSet.addLeader(lecturer));
    assertTrue(leaderSet.removeLeader(lecturer));
  }

  @Test
  public void canRemoveLeaderTwiceWithoutError()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    LeaderSet leaderSet = new LeaderSet();
    assertTrue(leaderSet.addLeader(lecturer));
    assertTrue(leaderSet.removeLeader(lecturer));
    assertFalse(leaderSet.removeLeader(lecturer));
  }
}
