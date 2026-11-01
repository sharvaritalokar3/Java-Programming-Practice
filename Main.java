import java.util.Scanner;

// Main Class
public class Main {

    // Student Class
    static class Student {
        int rollNo;
        String name;
        int marks1, marks2, marks3;
        int total;
        double percentage;
        String grade;

        // Method to take input
        void getData(Scanner sc) {
            System.out.print("Enter Roll Number: ");
            rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            name = sc.nextLine();

            System.out.print("Enter Marks of Subject 1: ");
            marks1 = sc.nextInt();

            System.out.print("Enter Marks of Subject 2: ");
            marks2 = sc.nextInt();

            System.out.print("Enter Marks of Subject 3: ");
            marks3 = sc.nextInt();
        }

        // Method to calculate result
        void calculateResult() {
            total = marks1 + marks2 + marks3;
            percentage = total / 3.0;

            if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 75) {
                grade = "A";
            } else if (percentage >= 60) {
                grade = "B";
            } else if (percentage >= 40) {
                grade = "C";
            } else {
                grade = "Fail";
            }
        }

        // Method to display result
        void displayResult() {
            System.out.println("\n===== STUDENT RESULT =====");
            System.out.println("Roll Number : " + rollNo);
            System.out.println("Student Name: " + name);
            System.out.println("Marks 1     : " + marks1);
            System.out.println("Marks 2     : " + marks2);
            System.out.println("Marks 3     : " + marks3);
            System.out.println("Total Marks : " + total);
            System.out.println("Percentage  : " + percentage);
            System.out.println("Grade       : " + grade);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object Creation
        Student s1 = new Student();

        // Calling Methods
        s1.getData(sc);
        s1.calculateResult();
        s1.displayResult();

        sc.close();
    }
}