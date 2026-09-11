import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                if (isLapindrome(s)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }

    private static boolean isLapindrome(String s) {
        int len = s.length();
        int mid = len / 2;

        // Extract the left half
        String leftHalf = s.substring(0, mid);
        
        // Extract the right half (skip the middle character if the length is odd)
        String rightHalf = (len % 2 == 0) ? s.substring(mid) : s.substring(mid + 1);

        // Convert strings to character arrays to sort them
        char[] leftArr = leftHalf.toCharArray();
        char[] rightArr = rightHalf.toCharArray();

        Arrays.sort(leftArr);
        Arrays.sort(rightArr);

        // If sorted arrays are equal, character frequencies match perfectly
        return Arrays.equals(leftArr, rightArr);
    }
}



output

  input:
  6
gaga
abcde
rotor
xyzxy
abbaab
ababc

  output:
YES
NO
YES
YES
NO
NO
