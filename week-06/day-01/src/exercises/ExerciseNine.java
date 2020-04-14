package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseNine {
  public static void main(String[] args) {
    //Write a Stream Expression to find the frequency of characters in a given string!
   String word = "GreenFox";
    Map<String,Long> frequencies = Arrays.stream(word.toLowerCase().split(""))
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    frequencies.forEach((k,v) -> System.out.println(k + " occurs:" + v + " times"));
    
  }
}
