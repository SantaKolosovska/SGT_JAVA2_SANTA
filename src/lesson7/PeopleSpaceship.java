package lesson7;

import lv.santa.rocketscience.Engine;

import java.util.ArrayList;

public class PeopleSpaceship extends Spaceship {

    private int numberOfPeople;
    private ArrayList<String> namesOfPeople = new ArrayList<>();

    @Override
    public String toString() {
        return "PeopleSpaceship{" +
                "numberOfPeople=" + numberOfPeople +
                ", namesOfPeople=" + namesOfPeople +
                ", engine=" + engine +
                ", name='" + name + '\'' +
                ", cargoSpace=" + cargoSpace +
                '}';
    }

    @Override
    public void addCargo(){
        super.addCargo();   // using parent class method
        // super.super. - the parent's parent
        System.out.println("We have overriden method inside Spaceship");    // extra line added
    }

    public PeopleSpaceship() {
    }

    public PeopleSpaceship(Engine engine, String name, int cargoSpace, int numberOfPeople, ArrayList<String> namesOfPeople) {
        super(engine, name, cargoSpace);
        this.numberOfPeople = numberOfPeople;
        this.namesOfPeople = namesOfPeople;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public ArrayList<String> getNamesOfPeople() {
        return namesOfPeople;
    }

    public void setNamesOfPeople(ArrayList<String> namesOfPeople) {
        this.namesOfPeople = namesOfPeople;
    }
}
