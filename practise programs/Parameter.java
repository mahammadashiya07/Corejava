class Student {
    String name;
    int age;

    Student(String a, int b) {
        name = a;
        age = b;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("vamsi",10); 
        Student s2 = new Student("nani", 20);
        s1.display();
        s2.display();
    }
}
