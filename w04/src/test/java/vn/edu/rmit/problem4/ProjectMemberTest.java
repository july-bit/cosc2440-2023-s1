package vn.edu.rmit.problem4;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.List;

/**
 * Unit test for ProjectMember class.
 */
public class ProjectMemberTest {
  @Test
  public void getAllSortedProjects()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    ProjectMember projectMember = new ProjectMember();
    Project project1 = new Project("Java", 999);
    Project project2 = new Project("C++", 9999);
    Project project3 = new Project("C", 6000);
    projectMember.addProjectToMember(lecturer, project1);
    projectMember.addProjectToMember(lecturer, project2);
    projectMember.addProjectToMember(lecturer, project3);
    List<Project> projects = projectMember.getAllSortedProjects(lecturer);
    assertTrue(projects.size() == 3);
    assertTrue(projects.get(0).getBudget() > projects.get(1).getBudget());
    assertTrue(projects.get(1).getBudget() > projects.get(2).getBudget());
  }
}
