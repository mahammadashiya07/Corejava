public class Array2D {
    public static void main(String[] args) {

        // Declare and initialize a 2D array
        int[][] a = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90},
        };

        // Outer loop is used to access rows
        for (int i = 0; i < 3; i++) {

            // Inner loop is used to access columns
            for (int j = 0; j < 3; j++) {

                // Print each element of the array
                System.out.print(a[i][j] + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
