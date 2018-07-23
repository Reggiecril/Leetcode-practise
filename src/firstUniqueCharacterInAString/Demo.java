package firstUniqueCharacterInAString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a string, find the first non-repeating character in it and return it's
	 * index. If it doesn't exist, return -1.
	 * 
	 * 
	 * @param s
	 * @return
	 */
	public int firstUniqChar(String s) {
		Map<Character, Boolean> map = new HashMap<Character, Boolean>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), true);
			else
				map.put(s.charAt(i), false);
		}
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)))
				return i;
		}
		return -1;

	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.firstUniqChar("loveleetcode"));
	}
}
