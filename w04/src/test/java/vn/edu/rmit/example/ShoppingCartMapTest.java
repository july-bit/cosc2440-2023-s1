package vn.edu.rmit.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class ShoppingCartMapTest {
  @Test
  public void addOneItem() {
    ShoppingCartMap cart = new ShoppingCartMap();
    cart.addItem("Apple");
    assertEquals(1, cart.countItem("Apple"));
  }

  @Test
  public void addThreeItems() {
    ShoppingCartMap cart = new ShoppingCartMap();
    cart.addItem("Apple");
    cart.addItem("Apple");
    cart.addItem("Apple");
    assertEquals(3, cart.countItem("Apple"));
  }

  @Test
  public void addThenRemove() {
    ShoppingCartMap cart = new ShoppingCartMap();
    cart.addItem("Apple");
    assertEquals(1, cart.countItem("Apple"));
    cart.removeItem("Apple");
    assertEquals(0, cart.countItem("Apple"));
    cart.removeItem("Apple");
    assertEquals(0, cart.countItem("Apple"));
  }

  @Test
  public void addTwoKindsOfItems() {
    ShoppingCartMap cart = new ShoppingCartMap();
    cart.addItem("Apple");
    cart.addItem("Apple");    
    cart.addItem("Banana");
    cart.addItem("Banana");
    cart.addItem("Banana");
    assertEquals(2, cart.countItem("Apple"));
    assertEquals(3, cart.countItem("Banana"));
  }
}
