
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double rate = sc.nextDouble();

        double fare = distance * rate;

        System.out.println("Ride Fare: " + fare);
    }
}
input

10
15
  output
  Ride Fare: 150.0
