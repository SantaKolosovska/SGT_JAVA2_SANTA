package lesson9;

public class NestedClasses {

    public static class InnerClass {

        public String printInnerClass() {
            System.out.println("This is inner class");
            return "Some String returned";
        }
    }

    private String printSmthFromInnerClass() {
        InnerClass inner = new InnerClass();
        return inner.printInnerClass();
    }
}

class App {

    public static void main(String[] args) {
        NestedClasses.InnerClass innerClass = new NestedClasses.InnerClass();
    }

}
