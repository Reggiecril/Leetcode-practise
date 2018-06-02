package validParentheses;

public class Demo {
	/**
	 * 
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	 *An input string is valid if:
	 *Open brackets must be closed by the same type of brackets.
	 *Open brackets must be closed in the correct order.
	 *
	 *Input: "{[]}"
	 *Output: true
	 * @param s
	 * @return
	 */
	 public boolean isValid(String s) {
	       String a = s;
			for (int i = 0; i < s.length(); i++) {
				a = a.replace("[]", "");
				a = a.replace("()", "");
				a = a.replace("{}", "");
			}

			if (a.isEmpty())
				return true;
			else
				return false;

	    }
	
	public static void main(String []args) {
		Demo demo=new Demo();
		demo.isValid("");
	}
}
