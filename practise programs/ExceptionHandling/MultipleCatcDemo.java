public class MultipleCatcDemo { 
    public static void main(String[] args) {
        try {
            String value = "abc";
            int number = Integer.parseInt(value);
            int result = 30/0;
            System.out.println("Result = " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format:");
        }
        catch (ArithmeticException e) {
            System.out.println("cannot divisible by a zero:");
        }
        System.out.println("Program has completed:");
    }
}