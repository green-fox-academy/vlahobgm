package anagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

  public boolean isAnagram(String wordA, String wordB){
    List<Character> lettersA = new ArrayList<>();
    List<Character> lettersB = new ArrayList<>();
    for (int i = 0; i < wordA.length(); i++) {
      lettersA.add(wordA.charAt(i));
      lettersB.add(wordB.charAt(i));
    }
    Collections.sort(lettersA);
    Collections.sort(lettersB);
    return lettersA.equals(lettersB);
  }
}
