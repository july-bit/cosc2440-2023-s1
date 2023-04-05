package vn.edu.rmit.problem3;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Unit test for ProjectMember class.
 */
public class ProjectMemberManagerTest {
  @Test
  public void lecturerWithoutProject()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    ProjectMemberManager projectMember = new ProjectMemberManager();
    assertNull(projectMember.getAllProjects(lecturer));
  }

  @Test
  public void studentWithoutProject()
  {
    FullTimeStudent student = new FullTimeStudent("s001", "Bob", "IT");
    ProjectMemberManager projectMember = new ProjectMemberManager();
    assertNull(projectMember.getAllProjects(student));
  }

  @Test
  public void joinSomeProjects()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    ProjectMemberManager projectMember = new ProjectMemberManager();
    Project project1 = new Project("Java", 999, projectMember);
    Project project2 = new Project("C++", 999, projectMember);
    lecturer.joinProject(project1);
    assertEquals(1, projectMember.getAllProjects(lecturer).size());
    lecturer.joinProject(project2);
    assertEquals(2, projectMember.getAllProjects(lecturer).size());
  }

  @Test
  public void joinDuplicatedProjectsNotCount()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    ProjectMemberManager projectMember = new ProjectMemberManager();
    Project project1 = new Project("Java", 123, projectMember);
    Project project2 = new Project("Java", 456, projectMember);
    Project project3 = new Project("Java", 789, projectMember);
    lecturer.joinProject(project1);
    assertEquals(1, projectMember.getAllProjects(lecturer).size());
    lecturer.joinProject(project2);
    assertEquals(1, projectMember.getAllProjects(lecturer).size());
    lecturer.joinProject(project3);
    assertEquals(1, projectMember.getAllProjects(lecturer).size());
  }

  @Test
  public void removeFromProjectSuccessfully()
  {
    FullTimeStudent student = new FullTimeStudent("s001", "Alice", "SE");
    ProjectMemberManager projectMember = new ProjectMemberManager();
    Project project = new Project("Java", 123, projectMember);
    project.addMember(student);
    assertEquals(1, projectMember.getAllProjects(student).size());
    project.removeMember(student);
    assertEquals(0, projectMember.getAllProjects(student).size());
  }

 
  @Test
  public void removeFromNotJoinedProjectReturnFalse()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    ProjectMemberManager projectMember = new ProjectMemberManager();
    Project project = new Project("Java", 999, projectMember);
    assertFalse(projectMember.removeProjectForMember(lecturer, project));
  }

  @Test
  public void removeFromProjectReturnTrue()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    ProjectMemberManager projectMember = new ProjectMemberManager();
    Project project = new Project("Java", 999, projectMember);
    projectMember.addProjectToMember(lecturer, project);
    assertTrue(projectMember.removeProjectForMember(lecturer, project));
  }

  @Test
  public void removeProjectReturnTrueWithSize()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    ProjectMemberManager projectMember = new ProjectMemberManager();
    Project project1 = new Project("Java", 999, projectMember);
    Project project2 = new Project("C++", 999, projectMember);
    lecturer.joinProject(project1);
    lecturer.joinProject(project2);
    assertTrue(projectMember.removeProjectForMember(lecturer, project1));
    assertTrue(projectMember.getAllProjects(lecturer).size() == 1);
  }
}
