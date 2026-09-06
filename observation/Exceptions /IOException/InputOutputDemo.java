import java.io.IOException;

class InputOutputDemo {
    public static void main(String[] args) {
        try {
            throw new IOException("Input or output error");
        } catch (IOException e) {
            System.out.println("Exception: Input/Output error occurred");
        }
    }
}
