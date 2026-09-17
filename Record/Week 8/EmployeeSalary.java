// Interface for employee salary details
interface Salary {

    // Abstract method to calculate salary
    void calculateSalary();
}

// Employee class implements the Salary interface
class Employee implements Salary {

    // Data members
    int employeeId;
    String employeeName;
    double basicSalary;

    // Constructor to initialize employee details
    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    // Implementing the calculateSalary() method
    @Override
    public void calculateSalary() {

        // Calculate allowances
        double hra = basicSalary * 0.20;  // 20% HRA
        double da = basicSalary * 0.10;   // 10% DA

        // Calculate total salary
        double totalSalary = basicSalary + hra + da;

        // Display employee details
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Salary: " + totalSalary);
    }
}

// Main class
public class EmployeeSalary {

    public static void main(String[] args) {

        // Create an Employee object
        Employee emp = new Employee(101, "Rahul", 30000);

        // Call the implemented method
        emp.calculateSalary();
    }
}
