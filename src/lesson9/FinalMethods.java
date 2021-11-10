package lesson9;

public class FinalMethods {

    private int someVar;

    // initialized during declaration
    final int CONSTANT_PI = 3;

    // non-initialized during declaration
    // has to be initialized in ALL the constructors
    final int CONSTANT_NOINIT;

    public FinalMethods() {
        CONSTANT_NOINIT = 5;
    }

    public FinalMethods(int someVar, int CONSTANT_NOINIT) {
        this.someVar = someVar;
        this.CONSTANT_NOINIT = CONSTANT_NOINIT;
    }

    public final void printHello() {
        System.out.println("Hello");
    }

}

class ExtendedFinalMethods extends FinalMethods {

    // final methods can't be overriden
//    @Override
//    public void printHello() {
//        System.out.println("Bye");
//    }

}
