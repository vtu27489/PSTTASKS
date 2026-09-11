class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        
        // 1. Create a 2D prefix sum matrix with size (m + 1) x (n + 1)
        int[][] prefixSum = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefixSum[i + 1][j + 1] = mat[i][j] 
                                        + prefixSum[i][j + 1] 
                                        + prefixSum[i + 1][j] 
                                        - prefixSum[i][j];
            }
        }
        
        // 2. Calculate the block sum for each element
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Define the boundary coordinates, making sure they stay within bounds
                int r1 = Math.max(0, i - k);
                int c1 = Math.max(0, j - k);
                int r2 = Math.min(m - 1, i + k);
                int c2 = Math.min(n - 1, j + k);
                
                // Use the 2D prefix sum formula to calculate the submatrix sum in O(1)
                ans[i][j] = prefixSum[r2 + 1][c2 + 1] 
                          - prefixSum[r1][c2 + 1] 
                          - prefixSum[r2 + 1][c1] 
                          + prefixSum[r1][c1];
            }
        }
        
        return ans;
    }
}


output:
case 1:
Input
mat =
[[1,2,3],[4,5,6],[7,8,9]]
k =
1
Output
[[12,21,16],[27,45,33],[24,39,28]]
Expected
[[12,21,16],[27,45,33],[24,39,28]]

  case2:
  Input
mat =
[[1,2,3],[4,5,6],[7,8,9]]
k =
2
Output
[[45,45,45],[45,45,45],[45,45,45]]
Expected
[[45,45,45],[45,45,45],[45,45,45]]

