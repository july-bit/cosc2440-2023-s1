package vn.edu.rmit.problem3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import vn.edu.rmit.problem1.Student;

/**
 * Unit test for PartTimeStudent
 */
public class PartTimeStudentTest
{
  @Test
  public void counterDependOnPartTimeStudentOnly() {
    int counterBefore = PartTimeStudent.count();
    Student std1 = new PartTimeStudent("s123", "Alice", "IT", 10, 20);
    Student std2 = new PartTimeStudent("s124", "Bob", "IT", 10, 20);
    int counterAfterTwo = PartTimeStudent.count();
    Student normalStudent1 = new Student("s125", "Alice", "IT");
    Student normalStudent2 = new Student("s126", "Alice", "IT");
    int counterAfterNormalStudent = PartTimeStudent.count();
    assertEquals(counterBefore + 2, counterAfterTwo);
    assertEquals(counterAfterTwo, counterAfterNormalStudent);
  }
}
