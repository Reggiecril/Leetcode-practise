package saerchA2DMatrix;

public class Demo {
    /**
     * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
     *
     * Integers in each row are sorted from left to right.
     * The first integer of each row is greater than the last integer of the previous row.
     * Example 1:
     *
     * Input:
     * matrix = [
     *   [1,   3,  5,  7],
     *   [10, 11, 16, 20],
     *   [23, 30, 34, 50]
     * ]
     * target = 3
     * Output: true
     * Example 2:
     *
     * Input:
     * matrix = [
     *   [1,   3,  5,  7],
     *   [10, 11, 16, 20],
     *   [23, 30, 34, 50]
     * ]
     * target = 13
     * Output: false
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0||matrix== null)return false;
        int row=matrix.length,coloumn=matrix[0].length;
        int start =0,end =row*coloumn-1;
        while(start<=end){
            int mid=(end+start)/2;
            int r=mid/coloumn,n=mid%coloumn;
            if(matrix[r][n]<target){
                start=mid+1;
            }else if(matrix[r][n]>target)
                end=mid-1;
            else
                return true;
        }
        return false;

    }
}
