/*
LeetCode 48 - Rotate Image

Problem:
Rotate an n x n 2D matrix by 90 degrees clockwise.

Approach:
1. Create a new matrix 'ans'.
2. Place each element of the original matrix into its rotated position.
3. Copy the rotated matrix back to the original matrix.

Rotation Formula:
ans[j][n - 1 - i] = matrix[i][j]

Time Complexity: O(n^2)
Space Complexity: O(n^2)

Author: Kunal
*/

class Solution {
    public void rotate(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        int[][] ans = new int[r][c];

        // Rotate matrix
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                ans[j][r - 1 - i] = matrix[i][j];
            }
        }

        // Copy back to original matrix
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
}
