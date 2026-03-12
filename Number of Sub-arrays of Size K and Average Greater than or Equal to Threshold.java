/*
LeetCode 1343
Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

Approach:
Sliding Window

Instead of computing the average repeatedly, we compare:
sum >= k * threshold

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int count = 0;
        int sum = 0;
        int target = k * threshold;

        // first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= target) {
            count++;
        }

        // sliding window
        for (int i = k; i < arr.length; i++) {

            sum += arr[i];
            sum -= arr[i - k];

            if (sum >= target) {
                count++;
            }
        }

        return count;
    }
}
