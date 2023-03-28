package edu.vn.rmit.problem2;

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
    FullTimeStudent fullTimeStudent = new FullTimeStudent("s123", "Alice", "IT");
    lecturer.leadProject(project);
    project.addMember(lecturer);
    project.addMember(fullTimeStudent);
    assertTrue(project.getMemberCount() == 2);

    // however, there is still an issue with this design
    // we can add a part-time student to a project
    // which is not correct according to the specs
    PartTimeStudent partTimeStudent = new PartTimeStudent("s456", "Bob", "SE", 10, 20);
    project.addMember(partTimeStudent);
    assertEquals(3, project.getMemberCount());
  }
}

