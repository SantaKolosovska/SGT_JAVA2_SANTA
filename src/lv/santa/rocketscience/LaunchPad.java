package lv.santa.rocketscience;

import java.util.Scanner;

public class LaunchPad {

    public static void main(String[] args) {

        Rocket rocket1 = new Rocket();
        System.out.println("There are " + Rocket.countRockets() + " rockets");

        System.out.println("Name of the rocket: " + rocket1.getName());
        System.out.println("Weight of the rocket: " + rocket1.getWeight());

        Rocket rocket2 = rocket1;   // this is an example of what not to do, because they point to the same place in memory

        rocket1.setName("Starship");
        System.out.println("Name of the rocket: " + rocket2.getName());

        System.out.println(rocket1.id);

        renameRocket(rocket1, "MoonRover");
        System.out.println("Name of the rocket: " + rocket1.getName());

        System.out.println("There are so many rockets: " + Rocket.countRockets());

        changeWeight(rocket1.getWeight(), 1000);

        System.out.println("The weight of the rocket stayed the same outside the method: " + rocket1.getWeight());
        rocket1.setWeight(10);

        Rocket rocket3 = new Rocket("Enterprise", "blue", 109, 209, new Engine());
        rocket3.printRocketData();

        rocket3 = null;


        System.gc();    // calling the garbage collector

        Scanner scanner = new Scanner(System.in);   // isn't really needed
        System.out.println("Waiting for rocket to be destroyed");
        scanner.nextInt(); // just to make those 10-15 seconds pass for the garbage collector to do it's work


        }




    /**
     * Renames the rocket
     * Changes the original object
     *
     * @param rocket
     * @param newName
     */
    private static void renameRocket(Rocket rocket, String newName) {
        rocket.setName(newName);
    }

    /**
     * changes weight only locally
     * DON'T DO LIKE THIS
     * @param weight
     * @param newWeight
     */
    private static void changeWeight(int weight, int newWeight) {
        weight = newWeight;
        System.out.println("Weight was changed locally to " + weight);
    }

}
