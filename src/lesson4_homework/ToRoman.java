package lesson4_homework;

import java.util.Scanner;

public class ToRoman {

    public static void main(String[] args) {

        System.out.println("1982:" + intToRoman(1982));
        System.out.println("566: " + intToRoman(566));
        System.out.println("2:" + intToRoman(2));
        System.out.println("13: " + intToRoman(13));
        System.out.println("40001: " + intToRoman(40001));

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?   1. Convert to Roman 2. Exit");
        int choice = scanner.nextInt();

        while (choice == 1) {
            System.out.println("Input a number: ");
            int numberToConvert = scanner.nextInt();
            System.out.println(numberToConvert + ": " + intToRoman(numberToConvert));
        }
    }

    static String intToRoman(int number) {

        if (number > 3999 || number <= 0) {
            return "Only numbers from 1 to 3999 are accepted";
        }

        int numberOfThousands = number / 1000;
        int numberOfHundreds = (number - numberOfThousands * 1000) / 100;
        int numberOfTens = (number - numberOfThousands * 1000 - numberOfHundreds * 100) / 10;
        int numberOfOnes = (number - numberOfThousands * 1000 - numberOfHundreds * 100 - numberOfTens * 10);

        String thousands = numbToSubstringOfRomans(numberOfThousands, "M", "", "");
        String hundreds = numbToSubstringOfRomans(numberOfHundreds, "C", "D", "M");
        String tens = numbToSubstringOfRomans(numberOfTens, "X", "L", "C");
        String ones = numbToSubstringOfRomans(numberOfOnes, "I", "V", "X");

        return thousands + hundreds + tens + ones;
    }

    static String numbToSubstringOfRomans(int numberOf, String one, String five, String ten) {

        String substringOfRomans = "";

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
