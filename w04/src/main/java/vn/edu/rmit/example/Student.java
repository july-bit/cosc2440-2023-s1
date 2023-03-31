package vn.edu.rmit.example;

public class Student {
  private String sID;
  private String name;

  public Student(String id, String n) {
    sID = id;
    name = n;
  }

  String getID() {
    return sID;
  }

  String getName() {
    return name;
  }

  @Override
  public int hashCode() {
    return sID.length();
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Student)) {
      return false;
    }
    return sID.equals(((Student)other).sID);
  }  
}
