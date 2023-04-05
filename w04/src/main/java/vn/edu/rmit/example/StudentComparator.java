package vn.edu.rmit.example;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
  public static final int COMPARE_BY_ID = 1;
  public static final int COMPARE_BY_NAME = 2;
  private int compareBy;

  public StudentComparator(int compareBy) {
    this.compareBy = compareBy;
  }

  @Override
  public int compare(Student student1, Student student2) {
    if (compareBy == COMPARE_BY_NAME) {
      return student1.getName().compareTo(student2.getName());
    }
    return student1.getID().compareTo(student2.getID());
  }
}
