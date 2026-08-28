import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {

                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }
}

output
  case1 :
  Input
words =
["mass","as","hero","superhero"]
Output
["as","hero"]
Expected
["as","hero"]

  case 2:
Input
words =
["leetcode","et","code"]
Output
["et","code"]
Expected
["et","code"]
