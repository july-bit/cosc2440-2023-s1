package vn.edu.rmit.problem1;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * Unit test for Project classes.
 */
public class ProjectTest {

  @Test
  public void countProjectMembers()
  {
    Project project = new Project("Java", 999);
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    lecturer.setProfile("An IT lecturer at RMIT VN");
    FullTimeStudent fullTimeStudent = new FullTimeStudent("s123", "Alice", "IT");
    fullTimeStudent.setProfile("An IT student at RMIT VN");
    lecturer.leadProject(project);
    project.addMember(lecturer);
    project.addMember(fullTimeStudent);
    assertTrue(project.getMemberCount() == 2);
    // Enable to see Debug console output
    // project.displayMembers();
  }
}
