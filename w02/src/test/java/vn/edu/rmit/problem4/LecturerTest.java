package vn.edu.rmit.problem4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * Unit test for Lecturer
 */
public class LecturerTest
{
  @Test
  public void leadOne() {
    Lecturer l1 = new Lecturer("e001", "Alice", "Professor");
    Project p1 = new Project("Java", 999);
    assertTrue(l1.leadProject(p1));
  }

  @Test
  public void cannotLeadTwo() {
    Lecturer l1 = new Lecturer("e001", "Alice", "Professor");
    Project p1 = new Project("Java", 999);
    Project p2 = new Project("More Java", 888);
    l1.leadProject(p1);
    assertFalse(l1.leadProject(p2));
  }

  @Test
  public void cannotLeadOneWithOther() {
    Lecturer l1 = new Lecturer("e001", "Alice", "Professor");
    Project p1 = new Project("Java", 999);
    l1.leadProject(p1);
    Lecturer l2 = new Lecturer("e002", "Bob", "Assoc. Professor");
    assertFalse(l2.leadProject(p1));
  }
}
