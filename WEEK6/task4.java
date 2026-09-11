import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a hash set to store elements we have seen so far
        HashSet<Integer> seen = new HashSet<>();
        
        // Iterate through the array
        for (int num : nums) {
            // If the element is already in the set, a duplicate exists
            if (seen.contains(num)) {
                return true;
            }
            // Otherwise, add the element to the set
            seen.add(num);
        }
        
        // If the loop finishes without finding duplicates, return false
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solver = new Solution();

        // Test Case 1
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(solver.containsDuplicate(nums1)); // Output: true

        // Test Case 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(solver.containsDuplicate(nums2)); // Output: false

        // Test Case 3
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(solver.containsDuplicate(nums3)); // Output: true
    }
}



output
  case1:
  Input
nums =
[1,2,3,1]
Output
true
Expected
true

  case2:
  Input
nums =
[1,2,3,4]
Output
false
Expected
false
