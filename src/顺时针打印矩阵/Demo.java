package 顺时针打印矩阵;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12
	 * 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
	 * 
	 * @param matrix
	 * @return
	 */
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
	    LinkedList<Integer> l=new LinkedList<>();
	    
		int left = 0, right = matrix[0].length - 1, bottom = matrix.length - 1, top = 0;
		int size = matrix.length * matrix[0].length;
		while (list.size() < size) {
			for (int i = left; i <= right; i++)
				list.add(matrix[top][i]);
			top++;
			for (int i = top; i <= bottom; i++)
				list.add(matrix[i][right]);
			right--;
			for (int i = right; i >= left && list.size() < size; i--)
				list.add(matrix[bottom][i]);
			bottom--;
			for (int i = bottom; i >= top && list.size() < size; i--)
				list.add(matrix[i][left]);
			left++;
		}
		return list;
	}
}
