import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        try {
            reversedOrder();
        }catch (IOException e){
            System.out.println("");
        }

    }
    public static void reversedOrder() throws IOException {
        Path filePath = Paths.get("reversed-order.txt");
        List<String> lines = Files.readAllLines(filePath);
        List<String> newLines = new ArrayList<>();
        for (int i = lines.size()-1; i >= 0 ; i--) {
            newLines.add(lines.get(i));
        }
        //Files.write(filePath,newLines);
        for (int i = 0; i < newLines.size() ; i++) {
            System.out.println(newLines.get(i));
        }
    }
}
