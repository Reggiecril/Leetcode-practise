package convertToTitle;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 
	 * Given a positive integer, return its corresponding column title as appear in
	 * an Excel sheet. 
	 * 
	 * Input: 1 
	 * Output: "A"
	 * 
	 * Input: 701 
	 * Output: "ZY"
	 * 
	 * @param n
	 * @return
	 */
	public String convertToTitle(int n) {
		char[] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		StringBuffer sb = new StringBuffer();
		while (n > 0) {
			n--;

			sb.append(arr[n % 26]);
			n = n / 26;

		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.convertToTitle(701));
	}

}
