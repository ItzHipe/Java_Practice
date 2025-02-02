import java.util.Scanner;

public class Positive_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(a>0)
            System.out.println("Positive");
        else if (a==0)
            System.out.println("Zero");
        else
            System.out.println("Negative");
        sc.close();
    }
}