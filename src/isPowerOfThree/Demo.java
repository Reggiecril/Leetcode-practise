package isPowerOfThree;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given an integer, write a function to determine if it is a power of three.
	 * Input: 27 Output: true
	 * 
	 * Input: 9 Output: true
	 * 
	 * @param n
	 * @return
	 */
	public boolean isPowerOfThree(int n) {
		double num1 = Math.log10(n) / Math.log10(3);
		int num2 = (int) num1;
		if (num2 == num1)
			return true;
		else
			return false;
	}
	public static void main(String []args) {
		Demo demo=new Demo();
		System.out.println(demo.isPowerOfThree(243));
	}
}
