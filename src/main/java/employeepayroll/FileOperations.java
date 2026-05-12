package employeepayroll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {

    public static void main(String[] args) throws IOException {

        String homePath = System.getProperty("user.home");

        Path playPath = Paths.get(homePath + "/Playground");

        if (!Files.exists(playPath)) {
            Files.createDirectory(playPath);
            System.out.println("Directory Created");
        }

        Path filePath = Paths.get(playPath + "/sample.txt");

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
            System.out.println("File Created");
        }

        System.out.println("File Exists : " + Files.exists(filePath));

        Files.list(playPath)
                .forEach(System.out::println);

        Files.deleteIfExists(filePath);

        System.out.println("File Deleted");
    }
}