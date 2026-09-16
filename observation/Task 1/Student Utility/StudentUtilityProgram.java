import java.util.Scanner;

// Main class of the program
public class StudentUtilityProgram {

    // ---------- Methods ----------

    // Method to calculate factorial of a number
    public static long factorial(int n) {
        long fact = 1;

        // Multiply numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Method to check whether a number is prime
    public static boolean prime(int n) {

        // Numbers less than or equal to 1 are not prime
        if (n <= 1)
            return false;

        // Check divisibility from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Method to find maximum of two numbers
    public static int maximum(int a, int b) {
        return (a > b) ? a : b;
    }

    // Method to calculate area of a circle
    public static double areaCircle(double r) {
        return 3.14 * r * r;
    }

    // Main method
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        int choice;

        // do-while loop displays the menu repeatedly
        do {

            // Display menu
            System.out.println("\n===== STUDENT UTILITY PROGRAM =====");
            System.out.println("1. Student Information");
            System.out.println("2. Even or Odd");
            System.out.println("3. Largest of Three Numbers");
            System.out.println("4. Grade using Percentage");
            System.out.println("5. Day of Week");
            System.out.println("6. Multiplication Table");
            System.out.println("7. Display 1 to N");
            System.out.println("8. Sum of First N Natural Numbers");
            System.out.println("9. Fibonacci Series");
            System.out.println("10. Factorial");
            System.out.println("11. Prime Number");
            System.out.println("12. Maximum of Two Numbers");
            System.out.println("13. Area of Circle");
            System.out.println("14. Exit");

            // Read user's choice
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // Perform operation based on user's choice
            switch (choice) {

                // ---------- Student Information ----------
                case 1:

                    // Consume the leftover newline
                    sc.nextLine();

                    // Read student name
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    // Read roll number
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();

                    // Read marks of three subjects
                    System.out.print("Enter Marks of Subject1: ");
                    int m1 = sc.nextInt();

                    System.out.print("Enter Marks of Subject2: ");
                    int m2 = sc.nextInt();

                    System.out.print("Enter Marks of Subject3: ");
                    int m3 = sc.nextInt();

                    // Calculate total marks
                    int total = m1 + m2 + m3;

                    // Calculate percentage
                    double percentage = total / 3.0;

                    // Display student details
                    System.out.println("Name : " + name);
                    System.out.println("Roll No : " + roll);
                    System.out.println("Total : " + total);
                    System.out.println("Percentage : " + percentage);

                    break;

                // ---------- Even or Odd ----------
                case 2:

                    // Read a number
                    System.out.print("Enter Number: ");
                    int n = sc.nextInt();

                    // Check whether number is divisible by 2
                    if (n % 2 == 0)
                        System.out.println("Even Number");
                    else
                        System.out.println("Odd Number");

                    break;

                // ---------- Largest of Three Numbers ----------
                case 3:

                    // Read three numbers
                    System.out.print("Enter Three Numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();

                    // Compare the three numbers
                    if (a >= b && a >= c)
                        System.out.println("Largest = " + a);
                    else if (b >= c)
                        System.out.println("Largest = " + b);
                    else
                        System.out.println("Largest = " + c);

                    break;

                // ---------- Grade using Percentage ----------
                case 4:

                    // Read percentage
                    System.out.print("Enter Percentage: ");
                    double per = sc.nextDouble();

                    // Assign grade based on percentage
                    if (per >= 90)
                        System.out.println("Grade A");
                    else if (per >= 75)
                        System.out.println("Grade B");
                    else if (per >= 60)
                        System.out.println("Grade C");
                    else if (per >= 40)
                        System.out.println("Grade D");
                    else
                        System.out.println("Fail");

                    break;

                // ---------- Day of Week ----------
                case 5:

                    // Read day number
                    System.out.print("Enter Day Number (1-7): ");
                    int day = sc.nextInt();

                    // Display day using switch
                    switch (day) {

                        case 1:
                            System.out.println("Monday");
                            break;

                        case 2:
                            System.out.println("Tuesday");
                            break;

                        case 3:
                            System.out.println("Wednesday");
                            break;

                        case 4:
                            System.out.println("Thursday");
                            break;

                        case 5:
                            System.out.println("Friday");
                            break;

                        case 6:
                            System.out.println("Saturday");
                            break;

                        case 7:
                            System.out.println("Sunday");
                            break;

                        default:
                            System.out.println("Invalid Day");
                    }

                    break;

                // ---------- Multiplication Table ----------
                case 6:

                    // Read number
                    System.out.print("Enter Number: ");
                    int num = sc.nextInt();

                    // Print multiplication table from 1 to 10
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(
                            num + " x " + i + " = " + (num * i)
                        );
                    }

                    break;

                // ---------- Display 1 to N ----------
                case 7:

                    // Read limit
                    System.out.print("Enter N: ");
                    int limit = sc.nextInt();

                    // Display numbers from 1 to N
                    for (int i = 1; i <= limit; i++) {
                        System.out.print(i + " ");
                    }

                    System.out.println();
                    break;

                // ---------- Sum of First N Natural Numbers ----------
                case 8:

                    // Read N
                    System.out.print("Enter N: ");
                    int x = sc.nextInt();

                    int sum = 0;

                    // Calculate sum from 1 to N
                    for (int i = 1; i <= x; i++)
                        sum += i;

                    // Display sum
                    System.out.println("Sum = " + sum);

                    break;

                // ---------- Fibonacci Series ----------
                case 9:

                    // Read number of terms
                    System.out.print("Enter Number of Terms: ");
                    int terms = sc.nextInt();

                    // First two Fibonacci numbers
                    int first = 0, second = 1;

                    // Display first two numbers
                    System.out.print(first + " " + second + " ");

                    // Generate remaining Fibonacci numbers
                    for (int i = 3; i <= terms; i++) {

                        int next = first + second;

                        System.out.print(next + " ");

                        // Update values for next iteration
                        first = second;
                        second = next;
                    }

                    System.out.println();
                    break;

                // ---------- Factorial ----------
                case 10:

                    // Read number
                    System.out.print("Enter Number: ");
                    int fact = sc.nextInt();

                    // Call factorial method
                    System.out.println("Factorial = " + factorial(fact));

                    break;

                // ---------- Prime Number ----------
                case 11:

                    // Read number
                    System.out.print("Enter Number: ");
                    int p = sc.nextInt();

                    // Call prime method and check result
                    if (prime(p))
                        System.out.println("Prime Number");
                    else
                        System.out.println("Not Prime");

                    break;

                // ---------- Maximum of Two Numbers ----------
                case 12:

                    // Read two numbers
                    System.out.print("Enter Two Numbers: ");
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();

                    // Call maximum method
                    System.out.println("Maximum = " + maximum(n1, n2));

                    break;

                // ---------- Area of Circle ----------
                case 13:

                    // Read radius
                    System.out.print("Enter Radius: ");
                    double r = sc.nextDouble();

                    // Call areaCircle method
                    System.out.println("Area = " + areaCircle(r));

                    break;

                // ---------- Exit ----------
                case 14:

                    // Exit message
                    System.out.println("Thank You");
                    break;

                // Handle invalid menu choice
                default:
                    System.out.println("Invalid Choice");
            }

        // Continue until user chooses option 14
        } while (choice != 14);

        // Close Scanner object
        sc.close();
    }
}
