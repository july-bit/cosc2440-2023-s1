package vn.edu.rmit.example;

public class Polymorphism {
  public String greeting() {
    return "Welcome from Parent";
  }
}

class AnotherChildClass extends Polymorphism {
  @Override
  public String greeting() {
    return super.greeting() + "!";
  }
}

class GrandChildClass extends AnotherChildClass {
  @Override
  public String greeting() {
    return super.greeting() + "?";
  }

  public String newMethod() {
    return "Only me";
  }
}
