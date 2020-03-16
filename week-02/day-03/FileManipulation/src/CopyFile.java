import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        copyContent(Paths.get("assets/copyFilesource.txt"), Paths.get("assets/copyFileDestination.txt"));
    }
    public static boolean copyContent(Path source, Path destination) throws IOException {
        List<String> content = new ArrayList<>();
        List<String> sourceLines = Files.readAllLines(source);
        for (int i = 0; i < sourceLines.size(); i++) {
            content.add(sourceLines.get(i));
        }
        try {
            Files.write(destination,content);
            return true;
        }catch (IOException e){
            return false;
        }


    }
}
