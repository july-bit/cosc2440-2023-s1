package vn.edu.rmit.example;

public class Inheritance {
  private void privateMethod() {
    System.out.println("Private method");
  }

  protected void protectedMethod() {
    System.out.println("Protected method");
  }
}

class ChildClass extends Inheritance {
  public void callParentMethod() {
    protectedMethod();
  }

  public static void main(String[] args) {
    (new ChildClass()).callParentMethod();
  }
}
