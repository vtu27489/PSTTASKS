class Solution {
    public int[][] transpose(int[][] matrix) {
        // Get the dimensions of the original matrix
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Create a new matrix with swapped dimensions
        int[][] transposed = new int[n][m];
        
        // Fill the new matrix by switching row and column indices
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        
        return transposed;
    }
}
output
  case 1:
Input
matrix =
[[1,2,3],[4,5,6],[7,8,9]]
Output
[[1,4,7],[2,5,8],[3,6,9]]
Expected
[[1,4,7],[2,5,8],[3,6,9]]

  case2:
  Input
matrix =
[[1,2,3],[4,5,6]]
Output
[[1,4],[2,5],[3,6]]
Expected
[[1,4],[2,5],[3,6]]
