package Sqrt;

public class Demo {
	/**
	 * Implement int sqrt(int x).
	 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
     * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
     * Input: 4
	 * Output: 2
	 *@param x
	 */
	  public int mySqrt(int x) {
	        return (int)Math.sqrt(x);
	    }
	public static void main(String[] args) {
		Demo demo=new Demo();
		System.out.println(demo.mySqrt(8));
	}

}
