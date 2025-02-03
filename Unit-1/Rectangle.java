import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area is " + (l*b));
        System.out.println("Perimeter is " + 2*(l+b));
        sc.close();
    }
}
