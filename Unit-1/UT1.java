import java.util.Scanner;

public class UT1 {
    static Scanner s = new Scanner(System.in);

    static void Welcome() {
        System.out.println("Hello there mate!");
    }
    
    static void Add_Two_Nums() {
        System.out.print("Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Addition is " + (a+b));
    }

    static void Calculate_difference_product_division() {
        System.out.print("Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Difference is " + (a-b));
        System.out.println("Product is " + (a*b));
        System.out.println("Division is " + (a/b));
    }

    static void Square_of_Number() {
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        System.out.println("Square is " + (a*a));
    }

    static void Even_or_Odd() {
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        if (a%2 == 0) {
            System.out.println("Even number");
        } 
        else {
            System.out.println("Odd number");
        }
    }

    static void Positive_Zero_Negative() {
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        if (a > 0) {
            System.out.println("Positive number");
        } 
        else if (a == 0) {
            System.out.println("Zero");
        }
        else {
            System.out.println("Negative number");
        }
    }

    static void Largest_of_3() {
        System.out.print("Enter three numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a > b && a > c) {
            System.out.println("Largest number is " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Largest number is " + b);
        }
        else {
            System.out.println("Largest number is " + c);
        }
    }

    static void Multiplication_table() {
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(a+"*"+i+"="+a*i);
    }

    static void Factorial() {
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        int fact = 1;
        for(int i=1;i<=a;i++)
            fact *= i;
        System.out.println("Factorial of "+a+" is "+fact);
    }

    static void Even_Numbers_Upto_N() {
        System.out.print("Enter a range: ");
        int a = s.nextInt();
        for(int i=1;i<=a;i++)
            if(i%2==0)
                System.out.println(i);
    }

    static void Palindrome_String() {
        System.out.print("Enter a string: ");
        s.nextLine();
        String a = s.nextLine();
        int length = a.length();

        for (int i = 0; i < length / 2; i++) {
            if (a.charAt(i) != a.charAt(length - i - 1)) {
                System.out.println("Not a palindrome");
                return;
            }
    }

    System.out.println("Palindrome"); 
    }

    static void Vowel_Count() {
        System.out.print("Enter a string: ");
        s.nextLine();
        String a = s.nextLine();
        int count = 0;
        for(int i=0; i<a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Vowel count is " + count);
    }

    static void Reverse_Number() {
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        int rev = 0;
        while(a != 0) {
            rev = rev*10 + a%10;
            a /= 10;
        }
        System.out.println("Reverse is " + rev);
    }

    static void Palindrome_Number() {
        System.out.print("Enter a number: ");
        long a = s.nextLong();
        long temp = a;
        long rev = 0;
        while(a != 0) {
            rev = rev*10 + a%10;
            a /= 10;
        }
        if (temp == rev) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }

    static void Sum_of_Digits() {
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        int sum = 0;
        while(a != 0) {
            sum += a%10;
            a /= 10;
        }
        System.out.println("Sum of digits is " + sum);
    }

    static void Fibonnaci_Series() {
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        int b = 0;
        int c = 1;
        for(int i=1;i<=a;i++) {
            System.out.print(b+" ");
            int d = b+c;
            b = c;
            c = d;
        }
    }

    static void Sum_of_n_Natural_Numbers() {
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++)
            sum += i;
        System.out.println("Sum of " + n + " natural numbers is " + sum);
    }

    static void Prime() {
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        for (int i = 2; i <= a/2; i++) {
            if(a%i==0){
                System.out.println(a + " is not a prime number");
                return;
            }
        }
        System.out.println(a + " is a prime number");
    }

    public static void main(String[] args) {
        int c;
        do {
            System.out.print("\nEnter your choice:\n"
                    + "1. Welcome\n"
                    + "2. Add two numbers\n"
                    + "3. Calculate difference, product, and division\n"
                    + "4. Square of a number\n"
                    + "5. Even or Odd\n"
                    + "6. Positive, Zero, or Negative\n"
                    + "7. Largest of three numbers\n"
                    + "8. Multiplication table\n"
                    + "9. Factorial\n"
                    + "10. Even numbers upto N\n"
                    + "11. Palindrome string\n"
                    + "12. Vowel count\n"
                    + "13. Reverse number\n"
                    + "14. Palindrome number\n"
                    + "15. Sum of digits\n"
                    + "16. Fibonnaci series\n"
                    + "17. Sum of n natural numbers\n"
                    + "18. Prime\n"
                    + "0. Exit\n"
                    + "Choice: ");
            c = s.nextInt();

            switch (c) {
                case 1:
                    Welcome();
                    break;
                case 2:
                    Add_Two_Nums();
                    break;
                case 3:
                    Calculate_difference_product_division();
                    break;
                case 4:
                    Square_of_Number();
                    break;
                case 5:
                    Even_or_Odd();
                    break;
                case 6:
                    Positive_Zero_Negative();
                    break;
                case 7:
                    Largest_of_3();
                    break;
                case 8:
                    Multiplication_table();
                    break;
                case 9:
                    Factorial();
                    break;
                case 10:
                    Even_Numbers_Upto_N();
                    break;
                case 11:
                    Palindrome_String();
                    break;
                case 12:
                    Vowel_Count();
                    break;
                case 13:
                    Reverse_Number();
                    break;
                case 14:
                    Palindrome_Number();
                    break;
                case 15:
                    Sum_of_Digits();
                    break;
                case 16:
                    Fibonnaci_Series();
                    break;
                case 17:
                    Sum_of_n_Natural_Numbers();
                    break;
                case 18:
                    Prime();
                    break;
                case 0:
                    System.out.println("Bye 👋");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (c != 0);
        s.close();
    }
}