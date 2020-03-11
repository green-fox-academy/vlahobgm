import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt

        /*char a = 'a';
        char c = (char)(a+1);
        System.out.println(c);*/
        try{
            decode();
        }catch (IOException e){

        }
    }
    public static void decode() throws IOException {
        Path filePath = Paths.get("encoded-lines.txt");
        List<String> lines = Files.readAllLines(filePath);
        List<String> newLines = new ArrayList<>();
        for (String line : lines) {
            String newline = "";
            for (int i = 0; i < line.length(); i++) {
                char orig = line.charAt(i);
                char newChar = (char)(orig - 1);
                newline += newChar;
            }
            newLines.add(newline);
        }
        Files.write(filePath,newLines);
    }
}
