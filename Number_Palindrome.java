import java.util.Scanner;

public class Number_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int b = a;
        int c = 0;
        while(a>0)
        {
            c = c*10 + a%10;
            a /= 10;
        }
        if(b==c)
            System.out.println("The number is a palindrome");
        else
            System.out.println("The number is not a palindrome");
        sc.close();
    }
}
