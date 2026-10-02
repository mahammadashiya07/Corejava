// Class to demonstrate ArrayIndexOutOfBoundsException
class ArrayIndexDemo {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // try block contains code that may cause an exception
        try {

            // Create an integer array with 3 elements
            int[] numbers = {10, 20, 30};

            // Try to access index 5
            // Valid indexes are only 0, 1 and 2
            System.out.println(numbers[5]);

        }

        // Catch block handles ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {

            // Display an error message
            System.out.println("Exception: Array index is out of bounds");
        }
    }
}