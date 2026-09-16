// Class to demonstrate ClassNotFoundException
class ClassNotFoundDemo {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // try block contains code that may cause an exception
        try {

            // Try to load a class using its class name
            // "UnknownClass" does not exist, so an exception occurs
            Class.forName("UnknownClass");
        }

        // Catch block handles ClassNotFoundException
        catch (ClassNotFoundException e) {

            // Display error message
            System.out.println("Exception: Class not found");
        }
    }
}
