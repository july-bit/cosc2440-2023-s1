package edu.vn.rmit.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class InterfaceTest {
  @Test
  public void objectOfChild1IsAParent() {
    Parent p = new Child1();
    assertTrue(p instanceof Child1);
    assertTrue(p instanceof Parent);
  }

  @Test
  public void objectOfChild2IsAParentAndInterface() {
    Parent p = new Child2();
    assertTrue(p instanceof Child2);
    assertTrue(p instanceof Parent);
    assertTrue(p instanceof Interface);
  }

  @Test
  public void objectOfChild1IsNotInterface() {
    Parent p = new Child1();
    assertTrue(p instanceof Child1);
    assertFalse(p instanceof Interface);
  }

  @Test
  public void canUseInterfaceAsVariable() {
    Interface f = new Child2();
    assertTrue(f instanceof Child2);
    assertTrue(f instanceof Interface);
  }
}
