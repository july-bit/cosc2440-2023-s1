package vn.edu.rmit.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class OverloadingTest {

  @Test
  public void shouldAddTwoNumbers() {
    var obj = new Overloading();
    assertEquals(8, obj.add(4, 4));
  }

  @Test
  public void shouldConcatenateTwoStrings() {
    var obj = new Overloading();
    assertEquals("HelloWorld", obj.add("Hello", "World"));
  }
}
