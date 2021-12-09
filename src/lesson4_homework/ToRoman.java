package lesson4_homework;

import java.util.Scanner;

public class ToRoman {

    public static void main(String[] args) {

        // numbers to test
        System.out.println("1982:" + intToRoman(1982));
        System.out.println("566: " + intToRoman(566));
        System.out.println("2:" + intToRoman(2));
        System.out.println("13: " + intToRoman(13));
        System.out.println("40001: " + intToRoman(40001));

        // scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?   1. Convert to Roman 2. Exit");
        int choice = scanner.nextInt();

        while (choice == 1) {
            System.out.println("Input a number: ");
            int numberToConvert = scanner.nextInt();
            System.out.println(numberToConvert + ": " + intToRoman(numberToConvert));
        }
    }

    /**
     * This method calculates number of ones, tens, hundreds and thousands
     * and then uses numbToSubstringOfRomans method to convert them to Roman numerals.
     * Due to limitations of Roman numerals method can be used on numbers 0-3999
     * @param number - any number from 0 to 3999
     * @return - returns the given number converted to Roman numerals
     */
    static String intToRoman(int number) {

        if (number > 3999 || number <= 0) {
            return "Only numbers from 1 to 3999 are accepted";
        }

        // calculate the number of ones, tens, hundreds, thousands
        int numberOfThousands = number / 1000;
        int numberOfHundreds = (number - numberOfThousands * 1000) / 100;
        int numberOfTens = (number - numberOfThousands * 1000 - numberOfHundreds * 100) / 10;
        int numberOfOnes = (number - numberOfThousands * 1000 - numberOfHundreds * 100 - numberOfTens * 10);

        // assigns a letter to count of ones, tens, hundreds, thousands


        String thousands = numbToSubstringOfRomans(numberOfThousands, "M", "", "");
        String hundreds = numbToSubstringOfRomans(numberOfHundreds, "C", "D", "M");
        String tens = numbToSubstringOfRomans(numberOfTens, "X", "L", "C");
        String ones = numbToSubstringOfRomans(numberOfOnes, "I", "V", "X");

        // substrings of Romans are combined to create a whole roman numeral
        return thousands + hundreds + tens + ones;
    }

    /**
     *
     * @param numberOf -  uses the number of ones, tens, hundreds, thousands that are in a number and assigns letter(s)
     *                 to them
     * @param one - I for 1, X for 10, C for 100, M for 1000
     * @param five - V for 5, L for 50, D for 500
     * @param ten - X for 10, C for 100, M for 1000
     * @return - returns a substring that will be used to create a whole Roman numeral
     */
    static String numbToSubstringOfRomans(int numberOf, String one, String five, String ten) {

        String substringOfRomans = "";

        // Roman numerals follow a certain formula, which is applied to each digit regardless of it's position in
        // the number. This method utilizes this knowledge.
        if (numberOf >= 1 && numberOf <= 3)
            for (int i = 0; i < numberOf; i++) {
                substringOfRomans += one;
            }
        else if (numberOf == 4) {
            substringOfRomans += one + five;
        } else if (numberOf == 5) {
            substringOfRomans += five;
        } else if (numberOf > 5 && numberOf < 9) {
            substringOfRomans = five;
            for (int i = 0; i < numberOf - 5; i++) {
                substringOfRomans += one;
            }
        } else if (numberOf == 9) {
            substringOfRomans += one + ten;
        }

        return substringOfRomans;
    }
}
