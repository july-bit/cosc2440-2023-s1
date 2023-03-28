package edu.vn.rmit.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class AbstractClassTest {
  @Test
  public void canCreateConcrete() {
    AbstractClass variable;
    variable = new Morning();
    assertEquals("good morning", variable.greeting());
    variable = new Afternoon();
    assertEquals("good afternoon", variable.greeting());
  }
}
