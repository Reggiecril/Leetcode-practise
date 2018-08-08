package multiplyStrings;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given two non-negative integers num1 and num2 represented as strings, return
	 * the product of num1 and num2, also represented as a string.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: num1 = "2", num2 = "3" Output: "6" Example 2:
	 * 
	 * Input: num1 = "123", num2 = "456" Output: "56088"
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public String multiply(String num1, String num2) {
		int[] num = new int[num1.length() + num2.length()];
		for (int i = num1.length() - 1; i >= 0; i--) {
			for (int j = num2.length() - 1; j >= 0; j--) {
				int add = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int p1 = i + j, p2 = i + j + 1;
				int sum = add + num[p2];
				num[p1] += sum / 10;
				num[p2] = sum % 10;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i : num)
			if (!(sb.length() == 0 && i == 0))
				sb.append(i);
		return sb.length() == 0 ? "0" : sb.toString();

	}
}
