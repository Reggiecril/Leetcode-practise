package wordPattern;

import java.util.HashMap;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a pattern and a string str, find if str follows the same pattern.
	 * 
	 * Here follow means a full match, such that there is a bijection between a
	 * letter in pattern and a non-empty word in str.
	 * 
	 * Input: pattern = "abba", str = "dog cat cat dog" Output: true
	 * 
	 * 
	 * Input: pattern = "aaaa", str = "dog cat cat dog" Output: false
	 * 
	 * @param pattern
	 * @param str
	 * @return
	 */
	public boolean wordPattern(String pattern, String str) {
		String[] splitPattern = pattern.split("");
		String[] splitStr = str.split(" ");
		if (splitPattern.length != splitStr.length || pattern.equals("") || str.equals("") || pattern == null
				|| str == null)
			return false;
		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < pattern.length(); i++) {
			if (map.containsKey(splitPattern[i])) {
				if (!map.get(splitPattern[i]).equals(splitStr[i])) {
					return false;
				} else {
					continue;
				}
			} else if (map.containsValue(splitStr[i])) {
				return false;
			} else {
				map.put(splitPattern[i], splitStr[i]);
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.wordPattern("abba", "cat dog dog cat"));
	}

}
