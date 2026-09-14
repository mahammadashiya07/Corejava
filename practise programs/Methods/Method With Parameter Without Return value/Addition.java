class AdditionDemo {

    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        AdditionDemo obj = new AdditionDemo();
        obj.add(10, 20);
    }
}
