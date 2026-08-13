class Animal {
    String name;
    String place;
    String food;
    String sound;

    // Constructor
    Animal(String n, String p, String f, String s) {
        name = n;
        place = p;
        food = f;
        sound = s;
    }

    // Method
    void display() {
        System.out.println("Animal: " + name);
        System.out.println("Stays in: " + place);
        System.out.println("Eats: " + food);
        System.out.println("Sound: " + sound);
    }

    // Method with parameter
    void eat(String foodName) {
        System.out.println(name + " eats " + foodName);
    }

    // Method overloading
    void sound(String s) {
        System.out.println(name + " says " + s);
    }
}

public class FarmAnimals {
    public static void main(String[] args) {

        // Objects
        Animal cow = new Animal("Cow", "Cowshed", "Grass", "Moo");
        Animal pig = new Animal("Pig", "Pigsty", "Corn", "Oink");
        Animal horse = new Animal("Horse", "Stable", "Grass", "Neigh");

        // Display details
        cow.display();
        System.out.println();

        pig.display();
        System.out.println();

        horse.display();
        System.out.println();

        // Parameter passing
        cow.eat("Grass");
        pig.eat("Corn");
        horse.eat("Grass");

        // Method overloading
        cow.sound("Moo Moo");
    }
}