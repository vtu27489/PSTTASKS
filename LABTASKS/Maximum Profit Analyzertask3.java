
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] price = new int[n];

        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();

        int min = price[0], profit = 0;

        for (int i = 1; i < n; i++) {
            profit = Math.max(profit, price[i] - min);
            min = Math.min(min, price[i]);
        }

        System.out.println("Maximum Profit: " + profit);
    }
}
input
  6
7 1 5 3 6 4

  output
  Maximum Profit: 5
