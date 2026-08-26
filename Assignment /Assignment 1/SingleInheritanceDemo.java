class Person {
    void displayPerson() {
        System.out.println("This is a Person");
    }
}

class Student extends Person {
    void displayStudent() {
        System.out.println("This is a Student");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {

        Student s = new Student();

        s.displayPerson();
        s.displayStudent();
    }
}