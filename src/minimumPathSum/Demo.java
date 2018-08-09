package minimumPathSum;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a m x n grid filled with non-negative numbers, find a path from top
	 * left to bottom right which minimizes the sum of all numbers along its path.
	 * 
	 * Note: You can only move either down or right at any point in time.
	 * 
	 * 
	 * Example:
	 * 
	 * Input: [ [1,3,1], [1,5,1], [4,2,1] ] Output: 7 Explanation: Because the path
	 * 1→3→1→1→1 minimizes the sum.
	 * 
	 * @param grid
	 * @return
	 */
	public int minPathSum(int[][] grid) {
		if (grid.length == 0 || grid == null)
			return 0;
		int x = grid.length;
		int y = grid[0].length;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (i == 0 && j == 0)
					continue;
				else if (i == 0 && j != 0)
					grid[i][j] += grid[i][j - 1];
				else if (i != 0 && j == 0)
					grid[i][j] += grid[i - 1][j];
				else
					grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
			}
		}
		return grid[x - 1][y - 1];
	}
	// public int minPathSum(int[][] grid) {
	// if(grid.length==0||grid==null)
	// return 0;
	// return pathSum(grid,0,0);
	// }
	// private int pathSum(int[][] grid,int x,int y) {
	// int sum=grid[x][y];
	// if(x==grid.length-1&&y==grid[0].length-1)
	// return sum;
	// if(x!=grid.length-1&&y!=grid[0].length-1)
	// return Math.min(sum+pathSum(grid,x+1,y),sum+pathSum(grid,x,y+1));
	// else if(x!=grid.length-1&&y==grid[0].length-1)
	// return sum+pathSum(grid,x+1,y);
	// else
	// return sum+pathSum(grid,x,y+1);
	// }
}
