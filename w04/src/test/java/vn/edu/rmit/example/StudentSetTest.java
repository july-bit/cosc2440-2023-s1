package vn.edu.rmit.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class StudentSetTest {
  @Test
  public void zeroStudentSet() {
    StudentSet set = new StudentSet();
    assertEquals(0, set.countStudent());
  }

  @Test
  public void twoStudentSet() {
    StudentSet set = new StudentSet();
    set.addStudent(new Student("s123", "Alice"));
    set.addStudent(new Student("s456", "Bob"));
    assertEquals(2, set.countStudent());
  }

  @Test
  public void duplicatedStudentIDNotCount() {
    StudentSet set = new StudentSet();
    set.addStudent(new Student("s123", "Alice"));
    set.addStudent(new Student("s123", "Bob"));
    set.addStudent(new Student("s123", "Carol"));
    assertEquals(1, set.countStudent());
  }
}
