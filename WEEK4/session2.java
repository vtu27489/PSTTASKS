import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: "
                            + arr[i] + " + " + arr[j]
                            + " = " + target);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}



output
  C:\Users\rokka\Downloads>java TwoSum.java
Enter number of elements: 4
Enter elements:
1
2
45
67
Enter target: 47
Pair found: 2 + 45 = 47
