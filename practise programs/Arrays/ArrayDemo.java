public class ArrayDemo {
    


    public static void main(String[] args) {

        // Creating an integer array and storing 5 values
        int[] numbers = {10, 20, 30, 40, 50};

        // Displaying the heading
        System.out.println("Array Elements:");

        // Loop is used to access each array element
        for (int i = 0; i < numbers.length; i++) {

            // numbers[i] accesses the element at index i
            System.out.println(numbers[i]);
        }
    }
}
