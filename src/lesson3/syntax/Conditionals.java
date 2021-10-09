package lesson3.syntax;

public class Conditionals {
    public static void main(String[] args) {

        String myName = "Santa";
        if( myName == "Santa") {
            System.out.println("Yes, indeed");
        } else {
            System.out.println("Nope, it's not");
        }

        // shorthand if statement
        String whatIsMyName = myName=="Santa" ? "It is Santa" : "It's not Santa";
        System.out.println(whatIsMyName);

        whatIsMyName = myName=="Lote" ? "It is Santa" : "It's not Santa";
        System.out.println(whatIsMyName);

        /*
        write an app that decides whether number is odd or even
         */

        System.out.println(oddOrEven1(7));
        System.out.println(oddOrEven2(7));
        String oddOrEven = oddOrEven1(8);
        System.out.println(oddOrEven);


    }

    public static String oddOrEven1(int number) {
        if (number%2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static String oddOrEven2(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }

    public static String oddOrEven3(int number) {
        String result = number % 2 == 0 ? "even" : "odd";
        System.out.println(result);
        return result;
    }
}
