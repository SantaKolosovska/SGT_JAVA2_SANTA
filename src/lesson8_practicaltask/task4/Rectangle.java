package lesson8_practicaltask.task4;

public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle() {
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        //System.out.println("Rectangle with length of " + length + " and breadth of " + breadth + " is created");
    }

    public int calculatePerimeter() {
        return (breadth + length) * 2;
    }

    public int calculateArea() {
        return breadth * length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
