import java.util.Scanner;

// Main class
public class UniqueSubstring {

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Variable to store the longest substring
        String longest = "";

        // Starting position of the current substring
        int start = 0;

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {

            // Check for repeated characters
            for (int j = start; j < i; j++) {

                // Compare the current character with previous characters
                if (str.charAt(j) == str.charAt(i)) {

                    // Move the starting position after the repeated character
                    start = j + 1;
                    break;
                }
            }

            // Get the current substring without repeating characters
            String current = str.substring(start, i + 1);

            // Check if the current substring is longer
            if (current.length() > longest.length()) {

                // Store the current substring as the longest substring
                longest = current;
            }
        }

        // Display the longest substring
        System.out.println("Longest substring without repeating characters: "
                + longest);

        // Display the length of the longest substring
        System.out.println("Length: " + longest.length());

        // Close the Scanner object
        sc.close();
    }
}