package lesson4;

public class Initialization {

    public static void main(String[] args) {

        // BAD EXAMPLE, DON'T DO IT LIKE THIS!!!!
        String boopOrWoop;  // don't keep uninitialized, it's pointing to null

        boopOrWoop = boop();

        //GOOD EXAMPLE - DO IT LIKE THIS

        String boopOrWoop2 = woop();    // assign to value in the moment of creation



    }

    static String boop() {
        return "boop";
    }

    static String woop() {
        return "woop";
    }
}
