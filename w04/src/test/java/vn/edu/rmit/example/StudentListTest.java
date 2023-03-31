package vn.edu.rmit.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class StudentListTest {
  @Test
  public void zeroStudentList() {
    StudentList lst = new StudentList();
    assertEquals(0, lst.countStudent());
  }

  @Test
  public void twoStudentList() {
    StudentList lst = new StudentList();
    lst.addStudent(new Student("s123", "Alice"));
    lst.addStudent(new Student("s456", "Bob"));
    assertEquals(2, lst.countStudent());
  }

  @Test
  public void duplicatedStudentIDStillCount() {
    StudentList lst = new StudentList();
    lst.addStudent(new Student("s123", "Alice"));
    lst.addStudent(new Student("s123", "Bob"));
    lst.addStudent(new Student("s123", "Carol"));
    assertEquals(3, lst.countStudent());
  }
}
