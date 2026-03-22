/**
 * Problem: Climbing Stairs
 * -------------------------------------
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 step or 2 steps.
 * Find the number of distinct ways to reach the top.
 *
 * Approach:
 * This follows the Fibonacci pattern:
 * ways(n) = ways(n-1) + ways(n-2)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ClimbingStairs {

    public static int climbStairs(int n) {
        // Base cases
        if (n <= 2) {
            return n;
        }

        int prev1 = 1; // ways to reach step 1
        int prev2 = 2; // ways to reach step 2

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return prev2;
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 5;
        int result = climbStairs(n);
        System.out.println("Number of ways to climb " + n + " steps: " + result);
    }
}
