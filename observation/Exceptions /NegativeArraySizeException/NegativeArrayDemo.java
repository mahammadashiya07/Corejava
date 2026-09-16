// Defines the class name NegativeArrayDemo
class NegativeArrayDemo { 
    
    // The entry point of the program where execution begins
    public static void main(String[] args) { 
        
        // Start of the try block to monitor for potential exceptions
        try { 
            
            // Initializes an integer variable named 'size' with a negative value (-5)
            int size = -5; 
            
            // Attempts to create a new integer array using the negative size variable
            // This line will intentionally trigger a NegativeArraySizeException
            int[] numbers = new int[size]; 
            
            // This line is skipped because the exception occurs immediately above it
            System.out.println(numbers.length); 
            
        // Catch block specifically handles the NegativeArraySizeException if it is thrown
        } catch (NegativeArraySizeException e) { 
            
            // Prints a user-friendly error message to the console
            System.out.println("Exception: Array size cannot be negative"); 
        } 
    } 
}
