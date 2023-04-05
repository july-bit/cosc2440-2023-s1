package edu.vn.rmit.problem4;

import java.util.Comparator;

public class SortByBudget implements Comparator<Project> {
    public int compare(Project a, Project b) {
        return (int) b.getBudget() - (int) a.getBudget();
    }

}
