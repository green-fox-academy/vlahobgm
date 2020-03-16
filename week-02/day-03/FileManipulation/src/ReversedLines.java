import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        try{
            reversed();
        }catch (IOException e){
            System.out.println("Something went wrong");
        }
    }

    public static void reversed() throws IOException {
        Path filePath = Paths.get("assets/reversed-lines.txt");
        List<String> lines = Files.readAllLines(filePath);
        List<String> newLines = new ArrayList<>();
        for (String line : lines) {
            String newline = "";
            for (int j = line.length() - 1; j >= 0; j--) {
                newline += line.charAt(j);
            }
            newLines.add(newline);
        }
        Files.write(filePath,newLines);
    }
}
