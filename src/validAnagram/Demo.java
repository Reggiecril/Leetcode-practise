package validAnagram;

import java.util.Arrays;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given two strings s and t , write a function to determine if t is an anagram
	 * of s.
	 * 
	 * Input: s = "anagram", t = "nagaram" Output: true
	 * 
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram(String s, String t) {
		String[] splitS = s.split("");
		String[] splitT = t.split("");
		Arrays.sort(splitS);
		Arrays.sort(splitT);
		if (splitS.length != splitT.length)
			return false;
		else {
			for (int i = 0; i < splitS.length; i++) {
				if (!splitS[i].equals(splitT[i]))
					return false;
			}
			return true;
		}

	}

	public static void main(String[] args) {
		Demo demo=new Demo();
		System.out.println(demo.isAnagram("asdf", "fdsa"));
	}

}
