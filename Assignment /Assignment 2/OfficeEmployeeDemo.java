class Office {

    void officeDetails() {
        System.out.println("Office: Tech Solutions");
    }
}

class Employee extends Office {

    void employeeDetails() {
        System.out.println("Employee: Arjun");
    }
}

public class OfficeEmployeeDemo {

    public static void main(String[] args) {

        Employee em = new Employee();

        em.officeDetails();
        em.employeeDetails();
    }
}
