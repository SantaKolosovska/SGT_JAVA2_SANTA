package Lesson19;

import Lesson19.exceptions.DBExcceptions;
import Lesson19.exceptions.DBPasswordAllCapitalsIncorrectException;
import Lesson19.exceptions.DBPasswordIncorrectException;

public class Lesson19 {

    public static void main(String[] args) {
        Lesson19Exceptions exceptions = new Lesson19Exceptions();

        System.out.println(exceptions.divideByNumber2(100, 50)); // = 2

        try {
            System.out.println(exceptions.divideByNumber2(5, 0));    // = Exception in thread "main"
            // java.lang.ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Handle code differently");
        }

        try {
            exceptions.multiplyByTwo(5);
        } catch (ArithmeticException e) {
            System.out.println("Even wrapped exceptions will be handled");
        } finally {
            System.out.println("This block will be always called");
        }

        System.out.println("If there is some other code after try/catch/finally - it will be executed");

        try {
            System.out.println("Connecting to the database");
            throw new DBPasswordAllCapitalsIncorrectException();
        } catch (DBExcceptions e) {
            // handle this exception
            System.out.println("Our exception has been properly handled");

            if (e instanceof DBPasswordAllCapitalsIncorrectException) {
                System.out.println("Exception is of type DBPasswordAllCapitalsIncorrectException");
            } else if (e instanceof DBPasswordIncorrectException) {
                System.out.println("Password is incorrect");
            }
        }


        try {
            throw new DBExcceptions("Some custom message");
        } catch (DBExcceptions e) {
            System.out.println("There was a DB exception: " + e.getMessage());
        }


        try {
            exceptions.multiplyByTwo(3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Something after printing stack trace");


        boolean userAuthenticated = true;
        assert userAuthenticated;
        System.out.println("User is authenticated");
        userAuthenticated = false;

        try {
            assert userAuthenticated;   // need to switch on in terminal
        } catch (AssertionError e) {
            System.out.println("User is not authenticated");
        }


        // last
    }
}