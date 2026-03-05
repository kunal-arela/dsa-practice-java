/*
Problem: Search Insert Position
Platform: LeetCode
Language: Java

Description:
Given a sorted array of distinct integers and a target value,
return the index if the target is found.
If not found, return the index where it would be inserted
to keep the array sorted.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int searchInsert(int[] nums, int target) {

        // Check if target already exists in the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        // Find the correct insert position
        for (int j = 0; j < nums.length; j++) {

            // If target is greater than the last element
            if (target > nums[nums.length - 1]) {
                return nums.length;
            }

            // If target should be inserted before current element
            else if (target < nums[j]) {
                return j;
            }
        }

        return -1;
    }
}
