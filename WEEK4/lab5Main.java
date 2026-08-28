import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter deposit amount: ");
            double amount = sc.nextDouble();
            balance = balance + amount;
            System.out.println("Balance = " + balance);
        }
        else if (choice == 2) {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Balance = " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
        else if (choice == 3) {
            System.out.println("Balance = " + balance);
        }
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}






C:\Users\rokka\Downloads>javac Main.java

C:\Users\rokka\Downloads>
C:\Users\rokka\Downloads>java Main
1. Deposit
2. Withdraw
3. Check Balance
Enter choice: 1
Enter deposit amount: 200
Balance = 5200.0
