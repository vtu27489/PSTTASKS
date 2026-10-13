
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        int choice = sc.nextInt();
        double amount = sc.nextDouble();

        if (choice == 1) {
            balance += amount;
        } else if (choice == 2 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid Transaction");
            return;
        }

        System.out.println("Balance: " + balance);
    }
}

input
5000
2
1000
  output
  Balance: 4000.0
  
