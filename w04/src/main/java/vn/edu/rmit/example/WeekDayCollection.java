package vn.edu.rmit.example;

import java.util.AbstractCollection;
import java.util.Iterator;

public class WeekDayCollection extends AbstractCollection<String> {
  private static final int COLLECTION_SIZE = 7;
  private static final String[] NAMES = {
    "Mon",
    "Tue",
    "Wed",
    "Thu",
    "Fri",
    "Sat",
    "Sun"
  };

  private int current;

  public WeekDayCollection(int startFrom) {
    current = startFrom;
  }

  @Override
  public int size() {
    return COLLECTION_SIZE;
  }

  @Override
  public Iterator<String> iterator() {
    return new WeekDayIterator(this);
  }

  static class WeekDayIterator implements Iterator<String> {
    private int count;
    WeekDayCollection outer;

    public WeekDayIterator(WeekDayCollection outer) {
      count = 0;
      this.outer = outer;
    }

    @Override
    public boolean hasNext() {
      if (count < 7) {
        return true;
      }
      return false;
    }

    @Override
    public String next() {
      String result = NAMES[outer.current];
      outer.current = (outer.current + 1) % COLLECTION_SIZE;
      count++;
      return result;
    }  
  }
}
