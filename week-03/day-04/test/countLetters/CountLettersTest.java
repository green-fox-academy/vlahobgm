package countLetters;

import static org.junit.Assert.*;


import java.util.HashMap;
import org.junit.Test;

public class CountLettersTest {

  @Test
  public void letterCounter() {
    CountLetters count = new CountLetters();
    String word = "hello";
    HashMap<Character,Integer> map = new HashMap<>();
    map.put('h',1);
    map.put('e',1);
    map.put('l',2);
    map.put('o',1);
    assertEquals(map,count.letterCounter(word));
  }
}