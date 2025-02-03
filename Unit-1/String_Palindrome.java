import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string");
        String s = sc.nextLine();
        int l = s.length()-1;
        for(int i=0;i<l/2;i++)
        {
            if(s.charAt(i)!=s.charAt(l-i))
            {
                System.out.println("Not a palindrome");
                sc.close();
                return;
            }
        }
        sc.close();
    }
}
