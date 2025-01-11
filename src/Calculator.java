import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Enter your choice\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n");
        c = sc.nextInt();
        switch (c){
            case 1:
                System.out.println("Addition is " + (a+b));
                break;
            case 2:
                System.out.println("Subtraction is " + (a-b));
                break;
            case 3:
                System.out.println("Multiplication is " + (a*b));
                break;
            case 4:
                System.out.println("Division is " + (a/b));
        }
    }
}
