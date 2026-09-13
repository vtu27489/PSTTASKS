import java.util.*;

public class RideSharing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger name: ");
        String passenger = sc.nextLine();

        System.out.print("Enter pickup location: ");
        String pickup = sc.nextLine();

        System.out.print("Enter drop location: ");
        String drop = sc.nextLine();

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        double fare = distance * 15;

        System.out.println("\n--- Ride Details ---");
        System.out.println("Passenger: " + passenger);
        System.out.println("Pickup: " + pickup);
        System.out.println("Drop: " + drop);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs." + fare);

        sc.close();
    }
}

output
  Enter passenger name: navya
Enter pickup location: chennai
Enter drop location: avadi
Enter distance (km): 30

--- Ride Details ---
Passenger: navya
Pickup: chennai
Drop: avadi
Distance: 30.0 km
Fare: Rs.450.0
