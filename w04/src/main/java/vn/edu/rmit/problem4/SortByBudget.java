package vn.edu.rmit.problem4;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.util.Comparator;

public class SortByBudget implements Comparator<Project> {
  // Used for sorting in descending order of budget  
  public int compare(Project a, Project b)  
  {  
    return (int)(b.getBudget() - a.getBudget());  
  }  
}
