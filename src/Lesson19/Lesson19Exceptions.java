package Lesson19;

public class Lesson19Exceptions {

    public double multiplyByTwo(double someNumber) {
        this.divideByNumber2(7, 0);
        return someNumber * 2;
    }


//    public double divideByNumber1(int dividable1, int divider1) {
//        try {
//            return dividable1 / divider1;
//        } catch (ArithmeticException e) {
//            System.out.println("There was an arithmetic exception: " + e);
//            return 0;
//        }

    public double divideByNumber2(int dividable2, int divider2) throws ArithmeticException {
        try {
            return dividable2 / divider2;
        } catch (ArithmeticException e) {
            System.out.println("There was an arithmetic exception: " + e);
            throw e;
        }
    }

    int method1() {
        try {
            System.out.println("Something");
            return 0;
        } catch (Exception e) {
            // can add extra
            throw e;
        }
    }
//equals to
    int method2() throws Exception {
        System.out.println("Something");
        return 0;
    }



}


