package rotateImage;

import java.util.Arrays;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * You are given an n x n 2D matrix representing an image.
	 * 
	 * Rotate the image by 90 degrees (clockwise).
	 * 
	 * Note:
	 * 
	 * You have to rotate the image in-place, which means you have to modify the
	 * input 2D matrix directly. DO NOT allocate another 2D matrix and do the
	 * rotation.
	 * 
	 * @param matrix
	 */
	public void rotate(int[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return;
		int length = matrix.length;
		for (int i = length - 1, j = 0; i >= 0 || j < length; i--, j++) {
			if (j >= i)
				break;
			int[] temp = matrix[i];
			matrix[i] = matrix[j];
			matrix[j] = temp;
		}
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int[] num : matrix)
			System.out.println(Arrays.toString(num));
	}
}
