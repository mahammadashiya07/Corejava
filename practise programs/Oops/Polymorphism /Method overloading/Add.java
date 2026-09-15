// Program to demonstrate Method Overloading

class Add {

    // Method with two parameters
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    // Method with three parameters
    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

// Main class - execution starts here
public class Main {

    public static void main(String[] args) {

        // Creating object of Add class
        Add obj = new Add();

        // Calling sum() with two arguments
        obj.sum(10, 20);

        // Calling sum() with three arguments
        obj.sum(10, 20, 30);
    }
}
