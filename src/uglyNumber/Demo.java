package uglyNumber;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Write a program to check whether a given number is an ugly number.
	 * 
	 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * 
	 * Input: 8 Output: true Explanation: 8 = 2 × 2 × 2
	 * 
	 * @param num
	 * @return
	 */
	public boolean isUgly(int num) {
		if (num < 1)
			return false;
		while (num > 1) {
			if ((num % 2) == 0) {
				num = num / 2;
			} else if ((num % 3) == 0) {
				num = num / 3;
			} else if ((num % 5) == 0) {
				num = num / 5;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
