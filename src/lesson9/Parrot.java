package lesson9;

public class Parrot implements FlyableInterface, WalkableInterface {


    @Override
    public void fly(int height) {
        System.out.println("I'm flying at height " + height);
    }

    @Override
    public void walk(int speed) {

    }
}
