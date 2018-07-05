package factorialTrailingZeros;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 
	 * Given an integer n, return the number of trailing zeroes in n!. Input: 5
	 * Output: 1 Explanation: 5! = 120, one trailing zero.
	 * 
	 * 后缀0总是由质因子2和质因子5相乘得来的。如果我们可以计数2和5的个数，问题就解决了。
	 * 
	 * n = 5: 5!的质因子中 (2 * 2 * 2 * 3 * 5)包含一个5和三个2。因而后缀0的个数是1。
	 * 
	 * n = 11: 11!的质因子中(2^8 * 3^4 * 5^2 * 7)包含两个5和三个2。于是后缀0的个数就是2。
	 * 
	 * 需要考虑25,125这些由几个5相乘
	 * @param n
	 * @return
	 */
	public int trailingZeroes(int n) {
		int total = n;

		for (int i = n - 1; i > 1; i++)
			total = total * n;

		System.out.println("total:" + total);
		if (n >= 5)
			return n / 5 + trailingZeroes(n / 5);
		return 0;

	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.trailingZeroes(13));
	}

}
