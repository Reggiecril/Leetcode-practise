package lengthOfLongestSubstring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 性能很低
	 * Given a string, find the length of the longest substring without repeating
	 * characters.
	 * 
	 * Examples:
	 * 
	 * Given "abcabcbb", the answer is "abc", which the length is 3.
	 * 
	 * Given "bbbbb", the answer is "b", with the length of 1.
	 * 
	 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the
	 * answer must be a substring, "pwke" is a subsequence and not a substring.
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
		String origin = "";
		String string = "";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {

			if (!map.containsKey(s.charAt(i))) {
				string += s.charAt(i);
				map.put(s.charAt(i), i);
				if (string.length() > origin.length())
					origin = string;
			} else {
				string = new String("");
				i = map.get(s.charAt(i)) + 1;
				map = new HashMap<>();
				string += s.charAt(i);
				map.put(s.charAt(i), i);

			}
		}
		return origin.length();
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.lengthOfLongestSubstring("dvdf"));
	}
}
