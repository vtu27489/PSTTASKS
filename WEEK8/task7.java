import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < t; i++) {
            // Combine the left and right string with a delimiter to represent a unique pair
            set.add(pair_left[i] + " " + pair_right[i]);
            // Print the current size of the set after each insertion
            System.out.println(set.size());
        }
        s.close();
   }
}

output
  Input (stdin)
5
john tom
john mary
john tom
mary anna
mary anna
Your Output (stdout)
1
2
2
3
3
Expected Output
1
2
2
3
3
