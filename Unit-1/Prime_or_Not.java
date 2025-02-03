import java.util.Scanner;

public class Prime_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for (int i = 2; i <= a/2; i++) {
            if(a%i==0){
                System.out.println(a + " is not a prime number");
                sc.close();
                return;
            }
        }
        System.out.println(a + " is a prime number");
        sc.close();
    }
}
