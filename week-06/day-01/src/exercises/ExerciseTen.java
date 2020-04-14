package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseTen {
  /*Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

  Write a Stream Expression to find the foxes with green color!
  Write a Stream Expression to find the foxes with green color, and age less then 5 years!
  Write a Stream Expression to find the frequency of foxes by color!*/
  public static void main(String[] args) {
    List<Fox> foxList = Arrays.asList(
        new Fox("Loka", "Green", 25),
        new Fox("Roka", "Yellow", 32),
        new Fox("Loki", "Green", 10),
        new Fox("Roki", "Blue", 4),
        new Fox("Rokka", "Green", 2)
    );
    System.out.println("Write a Stream Expression to find the foxes with green color!");
    foxList.stream()
        .filter(Fox -> Fox.getColor().equals("Green"))
        .forEach(Fox -> System.out.println(Fox.getName()));
    System.out.println("Write a Stream Expression to find the foxes with green color, and age less then 5 years!");
    foxList.stream()
        .filter(Fox -> Fox.getColor().equals("Green") && Fox.getAge() < 5)
        .forEach(Fox -> System.out.println(Fox.getName()));
    System.out.println("Write a Stream Expression to find the frequency of foxes by color!");
    Map<Object,Long> frequencies = foxList.stream()
        .collect(Collectors.groupingBy(Fox -> Fox.getColor(), Collectors.counting()));
    frequencies.forEach((k,v) -> System.out.println(k + " occurs:" + v + " times"));
  }
}
