import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int b = 0;
        int c = 1;
        for(int i=1;i<=a;i++)
        {
            System.out.print(b+" ");
            int d = b+c;
            b = c;
            c = d;
        }
    }
}
