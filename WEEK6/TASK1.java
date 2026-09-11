class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;
        
        // Define all valid lowercase and uppercase vowels
        String vowels = "aeiouAEIOU";
        
        int vowelCountA = 0;
        int vowelCountB = 0;
        
        // Iterate through both halves simultaneously
        for (int i = 0; i < mid; i++) {
            // Check first half
            if (vowels.indexOf(s.charAt(i)) != -1) {
                vowelCountA++;
            }
            // Check second half
            if (vowels.indexOf(s.charAt(i + mid)) != -1) {
                vowelCountB++;
            }
        }
        
        // Return true if both halves have the same number of vowels
        return vowelCountA == vowelCountB;
    }
}




output
case1:
  Input
s =
"book"
Output
true
Expected
true

case2:
Input
s =
"textbook"
Output
false
Expected
false
  
