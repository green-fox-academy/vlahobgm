package exercises;

import java.util.Arrays;
import java.util.List;

public class ExerciseTwo {
  public static void main(String[] args) {
    //Write a Stream Expression to get the squared value of the positive numbers from the following list:
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    numbers.stream().filter(x -> x > 0).forEach(System.out::println);
  }
}
