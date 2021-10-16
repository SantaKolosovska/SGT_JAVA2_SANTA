package lesson7;

import lv.santa.rocketscience.Engine;

public class Spaceship {

    Engine engine = new Engine();
    String name = "";
    int cargoSpace = 0;

    public void addCargo(){
        System.out.println("Cargo added");
    }

    public int addCargo (int cargo) {
        this.cargoSpace += cargo;
        return this.cargoSpace;
    }

    public Spaceship() {
    }

    public Spaceship(Engine engine, String name, int cargoSpace) {
        this.engine = engine;
        this.name = name;
        this.cargoSpace = cargoSpace;
    }

    @Override
    public String toString() {
        return "Spaceship{" +
                "engine=" + engine +
                ", name='" + name + '\'' +
                ", cargoSpace=" + cargoSpace +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCargoSpace() {
        return cargoSpace;
    }

    public void setCargoSpace(int cargoSpace) {
        this.cargoSpace = cargoSpace;
    }
}
