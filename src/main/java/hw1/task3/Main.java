package hw1.task3;

import java.io.IOException;
import java.nio.file.*;
import java.util.regex.*;

public class Main {
    static void main() {
        try {

            String xml = Files.readString(Path.of("src/main/java/hw1/task3/sample.xml"));
            Pattern p = Pattern.compile("<\\w+>(.*?)</\\w+>");
            Matcher m = p.matcher(xml);

            while (m.find()) {
                System.out.println(m.group(1));
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(Path.of("").toAbsolutePath());
        }
    }
}
