package lesson8_practicaltask.task4;

public class App {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Breadth: " + rectangle.getBreadth());

        Square square = new Square(5);
        System.out.println("Perimeter of square: " + square.calculatePerimeter());
        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Side: " + square.getBreadth());


        Square[] squareArray = new Square[10];

        int[] arrayOfSides = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arrayOfSides.length; i++) {
            squareArray[i] = new Square(arrayOfSides[i]);
        }

        for (Square squareFromArray : squareArray) {
            //System.out.println("Side length of square: " + squareFromArray.getSide());
            System.out.println("Area of square: " + squareFromArray.calculateArea());
            System.out.println();
        }


    }
}

