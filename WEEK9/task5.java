import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            int result = x / y;
            System.out.println(result);
            
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
}


output
  case1:
  
  Input (stdin)
10
3
Your Output (stdout)
3
Expected Output
3

  case2:
Input (stdin)
10
Hello
Your Output (stdout)
java.util.InputMismatchException
Expected Output
java.util.InputMismatchException
