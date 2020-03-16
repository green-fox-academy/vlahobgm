import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        try {
            duplicated();
        }catch (IOException e){
            System.out.println(".....");
        }


    }
    public static void duplicated() throws IOException {
        Path filePath = Paths.get("assets/duplicated-chars.txt");
        List<String> lines = Files.readAllLines(filePath);
        List<String> newLines = new ArrayList<>();

        for (String line : lines) {
            String newline = "";
            for (int j = 0; j < line.length(); j++) {
                if (j % 2 == 0){
                    char a = line.charAt(j);
                    newline += a;
                }
            }
            newLines.add(newline);
        }
        Files.write(filePath,newLines);

    }
}
