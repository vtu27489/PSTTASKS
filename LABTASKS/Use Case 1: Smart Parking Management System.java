
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSlots = sc.nextInt();
        int occupied = sc.nextInt();

        if (occupied < totalSlots) {
            occupied++;
            System.out.println("Parking Successful");
        } else {
            System.out.println("Parking Full");
        }

        System.out.println("Available Slots: "
                           + (totalSlots - occupied));
    }
}
input
  10
6
  output
  Parking Successful
Available Slots: 3
