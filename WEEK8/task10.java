import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Attempt to read two 32-bit signed integers
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // Perform division and print integer result
            int result = x / y;
            System.out.println(result);
            
        } catch (InputMismatchException e) {
            // Prints the exact class name of the mismatched input exception
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            // Prints the exact exception message for division by zero
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}
output


  Input (stdin)
10
3
Expected Output
3
