import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        //How much did we spend?
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        //Which was our greatest expense?
        int max = Collections.max(list);

        //Which was our cheapest spending?
        int min = Collections.min(list);

        //What was the average amount of our spendings?
        double average = (double)sum / list.size();

        System.out.println("How much did we spend? " + sum);
        System.out.println("Which was our greatest expense? " + max);
        System.out.println("Which was our cheapest spending? " + min);
        System.out.println("What was the average amount of our spendings? " + average);
    }
}
