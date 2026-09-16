// Defines the class name StringIndexDemo
class StringIndexDemo {
    
    // The main method where the program starts its execution
    public static void main(String[] args) {
        
        // Start of the try block to test a block of code for errors
        try {
            
            // Initializes a String variable named 'text' with a 4-character value ("Java")
            // Valid indices for this string are 0, 1, 2, and 3
            String text = "Java";
            
            // Attempts to fetch the character at index 10, which does not exist
            // This line intentionally triggers a StringIndexOutOfBoundsException
            System.out.println(text.charAt(10));
            
        // Catch block specifically handles the StringIndexOutOfBoundsException when it is thrown
        } catch (StringIndexOutOfBoundsException e) {
            
            // Prints a user-friendly error message to the console indicating the index is invalid
            System.out.println("Exception: String index is out of bounds");
        }
    }
}
