// Abstract class
abstract class A1 {

    // Abstract method
    abstract void work();

    // Normal method
    void company() {
        System.out.println("Company: ABC Technologies");
    }
}

// Child class inherits abstract class
class A2 extends A1 {

    // Providing implementation for abstract method
    void work() {
        System.out.println("A2 works as a Developer");
    }
}

// Main class
class A1Demo {

    public static void main(String[] args) {

        // Creating object of child class
        A2 d = new A2();

        // Calling methods
        d.company();
        d.work();
    }
}


