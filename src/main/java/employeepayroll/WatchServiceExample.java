package employeepayroll;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class WatchServiceExample {

    public static void main(String[] args) throws IOException, InterruptedException {

        Path path = Paths.get(".");

        WatchService watchService =
                FileSystems.getDefault().newWatchService();

        path.register(
                watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY
        );

        System.out.println("Watching Current Directory...");

        while (true) {

            WatchKey key = watchService.take();

            for (WatchEvent<?> event : key.pollEvents()) {

                System.out.println("Event Type : " + event.kind());

                System.out.println("File Affected : " + event.context());
            }

            boolean valid = key.reset();

            if (!valid) {
                break;
            }
        }
    }
}