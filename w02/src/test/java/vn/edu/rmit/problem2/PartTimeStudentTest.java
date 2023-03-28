package vn.edu.rmit.problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import vn.edu.rmit.problem1.Student;

/**
 * Unit test for PartTimeStudent
 */
public class PartTimeStudentTest
{
  @Test
  public void equalPartTimeStudents() {
    Student std1 = new PartTimeStudent("s123", "Alice", "IT", 10, 20);
    Student std2 = new PartTimeStudent("s123", "Bob", "IT", 10, 20);
    assertTrue(std1.equals(std2));
  }

  @Test
  public void setMinHourInConstructor() {    
    PartTimeStudent std1 = new PartTimeStudent("s123", "Alice", "IT", 10, 20);    
    assertEquals(10, std1.getMinHour());
  }

  @Test
  public void setMinHourWithSetter() {
    PartTimeStudent std1 = new PartTimeStudent("s123", "Alice", "IT", 10, 20);
    std1.setMinHour(12);
    assertEquals(12, std1.getMinHour());
  }

  @Test
  public void setMaxHourInConstructor() {    
    PartTimeStudent std1 = new PartTimeStudent("s123", "Alice", "IT", 10, 22);    
    assertEquals(22, std1.getMaxHour());
  }

  @Test
  public void setMaxHourWithSetter() {
    PartTimeStudent std1 = new PartTimeStudent("s123", "Alice", "IT", 10, 22);
    std1.setMaxHour(21);
    assertEquals(21, std1.getMaxHour());
  }

  @Test
  public void toStringWithNewAttrs() {
    Student std1 = new PartTimeStudent("s123", "Alice", "IT", 10, 22);
    assertEquals("studentId: s123, fullName: Alice, major: IT, minHour: 10, maxHour: 22", std1.toString());
  }
}
