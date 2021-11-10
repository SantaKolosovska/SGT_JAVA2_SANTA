package lesson9;

public class FinalObjects {

    public static void main(String[] args) {

        final Rocket rocket1 = new Rocket(120, 200, "Petrol");
        System.out.println(rocket1);

        // you can't reinitialize final objects
        // rocket1 = new Rocket(99,99,"Diamonds");

        rocket1.setFuelType("Hydrogen");
        System.out.println(rocket1);
    }

}


class Rocket {
    private int weight;
    private int height;
    private String fuelType;

    public Rocket() {
    }

    public Rocket(int weight, int height, String fuelType) {
        this.weight = weight;
        this.height = height;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "weight=" + weight +
                ", height=" + height +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}