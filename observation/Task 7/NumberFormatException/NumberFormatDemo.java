// Defines the class name NumberFormatDemo
class NumberFormatDemo {
    
    // The main method where the program starts its execution
    public static void main(String[] args) {
        
        // Start of the try block to test a block of code for errors
        try {
            
            // Initializes a String variable named 'value' with a non-numeric text ("ABC")
            String value = "ABC";
            
            // Attempts to convert the non-numeric string into an integer using Integer.parseInt()
            // This line intentionally triggers a NumberFormatException
            int number = Integer.parseInt(value);
            
            // This line is skipped because the exception occurs immediately above it
            System.out.println(number);
            
        // Catch block specifically handles the NumberFormatException when it is thrown
        } catch (NumberFormatException e) {
            
            // Prints a user-friendly error message to the console indicating the invalid format
            System.out.println("Exception: Invalid number format");
        }
    }
}
