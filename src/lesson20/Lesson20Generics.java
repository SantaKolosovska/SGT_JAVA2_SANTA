package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Lesson20Generics {

    public static void main(String[] args) {

        // BAD PRACTICE - this is used only for lists of objects
        List myList = new ArrayList<>();   // no data type - generic list
        myList.add("Some text");
        myList.add(9);


        // String someText = myList.get(0);    // data type is not specified, it's an object
        String someText1 = (String) myList.get(0);  // cast to retrieve

        // Equals to
        List<String> myList2 = new ArrayList<String>();
        // String someText2 =myList2.get(0);
    }
}
