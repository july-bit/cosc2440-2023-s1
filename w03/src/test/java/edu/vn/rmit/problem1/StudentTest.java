package edu.vn.rmit.problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * Unit test for Student classes.
 */
public class StudentTest {

  @Test
  public void toStringWithTypeForFullTimeStudent()
  {
    FullTimeStudent fullTimeStudent = new FullTimeStudent("s123", "Alice", "IT");
    assertEquals( "FullTimeStudent: <id=s123, name=Alice, major=IT>", fullTimeStudent.toString());
  }

  @Test
  public void toStringWithTypeForPartTimeStudent()
  {
    PartTimeStudent partTimeStudent = new PartTimeStudent("s123", "Alice", "IT", 10, 22);
    assertEquals( "PartTimeStudent: <id=s123, name=Alice, major=IT, minHour=10, maxHour=22>", partTimeStudent.toString());
  }

  @Test
  public void countStudentMembers()
  {
    FullTimeStudent fullTimeStudent = new FullTimeStudent("s123", "Alice", "IT");
    PartTimeStudent partTimeStudent = new PartTimeStudent("s123", "Alice", "IT", 10, 22);
    StudentGroup studentGroup = new StudentGroup();
    studentGroup.addStudent(fullTimeStudent);
    studentGroup.addStudent(partTimeStudent);
    assertTrue(studentGroup.getStudentCount() == 2);
  }
}
