package edu.vn.rmit.problem1;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */

public class StudentGroup {
  
  private Student[] students;
  private static final int MAX_MEMBERS = 10;
  private int studentCount;

  public StudentGroup() {
    students = new Student[MAX_MEMBERS];
    studentCount = 0;
  }

  // Getter methods
  public int getStudentCount() {
    return studentCount;
  }

  /**
   * add a new student to this group
   * <p>
   * Add a new student to this group.
   * </p>
   * @param newStudent a student who want to join this group
   */
  public void addStudent(Student newStudent) {
    students[studentCount++] = newStudent;
  }

  /**
   * display all students in this group
   */
  void displayAll() {
    for(int i = 0; i < studentCount; i++) {
      System.out.printf("Student member #%d: " + students[i] + "\n", i + 1);
    }
  }
}
