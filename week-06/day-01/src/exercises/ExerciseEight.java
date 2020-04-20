package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseEight {
  public static void main(String[] args) {
    //Write a Stream Expression to concatenate a Character list to a string!
    List<Character> characterList = Arrays.asList('T', 'o', 'm', 'a', 't', 'o');
    String word = characterList.stream()
        .map(String::valueOf)
        .collect(Collectors.joining());
    System.out.println(word);

    List<String> characterList2 = Arrays.asList("T", "o", "m", "a", "t", "o");
    String word2 = characterList2.stream()
        .reduce("", (partialString, element) -> partialString + element);
    System.out.println(word2);

    List<String> characterList3 = Arrays.asList("T", "o", "m", "a", "t", "o");
    String word3 = characterList3.stream()
        .reduce("", String::concat);
    System.out.println(word3);
  }
}
