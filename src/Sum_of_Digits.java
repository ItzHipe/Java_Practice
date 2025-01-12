import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int sum = 0;
        while(a>0){
            sum = sum + a%10;
            a = a/10;
        }
        System.out.println("Sum of digits is " + sum);
    }
}