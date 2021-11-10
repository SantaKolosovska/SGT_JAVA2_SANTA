package lesson8_practicaltask.task6;

public class App {
    public static void main(String[] args) {

        Square square = new Square();
        Shape shape = (Shape) square;
        shape.print();



        Circle circle = new Circle();
        circle.printParent();
        circle.print();

    }
}
