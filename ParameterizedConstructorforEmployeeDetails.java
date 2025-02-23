import java.util.Scanner;

class EmployeeDetails {
    int id;
    String name;
    double salary;


    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
public class ParameterizedConstructorforEmployeeDetails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = s.nextInt();
        System.out.print("Enter name: ");
        String name = s.next();
        System.out.print("Enter salary: ");
        double salary = s.nextDouble();
        s.close();
        EmployeeDetails e = new EmployeeDetails();
        e.id = id;
        e.name = name;
        e.salary = salary;
        e.displayDetails();
    }
}
