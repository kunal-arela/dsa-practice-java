/**
 * LeetCode 33 - Search in Rotated Sorted Array
 *
 * Problem:
 * Given a rotated sorted array and a target value,
 * return the index of the target if it exists in the array.
 * Otherwise, return -1.
 *
 * Constraint:
 * The algorithm must run in O(log n) time.
 *
 * Approach:
 * Use Binary Search.
 * In every iteration, one half of the array will always be sorted.
 * Check which half is sorted and decide where the target lies.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {

                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } 
            // Right half is sorted
            else {

                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

            }
        }

        return -1;
    }
}
