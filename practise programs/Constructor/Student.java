class Student {

    String name;
    int age;

    // Constructor
    Student() {
        name = "Vamsi";
        age = 20;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // object creation
        Student s = new Student();

        // Method calling
        s.display();
    }
}
