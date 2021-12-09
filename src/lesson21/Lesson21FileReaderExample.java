package lesson21;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson21FileReaderExample {
    public static void main(String[] args) {

        Path myPath = Paths.get("C:\\Users\\Admin\\Downloads\\246488553_4520390478010886_857548500154594308_n.jpg");
        //

        while (myPath.getRoot().iterator().hasNext()) {
            System.out.println(myPath.getRoot().iterator().next().getFileName());
        }

        Path myPath2 = Paths.get("C:\\Users\\Admin\\Downloads");
        //

        while (myPath.iterator().hasNext()) {
            System.out.println(myPath.iterator().next().getFileName());
        }

    }
}
