class MultipleDemo {

    // Method with parameters and return value
    int add(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public static void main(String[] args) {

        MultipleDemo obj = new MultipleDemo();

        int result = obj.add(10, 20);

        System.out.println("multi = " + result);
    }
}
