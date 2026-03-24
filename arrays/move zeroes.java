/**
 * LeetCode 283 - Move Zeroes
 *
 * Approach: Single-pass two-pointer swap
 * - `slow` tracks the position for the next non-zero element
 * - When a non-zero is found at `fast`, swap with `slow`
 * - All elements before `slow` are non-zero (order preserved)
 * - All elements from `slow` onward are zero
 *
 * Time Complexity  : O(n) — single pass
 * Space Complexity : O(1) — in-place, no auxiliary space
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                // Avoid unnecessary self-swaps when no zeroes seen yet
                if (slow != fast) {
                    int temp = nums[slow];
                    nums[slow] = nums[fast];
                    nums[fast] = temp;
                }
                slow++;
            }
        }
    }
}
