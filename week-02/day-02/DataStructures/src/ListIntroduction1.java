import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        //print out number of elements
        System.out.println(names.size());

        names.add("William");
        //print out empty or not
        System.out.println("is it empty? " + names.isEmpty());

        names.add("John");
        names.add("Amanda");
        //print out the number of elements in the list
        System.out.println(names.size());

        //print out the 3rd element
        System.out.println(names.get(2));

        //Iterate through the list and print out each name
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //Iterate through the list and print
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1)+ ". " + names.get(i) );
        }

        //Remove the 2nd element
        names.remove(1);

        //Iterate through the list in a reversed order and print out each name
        for (int i = names.size()-1; i >= 0 ; i--) {
            System.out.println(names.get(i));
        }

        //Remove all elements
        names.clear();
    }
}
