import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String , String> bookMap = new HashMap<>();
        bookMap.put("William A. Lathan", "405-709-1865");
        bookMap.put("John K. Miller", "402-247-8568");
        bookMap.put("Hortensia E. Foster", "606-481-6467");
        bookMap.put("Amanda D. Newland", "319-243-5613");
        bookMap.put("Brooke P. Askew", "307-687-2982");

        //What is John K. Miller's phone number?
        System.out.println("What is John K. Miller's phone number? " + bookMap.get("John K. Miller"));
        //Whose phone number is 307-687-2982?
        for (Map.Entry<String, String> item : bookMap.entrySet()) {
            if (item.getValue() == "307-687-2982") {
                System.out.println("Whose phone number is 307-687-2982? " + item.getKey());
            }
        }
        //Do we know Chris E. Myers' phone number?
        System.out.println(bookMap.containsKey("Do we know Chris E. Myers' phone number?" + "Chris E. Myers"));
    }
}
