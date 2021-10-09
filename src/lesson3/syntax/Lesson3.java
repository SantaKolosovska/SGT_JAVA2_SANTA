package lesson3.syntax;

import lesson1.helloWorldLibrary.WorldLibrary;

public class Lesson3 {

    // te viss tiek rakstīts kopā ērtības labad

    public static void main(String[] args) {
        RocketShip ship = new RocketShip();
        ship.fly(10);

        Bird bird = new Bird();
        bird.fly(1);

        Penguin penguin = new Penguin();
        penguin.fly(10);

        if (penguin instanceof Penguin) {
            System.out.println("penguin is a penguin");
        }

        if (penguin instanceof Bird) {
            System.out.println("penguin is a bird");
        }

//        if (penguin instanceof RocketShip) {
//            System.out.println("penguin cannot be a rocketship");
//        }

        int result = 2;
        result += 5;
        System.out.println("result = " + result);

//    public static String boop() {
//        return WorldLibrary.getName();
//    }

        // print name from Statics class
        Statics name = new Statics();
        System.out.println(name.getName()); // object (instance) needed to be created
        System.out.println("Surname: " + Statics.getSurname());     // will get the surname from wtihout an instance
                                                                    // because it's static
    }
}

enum RocketTypes {
    BEZOS,
    MUSK,
    BRANSON
}

interface CanFlyInterface {
    boolean fly(int speed);
}

class RocketShip implements CanFlyInterface {
    @Override
    public boolean fly(int speed) {
        System.out.println("Whoosh, I'm flying!");
        return false;
    }
}

class Bird implements CanFlyInterface {

    @Override
    public boolean fly(int speed) {
        System.out.println("Chirp, chirp!");
        return false;
    }
}

class Penguin extends Bird {
    public boolean walk(int speed) {
        System.out.println("Quack");
        return true;
    }
}