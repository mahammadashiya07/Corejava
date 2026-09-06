import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileNotFoundDemo {
    public static void main(String[] args) {
        try {
            File file = new File("abc.txt");
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Exception: File not found");
        }
    }
}


