package lesson4;

public class References {

    public static void main(String[] args) {
        // THIS WILL POINT TO NULL
        String someString;

        // these 2 lines ar identical;
        someString = "Something";
        someString = new String("Something");

        Point point1 = new Point(7, 11);
        System.out.println("Coordinates: " + point1.getX() + ", " + point1.getY());

        //Point point3 = point1.clone(); - should work but doesn't
        // this way we don't change point1
        Point point3 = new Point(0,0);
        point3.setX(point1.getX());
        point3.setY(point1.getY());


        Point point2 = point1;
        System.out.println("Coordinates: " + point2.getX() + ", " + point2.getY());

        point2.setX(100);
        System.out.println("Coordinates: " + point1.getX() + ", " + point1.getY());

        System.out.println("Coordinates: " + point1.getX() + ", " + point1.getY()); // point1 was overwritten
        // because they point at the same place in memory

        System.out.println("Coordinates: " + point3.getX() + ", " + point3.getY()); // point 1 was not overwritten yet


    }
}

class Point {
    // Coordinates
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
