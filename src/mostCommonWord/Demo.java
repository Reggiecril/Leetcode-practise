package mostCommonWord;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a paragraph and a list of banned words, return the most frequent word
	 * that is not in the list of banned words. It is guaranteed there is at least
	 * one word that isn't banned, and that the answer is unique.
	 * 
	 * Words in the list of banned words are given in lowercase, and free of
	 * punctuation. Words in the paragraph are not case sensitive. The answer is in
	 * lowercase.
	 * 
	 * Example: Input: paragraph = "Bob hit a ball, the hit BALL flew far after it
	 * was hit." banned = ["hit"] Output: "ball" Explanation: "hit" occurs 3 times,
	 * but it is a banned word. "ball" occurs twice (and no other word does), so it
	 * is the most frequent non-banned word in the paragraph. Note that words in the
	 * paragraph are not case sensitive, that punctuation is ignored (even if
	 * adjacent to words, such as "ball,"), and that "hit" isn't the answer even
	 * though it occurs more because it is banned.
	 * 
	 * @param paragraph
	 * @param banned
	 * @return
	 */
	public String mostCommonWord(String paragraph, String[] banned) {
		String[] split = paragraph.replaceAll("[^A-Za-z0-9]", " ").toLowerCase().split("\\s+");
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < split.length; i++) {
			if (split[i].equals(" "))
				continue;
			if (!map.containsKey(split[i]))
				map.put(split[i], 1);
			else
				map.put(split[i], map.get(split[i]) + 1);
		}
		for (String name : banned)
			map.remove(name);
		String keyName = "";
		int count = 0;
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			if ((int) (pair.getValue()) > count) {
				keyName = pair.getKey().toString();
				count = (int) pair.getValue();
			}
			it.remove(); // avoids a ConcurrentModificationException
		}
		return keyName;
	}
}
