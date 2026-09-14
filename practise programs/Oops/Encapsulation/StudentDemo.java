// Class that demonstrates encapsulation using getter and setter methods
class StudentDemo {

    // Private variable to store the student's age
    private int age;

    // Setter method to set the value of age
    public void setAge(int age) {
        // 'this.age' refers to the instance variable
        // 'age' refers to the parameter passed to the method
        this.age = age;
    }

    // Getter method to return the value of age
    public int getAge() {
        return age;
    }
}

// Main class
public class Main {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Creating an object of StudentDemo class
        StudentDemo s = new StudentDemo();

        // Setting the student's age to 20 using the setter method
        s.setAge(20);

        // Getting and printing the student's age using the getter method
        System.out.println(s.getAge());
    }
}
