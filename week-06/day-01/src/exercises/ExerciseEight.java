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
  }
}
