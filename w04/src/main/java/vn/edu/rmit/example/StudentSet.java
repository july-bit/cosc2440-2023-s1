package vn.edu.rmit.example;

import java.util.Set;
import java.util.HashSet;

public class StudentSet {
  Set<Student> students;

  public StudentSet() {
    students = new HashSet<>();
  }

  public void addStudent(Student s) {
    students.add(s);
  }

  public int countStudent() {
    return students.size();
  }
}
