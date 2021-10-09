package lesson4;

public class Scopes {

    static final int SOME_CONSTANT = 314;
    static int globalResult = 0;

    public static void main(String[] args) {

        int someNumber = 99;
        int someOtherNumber = SOME_CONSTANT;

        int someResult = multiplyByFive(someNumber);
        System.out.println(someResult);
    }

    static int scopeVisible(int someNumber) {
        boolean visibleInsideMethod = true;

        return someNumber*2;
    }

    static int multiplyByFive(int number) {
        int five = 5;

        return number*five;
    }
}
