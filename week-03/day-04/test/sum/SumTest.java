package sum;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SumTest {

  @Test
  public void sum_ArrayListWithMultipleElement() {
    Sum sum = new Sum();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(50);
    list.add(12);
    list.add(18);
    list.add(20);
    assertEquals(100,sum.sum(list));
  }
  @Test
  public void sum_EmptyList() {
    Sum sum = new Sum();
    ArrayList<Integer> list = new ArrayList<>();
    assertEquals(0,sum.sum(list));
  }

  @Test
  public void sum_ListWithOneElement() {
    Sum sum = new Sum();
    ArrayList<Integer> list = new ArrayList<>();
    list.add(50);
    assertEquals(50,sum.sum(list));
  }

  @Test
  public void sum_Null() {
    Sum sum = new Sum();
    ArrayList<Integer> list = new ArrayList<>();
    list.equals(null);
    assertEquals(0,sum.sum(list));
  }

}