package lesson20;

import java.util.HashSet;
import java.util.Set;

public class Lesson20HashSet {

    public static void main(String[] args) {

        Set<Integer> streetNumbers = new HashSet<Integer>();

        streetNumbers.add(1);
        streetNumbers.add(5);
        streetNumbers.add(50);
        streetNumbers.add(50);  // won't be added, because no duplicates allowed

        System.out.println(streetNumbers);

    }

}
