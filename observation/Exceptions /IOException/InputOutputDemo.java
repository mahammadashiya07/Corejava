import java.io.IOException;  // Import IOException class

class InputOutputDemo {
    public static void main(String[] args) {
        
        try {
            // Manually throw an IOException
            throw new IOException("Input or output error");
            
        } catch (IOException e) {
            // Catch the IOException and display an error message
            System.out.println("Exception: Input/Output error occurred");
        }
    }
}
