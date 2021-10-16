package lesson7;

import lv.santa.rocketscience.Engine;

import java.util.ArrayList;

public class Lesson7App {

    public static void main(String[] args) {

        Spaceship spaceship = new Spaceship(new Engine(), "Escape plan", 100);

        ArrayList<String> people = new ArrayList<>();
        people.add("Bezos");
        people.add("Musk");
        people.add("Brenson");
        PeopleSpaceship peopleSpaceship = new PeopleSpaceship(new Engine(),"Elon", 100, 3,
                people);


        // send bezos, musk and brenson to space
        peopleSpaceship.getNamesOfPeople().add("Musk");
        peopleSpaceship.getNamesOfPeople().add("Bezos");
        peopleSpaceship.getNamesOfPeople().add("Brenson");

        System.out.println(peopleSpaceship);

        // add some cargo
        peopleSpaceship.addCargo();
        peopleSpaceship.addCargo(10);

        // example of polymoprhism - method that was written for parent class, also works on all child classes
        printInfoAboutSpaceship(spaceship);
        printInfoAboutSpaceship(peopleSpaceship);

        // prints just "Cargo added"
        Spaceship spaceship2 = new Spaceship();
        spaceship2.addCargo();

        // virtual method
        Spaceship spaceship3 = new PeopleSpaceship();
        spaceship3.addCargo();

        // upcasting
        Spaceship castedSpaceship = (Spaceship)peopleSpaceship;

        // downcasting
        // is not possible to use. Use polymorphic methods instead (instanceOf???)
        PeopleSpaceship castedPeopleSpaceship = (PeopleSpaceship)spaceship;
        castedPeopleSpaceship.getNamesOfPeople();
    }

    public static void printInfoAboutSpaceship(Spaceship spaceship) {
        System.out.println("I have a spaceship: " + spaceship);
    }
}
