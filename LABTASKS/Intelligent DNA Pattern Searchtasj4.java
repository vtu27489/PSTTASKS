
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dna = sc.next();
        String pattern = sc.next();

        int pos = dna.indexOf(pattern);

        if (pos != -1)
            System.out.println("Pattern Found at Index: " + pos);
        else
            System.out.println("Pattern Not Found");
    }
}

input
ATGCGATC
GAT
  output
  Pattern Found at Index: 4
