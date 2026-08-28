
public class NullExample {
    public static void main(String[] args) {

        String studentName = null;

        try {
            if (studentName.length() == 0) {
                System.out.println("Name is empty");
            }
        }
        catch (NullPointerException e) {
            System.out.println("Student name is null.");
        }
    }
}