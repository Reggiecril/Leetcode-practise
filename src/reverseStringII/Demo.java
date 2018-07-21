package reverseStringII;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a string and an integer k, you need to reverse the first k characters
	 * for every 2k characters counting from the start of the string. If there are
	 * less than k characters left, reverse all of them. If there are less than 2k
	 * but greater than or equal to k characters, then reverse the first k
	 * characters and left the other as original.
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
	public String reverseStr(String s, int k) {
		String string = "";
		int length = s.length();
		for (int i = 0; i < length; i += k) {
			int len = k;
			if (s.length() < k)
				len = s.length();
			StringBuilder sb = new StringBuilder();
			if ((i / k) % 2 == 0) {
				sb.append(s.substring(0, len));
				string += sb.reverse().toString();
				s = s.substring(len);
			} else {
				string += s.substring(0, len);
				s = s.substring(len);
			}
		}
		return string;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.print(demo.reverseStr("abcdefg", 4));
	}
}
