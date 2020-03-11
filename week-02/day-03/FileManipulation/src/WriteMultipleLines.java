import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        // Create a function that takes 3 parameters: a path, a word and a number
        // and is able to write into a file.
        // The path parameter should be a string that describes the location of the file you wish to modify
        // The word parameter should also be a string that will be written to the file as individual lines
        // The number parameter should describe how many lines the file should have.
        // If the word is 'apple' and the number is 5, it should write 5 lines
        // into the file and each line should read 'apple'
        // The function should not raise any errors if it could not write the file.
        try {
            writeMultiple();
            System.out.println("my-file.txt changed");
        }catch (IOException e){
            System.out.println("Cant reach file");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
    public static void writeMultiple() throws IOException {
        Path path = Paths.get("my-file.txt");
        List<String> list = new ArrayList<>();
        int number = 5;
        for (int i = 0; i < number; i++) {
            list.add("Apple");
        }
        Files.write(path, list);
    }
}
