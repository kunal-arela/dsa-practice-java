/**
 * Problem: Diagonal Traverse
 * Platform: LeetCode
 * Approach:
 * - Every diagonal in a matrix has the same value of (row + column).
 * - We iterate through all diagonals using k = 0 → r + c - 2.
 * - If the diagonal index is even → traverse upward.
 * - If the diagonal index is odd → traverse downward.
 *
 * Time Complexity: O((m+n) * m * n)
 * Space Complexity: O(m * n)
 */

class Solution {

    public int[] findDiagonalOrder(int[][] mat) {

        int r = mat.length;
        int c = mat[0].length;

        int[] ans = new int[r * c];
        int idx = 0;

        for (int k = 0; k <= r + c - 2; k++) {

            // Even diagonal → upward traversal
            if (k % 2 == 0) {

                for (int i = r - 1; i >= 0; i--) {
                    for (int j = 0; j < c; j++) {

                        if (i + j == k) {
                            ans[idx++] = mat[i][j];
                        }

                    }
                }

            }
            // Odd diagonal → downward traversal
            else {

                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {

                        if (i + j == k) {
                            ans[idx++] = mat[i][j];
                        }

                    }
                }

            }
        }

        return ans;
    }
}
