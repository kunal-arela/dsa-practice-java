/*
 * Problem: Sorted Squares of a Sorted Array
 * LeetCode: https://leetcode.com/problems/squares-of-a-sorted-array/
 *
 * Approach:
 * 1. Square each element in the array
 * 2. Sort the array
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        // Step 1: Square each element
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Step 2: Sort the array
        Arrays.sort(nums);

        return nums;
    }
}
