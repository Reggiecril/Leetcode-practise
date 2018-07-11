package isPowerOfFour;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given an integer (signed 32 bits), write a function to check whether it is a
	 * power of 4.
	 * 
	 * Example: Given num = 16, return true. Given num = 5, return false.
	 * 
	 * Follow up: Could you solve it without loops/recursion?
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
