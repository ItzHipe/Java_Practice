import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    public void getDetails() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = s.next();
        System.out.print("Enter author: ");
        author = s.next();
        System.out.print("Enter price: ");
        price = s.nextDouble();
        s.close();
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class DefaultContructorForBookDetails {
    public static void main(String[] args) {
        Book b = new Book();
        b.getDetails();
        b.displayDetails();
    }
}
