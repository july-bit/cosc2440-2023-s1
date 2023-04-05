package vn.edu.rmit.example;

import java.util.List;
import java.util.ArrayList;

public class StudentList {
  List<Student> students;

  public StudentList() {
    students = new ArrayList<>();
  }

  public void addStudent(Student s) {
    students.add(s);
  }

  public int countStudent() {
    return students.size();
  }
}
