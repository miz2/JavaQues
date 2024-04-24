import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return ans;
        }
        
        int sr = 0, er = matrix.length - 1;
        int sc = 0, ec = matrix[0].length - 1;
        
        while (sr <= er && sc <= ec) {
            // Top boundary
            for (int j = sc; j <= ec; j++) {
                ans.add(matrix[sr][j]);
            }
            sr++;
            
            // Right boundary
            for (int i = sr; i <= er; i++) {
                ans.add(matrix[i][ec]);
            }
            ec--;
            
            // Bottom boundary
            if (sr <= er) { // Check if there are still rows left to traverse
                for (int j = ec; j >= sc; j--) {
                    ans.add(matrix[er][j]);
                }
                er--;
            }
            
            // Left boundary
            if (sc <= ec) { // Check if there are still columns left to traverse
                for (int i = er; i >= sr; i--) {
                    ans.add(matrix[i][sc]);
                }
                sc++;
            }
        }
        return ans;
    }
}

public class SpiralMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = solution.spiralOrder(matrix);
        System.out.println("Spiral Order Traversal: " + result);
    }
}
