// Parent class
class Vehicle {

    // Method of the parent class
    void start() {
        System.out.println("Vehicle starts");
    }
}

// Child class inherits from Vehicle
class Car extends Vehicle {

    // Method of the child class
    void drive() {
        System.out.println("Car is driving");
    }
}

    //main class
     public class Main {
    // Main method - program execution starts here
    public static void main(String[] args) {

        // Creating an object of Car class
        Car c = new Car();

        // Calling the inherited method from Vehicle
        c.start();

        // Calling the Car class's own method
        c.drive();
    }
}

