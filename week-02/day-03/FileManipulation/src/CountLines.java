import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        try {
            countLines();
        }catch (IOException e){
            System.out.println(0);
        }catch (Exception e){
            System.out.println("Something went wrong!");
        }

    }
    public static int countLines() throws IOException {
        Path path = Paths.get("test.txt");
        List<String> lines = Files.readAllLines(path);
        int countLines = lines.size();
        return countLines;
    }
}
