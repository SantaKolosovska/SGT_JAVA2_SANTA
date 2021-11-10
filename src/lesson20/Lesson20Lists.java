package lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson20Lists {

    public static void main(String[] args) {

        List<String> streets = new ArrayList<String>();

        streets.add("Struktoru");
        streets.get(0);     // Struktoru
        streets.add("Strauta");     // index 1
        streets.set(0, "Olivu");    // overwrites

        System.out.println(streets);

        streets.addAll(streets);
        // lists with many hardcoded elements aren't really used in real life, you should iterate through something
        // else to create the list (like JSON file)
        List<String> newArray = Arrays.asList(new String[]{"someValue", "otherValue", "etc"});

    }
}
