import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean matches(String word, String pattern) {
        int[] map1 = new int[26];
        int[] map2 = new int[26];

        Arrays.fill(map1, -1);
        Arrays.fill(map2, -1);

        for (int i = 0; i < pattern.length(); i++) {
            int p = pattern.charAt(i) - 'a';
            int w = word.charAt(i) - 'a';

            // Pattern character must always map to the same word character
            if (map1[p] != -1 && map1[p] != w) {
                return false;
            }

            // Two pattern characters cannot map to the same word character
            if (map2[w] != -1 && map2[w] != p) {
                return false;
            }

            map1[p] = w;
            map2[w] = p;
        }

        return true;
    }
}


output
  case1 :
  
  Input
words =
["abc","deq","mee","aqq","dkd","ccc"]
pattern =
"abb"
Output
["mee","aqq"]
Expected
["mee","aqq"]

  case2 :
input
words =
["a","b","c"]
pattern =
"a"
Output
["a","b","c"]
Expected
["a","b","c"]
