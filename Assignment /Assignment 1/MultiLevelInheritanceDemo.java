
class MultiLevelInheritance {
    void collegeDetails() {
        System.out.println("College: ABC Engineering College");
    }
}

class Department extends MultiLevelInheritance {
    void departmentDetails() {
        System.out.println("Department: Computer Science");
    }
}

class Student extends Department {
    void studentDetails() {
        System.out.println("Student: Rahul");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        Student s = new Student();

        s.collegeDetails();
        s.departmentDetails();
        s.studentDetails();
    }
}