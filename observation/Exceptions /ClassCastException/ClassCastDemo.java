// Class to demonstrate ClassCastException
class ClassCastDemo {

    // Main method - program execution starts here
    public static void main(String[] args) {

        // try block contains code that may cause an exception
        try {

            // Store an Integer object inside an Object reference
            Object value = Integer.valueOf(100);

            // Try to convert Integer object into String
            // This causes ClassCastException
            String text = (String) value;

            // Print the converted value
            System.out.println(text);
        }

        // Catch block handles ClassCastException
        catch (ClassCastException e) {

            // Display error message
            System.out.println("Exception: Invalid type casting");
        }
    }
}