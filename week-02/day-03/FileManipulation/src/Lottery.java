import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottery {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers in lottery.csv
    Path filePath = Paths.get("assets/lottery.csv");
    List<String> lines = new ArrayList<>();
    List<Integer> allNumbers = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
    }catch (IOException e){
      System.out.println("Something went wrong!");
    }
    for (int i = 0; i < lines.size(); i++) {
      String[] lotteryData = lines.get(i).split(";");
      int firstNumber = Integer.parseInt(lotteryData[11]);
      int secondNumber = Integer.parseInt(lotteryData[12]);
      int thirdNumber = Integer.parseInt(lotteryData[13]);
      int fourthNumber = Integer.parseInt(lotteryData[14]);
      int fifthNumber = Integer.parseInt(lotteryData[15]);

      allNumbers.add(firstNumber);
      allNumbers.add(secondNumber);
      allNumbers.add(thirdNumber);
      allNumbers.add(fourthNumber);
      allNumbers.add(fifthNumber);
    }
    HashMap<Integer,Integer> occNumber = new HashMap();

    for (int i = 1; i <= 90; i++) {
      occNumber.put(i,Collections.frequency(allNumbers,i));
    }
    occNumber.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .forEach(System.out::println);

    /*for (Map.Entry<Integer, Integer> item : occNumber.entrySet()) {
      System.out.println(item.getKey() + " " + item.getValue());
    }*/
  }
}