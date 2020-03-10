import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = new ArrayList<>();
        listB.addAll(listA);
        System.out.println(listA.contains("Durian"));

        listB.remove("Durian");
        listA.add(4,"Kiwifruit");
        //System.out.println(listA);
        //Compare the size of List A and List B
        int sizeA = listA.size();
        int sizeB = listB.size();
        System.out.println(sizeA + " " + sizeB);

        System.out.println(listA);
        System.out.println(listB);
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));

        listA.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
        System.out.println(listA);

        System.out.println(listA.get(2));
    }
}
