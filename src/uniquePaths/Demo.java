package uniquePaths;

public class Demo {
    //    	public int uniquePaths(int m, int n) {
//		if(m<1||n<1)return 0;
//		else if(m==1&&n==1)return 1;
//		else
//			return uniquePaths(m-1,n)+uniquePaths(m,n-1);
//
//	}

    /**
     * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
     * <p>
     * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: m = 3, n = 2
     * Output: 3
     * Explanation:
     * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
     * 1. Right -> Right -> Down
     * 2. Right -> Down -> Right
     * 3. Down -> Right -> Right
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 1; i < m; i++)
            matrix[i][0] = 1;
        for (int i = 1; i < n; i++)
            matrix[0][i] = 1;
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
        return matrix[m - 1][n - 1];
    }
}
