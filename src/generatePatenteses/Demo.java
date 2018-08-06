package generatePatenteses;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given n pairs of parentheses, write a function to generate all combinations
	 * of well-formed parentheses.
	 * 
	 * For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
	 * @param n
	 * @return
	 */
	public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		back(list, "", 0, 0, n);
		return list;
	}

	private void back(List<String> list, String string, int start, int end, int n) {
		if (string.length() == n * 2) {
			list.add(string);
			return;
		}
		if (start < n)
			back(list, string + "(", start + 1, end, n);
		if (end < start)
			back(list, string + ")", start, end + 1, n);
	}
}
