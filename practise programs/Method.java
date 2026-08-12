class StudentDetails {

    void displayStudent() {
        String name = "Rahul";
        int age = 20;
        String course = "Java";

        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        StudentDetails s = new StudentDetails();
        s.displayStudent();
    }
}
