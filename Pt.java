

class Solution {
    public static int[][] pascalTriangle(int N) {
        int[][] ans = new int[N][];
        for (int row = 0; row < N; row++) {
            ans[row] = new int[row + 1];
            for (int col = 0; col <= row; col++) {
                ans[row][col] = nCr(row, col);
            }
        }
        
        return ans;
    }
    
    static int nCr(int n, int r) {
        long res = 1;
        
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        
        return (int) res;
    }
}

public class Pt {
    public static void main(String[] args) {
        int N = 5; // Or any other value you want to test with
        int[][] pascal = Solution.pascalTriangle(N);
        
        // Printing the Pascal's Triangle
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
