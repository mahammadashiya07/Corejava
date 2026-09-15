// Parent class
class Animal {

    // Method in the parent class
    void sound() {
        System.out.println("Animal sound");
    }
}

// Child class that inherits from Animal
class Dog extends Animal {

    // Overriding the sound() method of Animal
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Creating an object of the Dog class
        Dog d = new Dog();

        // Calling the overridden sound() method
        d.sound();
    }
}

