package edu.vn.rmit.problem4;

import java.util.HashSet;
import java.util.Set;

public class LeaderSet {
    static final public Set<Lecturer> LeaderSet = new HashSet<>();

    /**
     * Check whether a lecturer lec is leading a project
     * @param lec: lecturer needed to check
     */
    public boolean isLead(Lecturer lec) {
        return LeaderSet.contains(lec);
    }

    /**
     * Add a lecturer to the LeaderSet
     * @param lec: lecturer needed to add
     */
    public static boolean addLeader(Lecturer lec) {
        // check if lecturer already exists in set
        // is it okay to contain duplications of leader lecturer?

        for (Lecturer leader : LeaderSet) {
            if (leader.equals(lec)) // already exists
            {
                return false;
            }
        }
        LeaderSet.add(lec);
        return true;

    }
    public boolean removeLecturer(Lecturer lec) {
        // validate whether the set contains this lecturer
        // if not, can remove
        if (LeaderSet.contains(lec)) {
            LeaderSet.remove(lec);
            return true;
        }
        return false;
    }

}

