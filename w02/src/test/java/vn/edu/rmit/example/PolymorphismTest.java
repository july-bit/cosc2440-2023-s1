package vn.edu.rmit.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class PolymorphismTest {

  @Test
  public void welcomeFromParent() {
    var obj = new Polymorphism();
    assertTrue(obj.greeting().equals("Welcome from Parent"));
  }

  @Test
  public void welcomeFromChild() {
    var obj = new AnotherChildClass();
    assertTrue(obj.greeting().equals("Welcome from Parent!"));
  }

  @Test
  public void childBehaviorExpected() {
    Polymorphism obj = new GrandChildClass();
    assertEquals("Welcome from Parent!?", obj.greeting());
  }

  @Test
  public void castParentToChild() {
    Polymorphism obj = new GrandChildClass();
    // cannot call obj.newMethod(); because obj is Polymorphism
    // have to type-cast it
    assertEquals("Only me", ((GrandChildClass)obj).newMethod());
  }

  @Test
  public void castIncorrectObject() {
    // to type-case correctly, the REAL object is expected
    // otherwise, an exception is thrown
    assertThrows(ClassCastException.class, 
      () -> {
        Polymorphism obj = new AnotherChildClass();
        ((GrandChildClass)obj).newMethod();
      }
    );
  }
}
