package vn.edu.rmit.problem4;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

public interface CanJoinProject {
  // Remember that an interface is to specify the public API.
  // An interface has no state (e.g., variables/attributes).
  public void setProfile(String profile);
  public String getProfile();
  public String getId();
}

