package vn.edu.rmit.problem4;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
 */

import vn.edu.rmit.problem1.Student;

public class FullTimeStudent extends Student {

  /**
   * The constructor
   * @param id student id
   * @param name student full name
   * @param major major of the study
   */
  public FullTimeStudent(String id, String name, String major) {
    super(id, name, major);
  }

  /**
   * assign the current fulltime student as a member of a project
   * <p>
   * Join a project as a member. It's the job of the project class
   * to check for validity of this action or to check if
   * this FullTimeStudent member exists in the project already
   * </p>
   * @param p the project to join
   */
  public void joinProject(Project p) {
     p.addMember(this);
   }
 }