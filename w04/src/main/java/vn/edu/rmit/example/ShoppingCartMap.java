package vn.edu.rmit.example;

import java.util.Map;
import java.util.HashMap;

public class ShoppingCartMap {
  Map<String, Integer> items;

  public ShoppingCartMap() {
    items = new HashMap<>();
  }

  public void addItem(String itemName) {
    if (items.containsKey(itemName)) {
      int currentQuantity = items.get(itemName);
      items.put(itemName, currentQuantity + 1);
      return;
    }
    items.put(itemName, 1);
  }

  public void removeItem(String itemName) {
    if (items.containsKey(itemName)) {
      int currentQuantity = items.get(itemName);
      if (currentQuantity > 1) {
        items.put(itemName, currentQuantity - 1);
      } else {
        items.remove(itemName);
      }
    }
  }

  public int countItem(String name) {
    Integer count =  items.get(name);
    if (count == null) {
      return 0;
    }
    return count;
  }
}
