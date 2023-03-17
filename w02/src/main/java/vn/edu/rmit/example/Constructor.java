package vn.edu.rmit.example;

public class Constructor {
  // a default constructor is provided
  // only if NO instructor is defined
  public Constructor() {
    System.out.println("Empty Parent Constructor");
  }

  public Constructor(String msg) {
    System.out.println("String argument Parent Constructor " + msg);
  }
}

class ConstructorChild extends Constructor {
  public ConstructorChild() {
    // no call to super() => the empty super() will execute
    System.out.println("Empty Child Constructor");
  }

  public ConstructorChild(String msg) {
    // call to super(), so that call will be used
    super(msg);
    System.out.println("String argument Child Constructor " + msg);
  }

  public static void main(String[] args) {
    Constructor parent = new ConstructorChild();

    Constructor parent2 = new ConstructorChild("hello");    
  }
}
