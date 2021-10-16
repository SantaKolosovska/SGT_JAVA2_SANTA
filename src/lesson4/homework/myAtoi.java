package lesson4.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class myAtoi {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("----------", "      -9999999999999321111111njsknfb", "++1111111111112mm",
                " 12kls 33 mmm", "lala0999", " - 9lfd", "lapas", " 999999911111111222222222", "-12121212121221211",
                "2147483647", "214748364899", "1212", "     ");

        for (String string : strings) {
            System.out.println("String: " + string);
            System.out.println("To integer: " + myAtoi(string));
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?   1. Convert to integer 2. Exit");
        String choice = scanner.nextLine();

        while (choice.equalsIgnoreCase("1")) {
            System.out.println("Input a string: ");
            String stringToConvert = scanner.nextLine();
            System.out.println(stringToConvert + ": " + myAtoi(stringToConvert));
        }

    }

    static long myAtoi(String s) {
        String string = s.trim();
        String numberString = "";

        long stringToLong = 0;

        if (string.isEmpty()) {
            stringToLong = 0;
        }
        else if (string.charAt(0) == '-' || string.charAt(0) == '+' || Character.isDigit(string.charAt(0)) == true) {
            numberString += string.charAt(0);
        }

        for (int i = 1; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i)) == true) {
                numberString += string.charAt(i);
            } else {
                break;
            }
        }

        if (numberString.length() <= 14 && numberString != "" && !numberString.equalsIgnoreCase("-") &&
                !numberString.equalsIgnoreCase("+")) {
            stringToLong = clamp(Long.parseLong(numberString));
        } else if (numberString.length() > 14 && numberString.charAt(0) == '-') {
            stringToLong = (int) (Math.pow(-2, 31));
        } else if (numberString.length() > 14) {
            stringToLong = (int) (Math.pow(2, 31)) - 1;
        }

        return stringToLong;
    }

    static long clamp(long number) {
        long min = (long) (Math.pow(-2, 31));
        long max = (long) (Math.pow(2, 31) - 1);
        return Math.max(min, (Math.min(number, max)));
    }

}
