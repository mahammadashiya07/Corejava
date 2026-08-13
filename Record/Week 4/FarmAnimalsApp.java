class FarmAnimal {
    String name;
    String type;
    String sound;
    int age;

    // Constructor
    FarmAnimal(String name, String type, String sound, int age) {
        this.name = name;
        this.type = type;
        this.sound = sound;
        this.age = age;
    }

    // Method to display animal details
    void displayDetails() {
        System.out.println("Animal Name : " + name);
        System.out.println("Animal Type : " + type);
        System.out.println("Age         : " + age);
        System.out.println("Sound       : " + sound);
        System.out.println("-------------------------");
    }

    // Method to make animal sound
    void makeSound() {
        System.out.println(name + " says " + sound);
    }
}

public class FarmAnimalsApp {
    public static void main(String[] args) {

        // Creating objects
        FarmAnimal cow = new FarmAnimal("Cow", "Domestic Animal", "Moo", 5);
        FarmAnimal goat = new FarmAnimal("Goat", "Domestic Animal", "Meh", 3);
        FarmAnimal hen = new FarmAnimal("Hen", "Bird", "Cluck", 2);
        FarmAnimal horse = new FarmAnimal("Horse", "Domestic Animal", "Neigh", 6);

        // Displaying details
        cow.displayDetails();
        goat.displayDetails();
        hen.displayDetails();
        horse.displayDetails();

        // Making sounds
        cow.makeSound();
        goat.makeSound();
        hen.makeSound();
        horse.makeSound();
    }
}