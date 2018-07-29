package buddyStrings;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given two strings A and B of lowercase letters, return true if and only if we
	 * can swap two letters in A so that the result equals B.
	 * 
	 * 
	 * Input: A = "ab", B = "ba" Output: true
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public boolean buddyStrings(String A, String B) {
		if (A.length() != B.length())
			return false;
		if (A.equals(B)) {
			Set<Character> s = new HashSet<Character>();
			for (char c : A.toCharArray())
				s.add(c);
			return s.size() < A.length();
		}
		int first = Integer.MIN_VALUE, last = 0, i = 0;
		while (i < A.length()) {
			if (A.charAt(i) != B.charAt(i)) {
				if (first == Integer.MIN_VALUE)
					first = i;
				else if (last == 0)
					last = i;
				else
					return false;
			}
			i++;
		}
		return A.charAt(first) == B.charAt(last) && A.charAt(last) == B.charAt(first);
	}
}
