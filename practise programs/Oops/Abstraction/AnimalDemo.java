// Abstract parent class
abstract class AnimalDemo {

    // Abstract method
    // It has no body and must be implemented by the child class
    abstract void sound();
}

// Child class that inherits from Animal
class Dog extends AnimalDemo {

    // Implementing the abstract sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Creating an object of Dog class
        Dog d = new Dog();

        // Calling the sound() method
        d.sound();
    }
}

