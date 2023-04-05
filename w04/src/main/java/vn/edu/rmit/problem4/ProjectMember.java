package vn.edu.rmit.problem4;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class ProjectMember {
  // Use Map and List interfaces
  private Map<String, List<Project>> memberToProjects;

  public ProjectMember() {
    // An empty set at the begining
    memberToProjects = new HashMap<String, List<Project>>();
  }

  /**
   * Get a list of projects this person is doing
   * 
   * @param member the CanJoinProject member
   * @return get a list of projects this person is doing,
   * otherwise, return null if this person is not a member of any project
   */
  public List<Project> getAllProjects(CanJoinProject member) {
    return memberToProjects.get(member.getId());
  }

  /**
   * Get a list of sorted projects this person is doing
   * 
   * @param member the CanJoinProject member
   * @return get a list of sorted projects this person is doing,
   * otherwise, return null if this person is not a member of any project
   */
  public List<Project> getAllSortedProjects(CanJoinProject member) {
    List<Project> projects = memberToProjects.get(member.getId());
    if (projects != null) {
      projects.sort(new SortByBudget());
    }
    return projects;
  }

  /**
   * Add a project to a CanJoinProject person
   * 
   * @param member the CanJoinProject member
   * @param project An added project for the member
   * @return true if the add operation is successful, no otherwise
   */
  public boolean addProjectToMember(CanJoinProject member, Project project) {
    List<Project> current = memberToProjects.get(member.getId());
    if (current == null) {
      current = new ArrayList<Project>();
    }
    if (current.contains(project)) {
      return false;
    }
    current.add(project);
    memberToProjects.put(member.getId(), current);
    return true;
  }

  /**
   * Remove a project to a CanJoinProject person
   * 
   * @param member The CanJoinProject member
   * @param project A removed project for the member
   * @return true if the remove operation is successful, no otherwise
   */
  public boolean removeProjectForMember(CanJoinProject member, Project project) {
    List<Project> current = memberToProjects.get(member.getId());
    if (current == null) {
      return false;
    }
    if (current.contains(project)) {
      current.remove(project);
      memberToProjects.put(member.getId(), current);
      return true;
    }
    return false;
  }
}
