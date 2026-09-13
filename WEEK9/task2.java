import java.util.*;

public class HashtagCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (word.startsWith("#")) {
                String hashtag = word.toLowerCase();
                map.put(hashtag, map.getOrDefault(hashtag, 0) + 1);
            }
        }

        System.out.println("\n--- Hashtag Frequency ---");

        for (String hashtag : map.keySet()) {
            System.out.println(hashtag + " : " + map.get(hashtag));
        }

        sc.close();
    }
}

 output
Enter a sentence: #java is a #coding #language #java is #important

--- Hashtag Frequency ---
#important : 1
#language : 1
#coding : 1
#java : 2
