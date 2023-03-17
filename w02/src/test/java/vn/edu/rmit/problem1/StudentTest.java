package vn.edu.rmit.problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * Unit test for Student
 */
public class StudentTest 
{
  @Test
  public void equalSameStudent() {
    Student std1 = new Student("s123", "Student 1", "IT");
    Student std2 = std1;
    assertTrue(std1.equals(std2));
  }

  @Test
  public void equalSameObject() {
    Student std1 = new Student("s123", "Student 1", "IT");
    Object obj = std1;
    assertTrue(std1.equals(obj));
  }

  @Test
  public void compareWithWrongType() {
    Student std1 = new Student("s123", "Student 1", "IT");
    String other = "hello";
    assertFalse(std1.equals(other));
  }

  @Test
  public void equalId() {
    Student std1 = new Student("s123", "Student 1", "IT");
    Student std2 = new Student("s1", "Student 2", "SE");
    std2.studentId += "23";
    assertTrue(std1.equals(std2));
  }

  @Test
  public void differentIds() {
    Student std1 = new Student("s123", "Student 1", "IT");
    Student std2 = new Student("s124", "Student 1", "IT");
    assertFalse(std1.equals(std2));
  }

  @Test
  public void toStringOutput() {
    Student std1 = new Student("s123", "Student 1", "IT");
    String result = "studentId: s123, fullName: Student 1, major: IT";
    assertTrue(result.equals(std1.toString()));
  }
}
