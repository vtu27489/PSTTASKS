
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0)
            System.out.println("Division: " + (double) a / b);
        else
            System.out.println("Division: Not possible");
    }
}

input
10 5
  output
  Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2.0
