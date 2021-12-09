package lesson22;

import java.util.ArrayList;
import java.util.List;

public class Lesson22RuntimeCompilationErrors {

    public static void main(String[] args) {
        //------------COMPILATION ERROR---------------
        float var1 = 1.45f;
        String var1String = "Abcdef";

        // this will cause compilation error
        // float var2 = var1 + var1String;

        //---------------RUNTIME ERROR------------------

        List myList = new ArrayList();
        myList.add("Some String");
        myList.add(new Float(1.45f));

        // if a compiler can catch the error (underlines code with red), it's compilation error,
        // if it occurs when running - it's a runtime error (this case - nothing's red, but there will be an error
        // when you run it)
        float var3 = (float) (myList.get(0));

        //-----------------------------------
        List<String> myList2 = new ArrayList<>();
        myList2.add("Some other string");
        // myList2.add(5);     // compilation error
        // int someInt = int myList2.get(0);  // compilation error

        // last
    }
}
