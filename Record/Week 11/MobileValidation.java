import java.util.Scanner;

// Custom exception class for invalid mobile number
class InvalidMobileNumberException extends Exception {

    // Constructor to display the error message
    public InvalidMobileNumberException(String message) {
        super(message);
    }
}

// Main class
public class MobileValidation {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter mobile number
        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        try {

            // Check whether mobile number has exactly 10 digits
            if (!mobile.matches("[0-9]{10}")) {

                // Throw custom exception if number is invalid
                throw new InvalidMobileNumberException(
                    "Invalid Mobile Number! Enter exactly 10 digits."
                );
            }

            // Display message when mobile number is valid
            System.out.println("Mobile Number is Valid.");

        } catch (InvalidMobileNumberException e) {

            // Handle the invalid mobile number exception
            System.out.println("Exception: " + e.getMessage());
        }

        // Close Scanner object
        sc.close();
    }
}
