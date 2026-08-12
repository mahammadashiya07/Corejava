class ReturnExample {

    // Method with return type
    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        ReturnExample obj = new ReturnExample();

        int result = obj.add(10, 20);

        System.out.println("Sum = " + result);
    }
}