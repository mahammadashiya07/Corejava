class SquareDemo {

    int square() {
        int n = 5;
        return n * n;
    }

    public static void main(String[] args) {
        SquareDemo obj = new SquareDemo();

        int result = obj.square();

        System.out.println("Square = " + result);
    }
}
