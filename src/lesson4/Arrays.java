package lesson4;

public class Arrays {

    public static void main(String[] args) {

        // define an array
        int[] arrayOfIntegers;

        // initialize an array
        arrayOfIntegers = new int[5];

        // same in a single line
        int[] anotherArray = new int[10];

        // print the alphabet
        System.out.println(initAlphabet());

        // define the array and initialize using shorthand notation
        String[] cities = {
                "Riga",
                "London",
                "Paris"
        };

        // this is equal to
        String[] cities2 = new String[3];
        cities2[0] = "Riga";
        cities2[1] = "London";
        cities2[2] = "Helsinki";


        // two dimensional arrays
        int[][] points = new int[10][10];
        points[0][0] = 99;
        points[0][1] = 5;


        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.println(points[i][j] + "");  // prints something different than in Artjoms code
            }

            // ARRAYCOPY - copies elements from one array to other - ARTJOMS CODE (SGT_JAVA2) - nepabeidzu

//            String[] cities = new String[];
//
//            String[] newCities = new String[3];
//            newCities[0] = "Tokyo";
//            newCities[0] = "Tokyo";
//            newCities[0] = "Tokyo";

        }
    }

    static char[] initAlphabet() {
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char)('A' + i);
        }
        return alphabet;
    }
}
