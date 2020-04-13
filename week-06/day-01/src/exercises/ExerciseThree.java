package exercises;

import java.util.Arrays;
import java.util.List;

public class ExerciseThree {
  public static void main(String[] args) {
    //Write a Stream Expression to find which number squared value is more then 20 from the following list:
    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
    numbers.stream().filter(x -> Math.pow(x,2) > 20).forEach(System.out::println);
  }
}
