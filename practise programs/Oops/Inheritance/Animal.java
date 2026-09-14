 // Parent class
class Animal {

    // Method to display the sound made by an animal
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class that inherits from Animal
class Dog extends Animal {

    // Method to display the sound made by a dog
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Creating an object of Dog class
        Dog d = new Dog();

        // Calling the inherited sound() method from Animal class
        d.sound();

        // Calling the bark() method of Dog class
        d.bark();
    }
}
