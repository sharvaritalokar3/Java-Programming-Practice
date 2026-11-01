import java.util.Scanner;

// Employee Class
class Employee {
    int empId;
    String empName;
    double basicSalary;
    double hra, da, grossSalary;

    // Method to accept employee details
    void getEmployeeData(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    // Method to calculate salary
    void calculateSalary() {

        hra = basicSalary * 0.20; // 20% HRA
        da = basicSalary * 0.10;  // 10% DA

        grossSalary = basicSalary + hra + da;
    }

    // Method to display details
    void displayEmployeeData() {

        System.out.println("\n===== EMPLOYEE DETAILS =====");
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Name    : " + empName);
        System.out.println("Basic Salary     : " + basicSalary);
        System.out.println("HRA              : " + hra);
        System.out.println("DA               : " + da);
        System.out.println("Gross Salary     : " + grossSalary);
    }
}

// Main Class
public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object Creation
        Employee e1 = new Employee();

        // Calling Methods
        e1.getEmployeeData(sc);
        e1.calculateSalary();
        e1.displayEmployeeData();

        sc.close();
    }
}