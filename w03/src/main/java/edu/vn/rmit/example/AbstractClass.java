package edu.vn.rmit.example;

public abstract class AbstractClass {
  public abstract String greeting();
}

class Morning extends AbstractClass {
  @Override
  public String greeting() {
    return "good morning";
  }
}

class Afternoon extends AbstractClass {
  @Override
  public String greeting() {
    return "good afternoon";
  }
}
