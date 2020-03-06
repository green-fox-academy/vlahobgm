import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class SubStr {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "ll";
        System.out.println(str.length());
        System.out.println(str.contains(str2));
        System.out.println(str2.length());

        for (int i = 0; i < str.length() ; i++) {
            
        }

    }


    /*public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:

        //  should print: `17`
        System.out.println(subStr("this is what I'm searching in", "searching"));

        //  should print: `-1`
        System.out.println(subStr("this is what I'm searching in", "not"));

    }

    public static int subStr(String input, String q) {

        return -1;
    }*/
}
