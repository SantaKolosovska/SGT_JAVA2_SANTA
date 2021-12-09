package lesson22;

import java.util.Date;
import java.util.HashMap;

public class Lesson22Main {

    public static void main(String[] args) {

        Lesson22GenericClass<String> firstDate = new Lesson22GenericClass<String>();
        firstDate.setBirthDate("2021-11-15");
        System.out.println(firstDate.getBirthDate());
        firstDate.formatBirthDate("Some string");

        Lesson22GenericClass<Date> secondDate = new Lesson22GenericClass<Date>();
        secondDate.setBirthDate(new Date());
        System.out.println(secondDate.getBirthDate());
        secondDate.formatBirthDate(new Date());



    }
}
