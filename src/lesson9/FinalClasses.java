package lesson9;

public final class FinalClasses {

    private int someInt;

    public int multiplyBySomeInt(int anotherInt) {

        return someInt * anotherInt;
    }

}

// class ExtendedFinalClasses extends FinalClasses - won't extend, final classes can't be extended
