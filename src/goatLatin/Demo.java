package goatLatin;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * A sentence S is given, composed of words separated by spaces. Each word
	 * consists of lowercase and uppercase letters only.
	 * 
	 * We would like to convert the sentence to "Goat Latin" (a made-up language
	 * similar to Pig Latin.)
	 * 
	 * The rules of Goat Latin are as follows:
	 * 
	 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of
	 * the word. For example, the word 'apple' becomes 'applema'.
	 * 
	 * If a word begins with a consonant (i.e. not a vowel), remove the first letter
	 * and append it to the end, then add "ma". For example, the word "goat" becomes
	 * "oatgma".
	 * 
	 * Add one letter 'a' to the end of each word per its word index in the
	 * sentence, starting with 1. For example, the first word gets "a" added to the
	 * end, the second word gets "aa" added to the end and so on. Return the final
	 * sentence representing the conversion from S to Goat Latin.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: "I speak Goat Latin" Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
	 * 
	 * @param S
	 * @return
	 */
	public String toGoatLatin(String S) {
		StringBuilder sb = new StringBuilder();
		if (S.equals("") || S.equals(""))
			return "";
		String[] split = S.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (split[i].length() != 1 && Character.toLowerCase(split[i].charAt(0)) != 'a'
					&& Character.toLowerCase(split[i].charAt(0)) != 'o'
					&& Character.toLowerCase(split[i].charAt(0)) != 'u'
					&& Character.toLowerCase(split[i].charAt(0)) != 'i'
					&& Character.toLowerCase(split[i].charAt(0)) != 'e') {
				split[i] = split[i].substring(1, split[i].length()) + split[i].charAt(0);
			}
			split[i] += "ma";
			for (int j = 0; j < i + 1; j++)
				split[i] += "a";
			if (i != split.length - 1)
				sb.append(split[i] + " ");
			else
				sb.append(split[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Demo test = new Demo();
		System.out.println(test.toGoatLatin("I speak Goat Latin"));
	}
}
