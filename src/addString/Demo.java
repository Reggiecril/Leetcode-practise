package addString;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given two non-negative integers num1 and num2 represented as string, return
	 * the sum of num1 and num2.
	 * 
	 * Note:
	 * 
	 * The length of both num1 and num2 is < 5100. Both num1 and num2 contains only
	 * digits 0-9. Both num1 and num2 does not contain any leading zero. You must
	 * not use any built-in BigInteger library or convert the inputs to integer
	 * directly.
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String addStrings(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		int more = 0;
		for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || more == 1; i--, j--) {
			int numberI = i >= 0 ? num1.charAt(i) - '0' : 0;
			int numberJ = j >= 0 ? num2.charAt(j) - '0' : 0;
			sb.append((numberI + numberJ + more) % 10);
			more = (numberI + numberJ + more) / 10;
		}
		return sb.reverse().toString();
	}
}
