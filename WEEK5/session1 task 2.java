import java.util.*;

public class Solution {

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;

            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }

            if (sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }

        int d = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(birthday(s, d, m));

        sc.close();
    }
}


output

  test case 1:
Input (stdin)
5
1 2 1 3 2
3 2
Your Output (stdout)
2
Expected Output
2

  test case2 :
Input (stdin)
6
1 1 1 1 1 1
3 2
Your Output (stdout)
0
Expected Output
0
  test case 3:
Input (stdin)
1
4
4 1
Your Output (stdout)
1
Expected Output
1
