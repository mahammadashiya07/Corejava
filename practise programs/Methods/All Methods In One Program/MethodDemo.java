class MethodDemo {

    // Method with parameters and return value
    int add(int a, int b) {
        return a + b;
    }

    // Method with parameters and return value
    int multiply(int a, int b) {
        return a * b;
    }

    // Method without parameters and with return value
    int square() {
        int n = 5;
        return n * n;
    }

    // Method with parameter and without return value
    void checkEvenOdd(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }

    public static void main(String[] args) {

        MethodDemo obj = new MethodDemo();

        System.out.println("Addition = " + obj.add(10, 20));
        System.out.println("Multiplication = " + obj.multiply(5, 4));
        System.out.println("Square = " + obj.square());

        obj.checkEvenOdd(15);
    }
}
