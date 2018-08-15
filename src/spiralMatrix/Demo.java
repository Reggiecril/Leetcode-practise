package spiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    /**
     * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
     *
     * Input:
     * [
     *  [ 1, 2, 3 ],
     *  [ 4, 5, 6 ],
     *  [ 7, 8, 9 ]
     * ]
     * Output: [1,2,3,6,9,8,7,4,5]
     *
     *
     * Input:
     * [
     *   [1, 2, 3, 4],
     *   [5, 6, 7, 8],
     *   [9,10,11,12]
     * ]
     * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
     *
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        if(matrix==null)return list;
        int xAxix=matrix[0].length-1,yAxix=matrix.length-1;
        int top=0,left=0,right=xAxix,bottom=yAxix;
        while(left<=right&&top<=bottom){
            for(int i=left;i<=right;i++)
                list.add(matrix[top][i]);
            top++;
            for(int i=top;i<=bottom;i++)
                list.add(matrix[i][right]);
            right--;
            for(int i=right;i>=left&&top<=bottom;i--)
                list.add(matrix[bottom][i]);
            bottom--;
            for(int i=bottom;i>=top&&left<=right;i--)
                list.add(matrix[i][left]);
            left++;
        }
        return list;
    }
}
