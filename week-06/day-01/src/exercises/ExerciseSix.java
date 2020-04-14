package exercises;

import java.util.ArrayList;
import java.util.List;

public class ExerciseSix {
  public static void main(String[] args) {
    //Write a Stream Expression to find the uppercase characters in a string!
    String word = "gAhodZBgSDg";
    List<Character> characterList = new ArrayList<>();
    for (int i = 0; i < word.length(); i++) {
      characterList.add(word.charAt(i));
    }

    characterList.stream()
        .filter(ch -> Character.isUpperCase(ch.charValue()))
        .forEach(System.out::println);
  }
}
