package uniquePathII;

/**
 * @author reggie
 */
public class Demo {
    /**
     * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
     *
     * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
     *
     * Now consider if some obstacles are added to the grids. How many unique paths would there be?
     *
     * Input:
     * [
     *   [0,0,0],
     *   [0,1,0],
     *   [0,0,0]
     * ]
     * Output: 2
     * Explanation:
     * There is one obstacle in the middle of the 3x3 grid above.
     * There are two ways to reach the bottom-right corner:
     * 1. Right -> Right -> Down -> Down
     * 2. Down -> Down -> Right -> Right
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null||obstacleGrid.length==0||obstacleGrid[0].length==0)return 0;
        int length =obstacleGrid[0].length;
        int []road=new int[length];
        road[0]=1;
        for(int []row:obstacleGrid){
            for(int i=0;i<row.length;i++){
                if(row[i]==1)
                    road[i]=0;
                else if(i>0)
                    road[i]+=road[i-1];
            }
        }
        return road[length-1];

    }
}
