package anagram;

import static org.junit.Assert.*;


import org.junit.Test;

public class AnagramTest {

  @Test
  public void isAnagram() {
    Anagram anagram = new Anagram();
    String word1 = "szinyeimersepál";
    String word2 = "silányszerepeim";
    assertEquals(true,anagram.isAnagram(word1,word2));
  }
}