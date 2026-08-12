class ParameterExample {

    // Method with parameters
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        ParameterExample obj = new ParameterExample();

        // Passing arguments
        obj.add(10, 20);
    }
}