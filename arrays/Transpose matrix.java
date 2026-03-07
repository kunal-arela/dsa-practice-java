/*
LeetCode: 867. Transpose Matrix

Approach:
1. Get number of rows and columns.
2. Create a new matrix with dimensions [cols][rows].
3. Swap indices: result[col][row] = matrix[row][col].

Time Complexity: O(rows * cols)
Space Complexity: O(rows * cols)
*/

class Solution {

    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create result matrix with swapped dimensions
        int[][] result = new int[cols][rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                // Swap row and column
                result[col][row] = matrix[row][col];

            }
        }

        return result;
    }
}
