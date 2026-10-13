
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double bonus = salary * 0.10;
        double total = salary + bonus;

        System.out.println("Bonus: " + bonus);
        System.out.println("Final Salary: " + total);
    }
}

input
  20000
  output
  Bonus: 2000.0
Final Salary: 22000.0
