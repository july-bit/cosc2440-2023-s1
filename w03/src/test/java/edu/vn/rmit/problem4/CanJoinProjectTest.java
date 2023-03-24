package edu.vn.rmit.problem4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * Unit test for CanJoinProject classes.
 */
public class CanJoinProjectTest {

  @Test
  public void canSetProfileForFullTimeStudent()
  {
    FullTimeStudent fullTimeStudent = new FullTimeStudent("s123", "Alice", "IT");
    assertEquals("", fullTimeStudent.getProfile());
    fullTimeStudent.setProfile("An IT student at RMIT VN");
    assertEquals("An IT student at RMIT VN", fullTimeStudent.getProfile());
  }

  @Test
  public void canSetProfileForLecturer()
  {
    Lecturer lecturer = new Lecturer("e001", "Alice", "Professor");
    assertEquals("", lecturer.getProfile());
    lecturer.setProfile("An IT lecturer at RMIT VN");
    assertEquals("An IT lecturer at RMIT VN", lecturer.getProfile());
  }
}
