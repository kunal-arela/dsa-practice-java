/*
Problem: Set Matrix Zeroes
Platform: LeetCode
Link: https://leetcode.com/problems/set-matrix-zeroes/

Approach:
1. Traverse the matrix and store the rows and columns that contain zero.
2. Use two auxiliary arrays:
      row[] -> marks rows that should become zero
      col[] -> marks columns that should become zero
3. Traverse the matrix again and set matrix[i][j] = 0
   if row[i] == 1 or col[j] == 1.

Time Complexity: O(m × n)
Space Complexity: O(m + n)

Author: Kunal
*/

class Solution {
    public void setZeroes(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        // Arrays to mark rows and columns that must be zeroed
        int[] row = new int[r];
        int[] col = new int[c];

        // Step 1: Mark rows and columns that contain zero
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Step 2: Update matrix based on marked rows and columns
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
