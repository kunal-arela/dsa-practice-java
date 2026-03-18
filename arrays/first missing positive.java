/**
 * LeetCode 41 - First Missing Positive
 * 
 * Approach: Index Placement (Cyclic Sort Concept)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Author: Kunal
 */

class Solution {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct position
        for (int i = 0; i < n; i++) {
            while (
                nums[i] > 0 && 
                nums[i] <= n && 
                nums[nums[i] - 1] != nums[i]
            ) {
                swap(nums, i, nums[i] - 1);
            }
        }

        // Step 2: Find first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positions are correct
        return n + 1;
    }

    // Helper function
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
