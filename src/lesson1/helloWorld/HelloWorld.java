package lesson1.helloWorld;

import lesson1.helloWorldLibrary.WorldLibrary;

public class HelloWorld {

    public static void main(String[] args) {

        WorldLibrary theWorld = new WorldLibrary();
        theWorld.setPlanetName("Earth");

        System.out.println("Welcome to your future, " + WorldLibrary.getName());
        System.out.println("I live on a planet named " + theWorld.getPlanetName());

        theWorld.setPlanetName("Mars");     // if I won't re-use the Earth again
        System.out.println("But now I've decided to go to " + theWorld.getPlanetName());

    }
}
