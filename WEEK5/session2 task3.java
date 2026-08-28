import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int left = 0;
        int right = n - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            } 
            else if (arr[mid] < key) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}


output
test case 1:
  Input (stdin)
2
4
1 2 3 4
6
2 -1 2 3 4 -5
Your Output (stdout)
10 10
10 11
Expected Output
10 10
10 11
test case 2:

Input (stdin)
1
5
-2 -3 -1 -4 -6
Your Output (stdout)
-1 -1
Expected Output
-1 -1
  
