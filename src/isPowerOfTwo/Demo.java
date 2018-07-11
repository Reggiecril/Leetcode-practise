package isPowerOfTwo;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given an integer, write a function to determine if it is a power of two.
	 * 
	 * Input: 1 Output: true Explanation: 20 = 1
	 * 
	 * @param num
	 * @return
	 */
	public boolean isPowerOfFour(int num) {
		double num1 = Math.log10(num) / Math.log10(4);
		int num2 = (int) num1;
		if (num2 == num1)
			return true;
		else
			return false;
	}

}
