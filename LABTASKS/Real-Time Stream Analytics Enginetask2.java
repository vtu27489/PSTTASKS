
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / n);
    }
}


input
  4
10 20 30 40

  output
  Sum: 100
Average: 25.0
