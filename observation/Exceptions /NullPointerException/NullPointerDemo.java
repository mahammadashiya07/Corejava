// Defines the class name NullPointerDemo
class NullPointerDemo {
    
    // The main method where the program starts its execution
    public static void main(String[] args) {
        
        // Start of the try block to test a block of code for errors
        try {
            
            // Initializes a String variable named 'name' and sets its value to null (empty/no object)
            String name = null;
            
            // Attempts to call the length() method on the null reference
            // This line intentionally triggers a NullPointerException
            System.out.println(name.length());
            
        // Catch block specifically handles the NullPointerException when it is thrown
        } catch (NullPointerException e) {
            
            // Prints a user-friendly error message to the console indicating the object is null
            System.out.println("Exception: Object contains null value");
        }
    }
}
