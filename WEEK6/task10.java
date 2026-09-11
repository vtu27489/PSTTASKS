import java.io.*;
import java.util.*;

public class Solution {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();
        
        // Convert the List of Lists to a 2D primitive array for faster indexing
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = matrix.get(i).get(j);
            }
        }

        // Determine how many layers (rings) exist
        int numLayers = Math.min(m, n) / 2;

        for (int layer = 0; layer < numLayers; layer++) {
            List<Integer> ring = new ArrayList<>();

            // 1. Gather elements from the current ring in anti-clockwise order
            // Top row (left to right)
            for (int j = layer; j < n - layer; j++) {
                ring.add(mat[layer][j]);
            }
            // Right column (top to bottom, skipping corner)
            for (int i = layer + 1; i < m - layer; i++) {
                ring.add(mat[i][n - 1 - layer]);
            }
            // Bottom row (right to left, skipping corner)
            for (int j = n - 2 - layer; j >= layer; j--) {
                ring.add(mat[m - 1 - layer][j]);
            }
            // Left column (bottom to top, skipping corners)
            for (int i = m - 2 - layer; i > layer; i--) {
                ring.add(mat[i][layer]);
            }

            int size = ring.size();
            // Effective rotations needed for this specific ring
            int effectiveRotation = r % size; 

            // 2. Put the elements back into the 2D matrix shifted by effectiveRotation
            int index = effectiveRotation;

            // Top row
            for (int j = layer; j < n - layer; j++) {
                mat[layer][j] = ring.get(index);
                index = (index + 1) % size;
            }
            // Right column
            for (int i = layer + 1; i < m - layer; i++) {
                mat[i][n - 1 - layer] = ring.get(index);
                index = (index + 1) % size;
            }
            // Bottom row
            for (int j = n - 2 - layer; j >= layer; j--) {
                mat[m - 1 - layer][j] = ring.get(index);
                index = (index + 1) % size;
            }
            // Left column
            for (int i = m - 2 - layer; i > layer; i--) {
                mat[i][layer] = ring.get(index);
                index = (index + 1) % size;
            }
        }

        // 3. Print the final rotated matrix
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(mat[i][j]);
                if (j < n - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);
        int n = Integer.parseInt(firstMultipleInput[1]);
        int r = Integer.parseInt(firstMultipleInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] matrixRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> matrixRowItems = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                matrixRowItems.add(Integer.parseInt(matrixRowTempItems[j]));
            }
            matrix.add(matrixRowItems);
        }

        matrixRotation(matrix, r);
        bufferedReader.close();
    }
}


output
  Input (stdin)
4 4 1
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Your Output (stdout)
2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15
Expected Output
2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15
