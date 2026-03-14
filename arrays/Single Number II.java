/**
 * Problem: Single Number II
 * Platform: LeetCode 137
 *
 * Given an integer array where every element appears three times
 * except for one element that appears once, find that single one.
 *
 * Approach:
 * Count bits at each position (0–31).
 * If the count of set bits % 3 != 0, that bit belongs to the single number.
 *
 * Time Complexity: O(32 * n) ≈ O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int singleNumber(int[] nums) {

        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;

            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    sum++;
                }
            }

            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
