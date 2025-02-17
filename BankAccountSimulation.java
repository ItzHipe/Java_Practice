import java.util.Scanner;

class BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;

    public void getDetails() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accountNumber = s.nextLong();
        System.out.print("Enter account holder name: ");
        accountHolderName = s.next();
        System.out.print("Enter balance: ");
        balance = s.nextDouble();
        s.close();
    }

    public void displayDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " successfully");
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " successfully");
        }
    }
}

public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.getDetails();
        b.displayDetails();
        System.out.print("Enter amount to deposit: ");
        Scanner s = new Scanner(System.in);
        double amount = s.nextDouble();
        b.deposit(amount);
        System.out.print("Enter amount to withdraw: ");
        amount = s.nextDouble();
        b.withdraw(amount);
        s.close();
    }
}