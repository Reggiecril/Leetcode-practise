package searchA2DMatrixII;

public class Demo {
    /**
     * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
     *
     * Integers in each row are sorted in ascending from left to right.
     * Integers in each column are sorted in ascending from top to bottom.
     * Example:
     *
     * Consider the following matrix:
     *
     * [
     *   [1,   4,  7, 11, 15],
     *   [2,   5,  8, 12, 19],
     *   [3,   6,  9, 16, 22],
     *   [10, 13, 14, 17, 24],
     *   [18, 21, 23, 26, 30]
     * ]
     * Given target = 5, return true.
     *
     * Given target = 20, return false.
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
//        if(matrix.length==0||matrix[0].length==0||matrix== null)return false;
//
//        int row=matrix.length,coloumn=matrix[0].length;
//        for(int i=0;i<row;i++) {
//            if(matrix[i][coloumn-1]<target)continue;
//            else if(matrix[i][0]>target) break;
//            int start = 0, end = coloumn - 1;
//            while (start <= end) {
//                int mid = (end + start) / 2;
//                if (matrix[i][mid] < target) {
//                    start = mid + 1;
//                } else if (matrix[i][mid] > target)
//                    end = mid - 1;
//                else
//                    return true;
//            }
//        }
//        return false;
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }

        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}
