
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine().toLowerCase();
        String hashtag = sc.next().toLowerCase();

        String[] words = sentence.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.equals(hashtag))
                count++;
        }

        System.out.println("Frequency: " + count);
    }
}

input
java is easy java is powerful
java
  output
  Frequency: 2
