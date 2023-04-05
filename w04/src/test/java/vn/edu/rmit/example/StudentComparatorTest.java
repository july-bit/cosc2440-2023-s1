package vn.edu.rmit.example;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class StudentComparatorTest {
  @Test
  public void compareByID() {
    List<Student> lst = new ArrayList<>();
    lst.add(new Student("abc", "Zoe"));
    lst.add(new Student("xyz", "Alice"));
    lst.add(new Student("abcd", "Tom"));
    lst.sort(new StudentComparator(StudentComparator.COMPARE_BY_ID));
    assertEquals("abc", lst.get(0).getID());
    assertEquals("Zoe", lst.get(0).getName());
    assertEquals("abcd", lst.get(1).getID());
    assertEquals("Tom", lst.get(1).getName());
    assertEquals("xyz", lst.get(2).getID());
    assertEquals("Alice", lst.get(2).getName());
  }

  @Test
  public void compareByName() {
    List<Student> lst = new ArrayList<>();
    lst.add(new Student("abc", "Zoe"));
    lst.add(new Student("xyz", "Alice"));
    lst.add(new Student("abcd", "Tom"));
    lst.sort(new StudentComparator(StudentComparator.COMPARE_BY_NAME));
    assertEquals("xyz", lst.get(0).getID());
    assertEquals("Alice", lst.get(0).getName());   
    assertEquals("abcd", lst.get(1).getID());
    assertEquals("Tom", lst.get(1).getName());
    assertEquals("abc", lst.get(2).getID());
    assertEquals("Zoe", lst.get(2).getName());
  }
}
