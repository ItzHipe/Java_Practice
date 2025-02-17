import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    public void getDetails() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = s.nextInt();
        System.out.print("Enter name: ");
        name = s.next();
        System.out.print("Enter marks: ");
        marks = s.nextDouble();
        s.close();
    }
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    public void calculateGrades() {
        if (marks >= 90) {
            System.out.println("Grade: A+");
        }
        else if (marks >= 80) {
            System.out.println("Grade: A");
        }
        else if (marks >= 70) {
            System.out.println("Grade: B+");
        }
        else if (marks >= 60) {
            System.out.println("Grade: B");
        }
        else if (marks >= 50) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: F");
        }
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        Student s = new Student();
        s.getDetails();
        s.displayDetails();
        s.calculateGrades();
    }
}   