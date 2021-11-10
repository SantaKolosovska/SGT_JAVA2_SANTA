package lesson8_practicaltask.task6;

public class Circle extends Shape {

    @Override
    public void print() {
        System.out.println("This is a circular shape");
    }

    public void printParent() {
        super.print();
    }
}
