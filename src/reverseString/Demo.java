package reverseString;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 
	 * Write a function that takes a string as input and returns the string
	 * reversed.
	 * 
	 * Given s = "hello", return "olleh".


	 * @param s
	 * @return
	 */
	public String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);

		return sb.reverse().toString();
	}
}
