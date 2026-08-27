class Employee {
    void employeeDetails() {
        System.out.println("Employee works in the company");
    }
}

class Manager extends Employee {
    void managerDetails() {
        System.out.println("Manager manages the team");
    }
}

class Developer extends Employee {
    void developerDetails() {
        System.out.println("Developer writes programs");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        Manager m = new Manager();
        Developer d = new Developer();

        System.out.println("Manager:");
        m.employeeDetails();
        m.managerDetails();

        System.out.println();

        System.out.println("Developer:");
        d.employeeDetails();
        d.developerDetails();
    }
}
