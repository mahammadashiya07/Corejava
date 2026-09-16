// Defines the class name SecurityExceptionDemo
class SecurityExceptionDemo {
    
    // The main method where the program starts its execution
    public static void main(String[] args) {
        
        // Start of the try block to test a block of code for errors
        try {
            
            // Explicitly throws a new SecurityException with a specific detail message
            // This line intentionally triggers the exception to simulate a security violation
            throw new SecurityException("Access denied");
            
        // Catch block specifically handles the SecurityException when it is thrown
        } catch (SecurityException e) {
            
            // Prints a user-friendly error message to the console indicating a security restriction
            System.out.println("Exception: Security access denied");
        }
    }
}
