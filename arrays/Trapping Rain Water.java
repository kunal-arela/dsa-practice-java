/*
Problem: Trapping Rain Water
Platform: LeetCode
Link: https://leetcode.com/problems/trapping-rain-water/

Approach:
1. For each index, the amount of trapped water depends on:
      min(max height on left, max height on right) - current height
2. Precompute:
      left[i]  = maximum height from start to index i
      right[i] = maximum height from end to index i
3. Water stored at index i:
      min(left[i], right[i]) - height[i]

Time Complexity: O(n)
Space Complexity: O(n)

Author: Kunal
*/

class Solution {

    public int trap(int[] height) {

        int n = height.length;
        int water = 0;

        // Array to store maximum height from the left
        int[] left = new int[n];
        left[0] = height[0];

        // Array to store maximum height from the right
        int[] right = new int[n];
        right[n - 1] = height[n - 1];

        // Fill left max array
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        // Fill right max array
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        // Calculate trapped water
        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - height[i];
        }

        return water;
    }
}
