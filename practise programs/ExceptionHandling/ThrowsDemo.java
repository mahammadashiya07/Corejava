public class ThrowsDemo {
        static void divide() throws ArithmeticException {
        int result = 30/0;
        System.out.println("Result = " + result);
    }
    public static void main(String[] args) {
         try {
            divide();
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program completed");
    }
}

