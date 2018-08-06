package spiralMatrixII;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a positive integer n, generate a square matrix filled with elements
	 * from 1 to n2 in spiral order.
	 * 
	 * Input: 3
Output:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
	 * 
	 * @param n
	 * @return
	 */
	public int[][] generateMatrix(int n) {
		int[][] num = new int[n][n];
		int left = 0, top = 0;
		int right = n - 1, bottom = n - 1;
		int count = 0;
		while (left <= right) {
			for (int i = left; i <= right; i++)
				num[top][i] = ++count;
			top++;
			for (int i = top; i <= bottom; i++)
				num[i][right] = ++count;
			right--;
			for (int i = right; i >= left; i--)
				num[bottom][i] = ++count;
			bottom--;
			for (int i = bottom; i >= top; i--)
				num[i][left] = ++count;
			left++;
		}
		// for(int []number:num)
		// System.out.println(Arrays.toString(number));
		return num;
	}
}
