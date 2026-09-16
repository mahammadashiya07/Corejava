// Import File class to work with files
import java.io.File;

// Import FileNotFoundException to handle file not found errors
import java.io.FileNotFoundException;

// Import Scanner class to read data from the file
import java.util.Scanner;


// Class to demonstrate FileNotFoundException
class FileNotFoundDemo {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // try block contains code that may cause an exception
        try {

            // Create a File object for abc.txt
            File file = new File("abc.txt");

            // Create Scanner object to read the file
            // If the file does not exist, FileNotFoundException occurs
            Scanner sc = new Scanner(file);
        }

        // Catch block handles FileNotFoundException
        catch (FileNotFoundException e) {

            // Display error message
            System.out.println("Exception: File not found");
        }
    }
}
