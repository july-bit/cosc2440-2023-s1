package vn.edu.rmit.example;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class WeekDayCollectionTest {
  @Test
  public void collectionSizeIsSeven() {
    WeekDayCollection col = new WeekDayCollection(0);
    assertEquals(7, col.size());
  }

  @Test
  public void iteratorStartFromMonday() {
    WeekDayCollection col = new WeekDayCollection(0);
    Iterator<String> it = col.iterator();
    assertTrue(it.hasNext());
    assertEquals("Mon", it.next());;
  }

  @Test
  public void iteratorStartFromFriday() {
    WeekDayCollection col = new WeekDayCollection(4);
    Iterator<String> it = col.iterator();
    assertTrue(it.hasNext());
    assertEquals("Fri", it.next());;
  }

  @Test
  public void iteratorExactlySevenLoops() {
    WeekDayCollection col = new WeekDayCollection(4);
    Iterator<String> it = col.iterator();
    for (int i = 0; i < 7; i++) {
      assertTrue(it.hasNext());
      it.next();
    }
    assertFalse(it.hasNext());
  }
}
