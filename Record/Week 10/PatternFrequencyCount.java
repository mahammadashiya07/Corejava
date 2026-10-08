import java.io.*;
import java.util.Scanner;

public class PatternFrequencyCount {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter pattern to search: ");
        String pattern = sc.nextLine();

        BufferedReader br = new BufferedReader(
                new FileReader(fileName));

        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            int index = 0;

            while ((index = line.indexOf(pattern, index)) != -1) {
                count++;
                index += pattern.length();
            }
        }

        br.close();

        System.out.println("Pattern frequency: " + count);

        sc.close();
    }
}