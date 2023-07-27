package activities;

public class Activity1 {

    public static void main(String[] args) {
        Car thar = new Car();
        thar.make = 2022;
        thar.color = "Jet Black";
        thar.transmission = "Manual";

        //calling class Car methods
        thar.displayCharacterstics();
        thar.accelerate();
        thar.brake();
    }

}
