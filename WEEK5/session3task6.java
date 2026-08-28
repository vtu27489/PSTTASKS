import java.util.*;

public class Solution {

    static int alternatingCharacters(String s) {
        int deletions = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }

        return deletions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();

        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println(alternatingCharacters(s));
        }

        sc.close();
    }
}

output
  case1:
  
  Input (stdin)
5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB
Your Output (stdout)
3
4
0
0
4
Expected Output
3
4
0
0
4

  case 2:
Input (stdin)
3
AAABBBAABB
AABBAABB
ABABABAA
Your Output (stdout)
6
4
1
Expected Output
6
4
1
