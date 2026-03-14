/**
 * Problem: Single Number
 * Platform: LeetCode 136
 *
 * Given a non-empty array of integers where every element appears twice
 * except for one, find that single one.
 *
 * Approach:
 * Use XOR operation.
 * - a ^ a = 0
 * - a ^ 0 = a
 * Duplicate numbers cancel out, leaving the unique number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int singleNumber(int[] nums) {
        int result = 0;

        // XOR all elements
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

}
