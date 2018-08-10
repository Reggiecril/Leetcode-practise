package letterCombinationsOfAPhoneNumber;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a string containing digits from 2-9 inclusive, return all possible
	 * letter combinations that the number could represent.
	 * 
	 * A mapping of digit to letters (just like on the telephone buttons) is given
	 * below. Note that 1 does not map to any letters.
	 * 
	 * Input: "23" Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
	 * 
	 * @param digits
	 * @return
	 */
	public List<String> letterCombinations(String digits) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "1");
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		//create queue
		LinkedList<String> list = new LinkedList<>();
		//when digits empty
		if (digits.isEmpty())
			return list;
		list.add("");
		//loop digits
		for (int i = 0; i < digits.length(); i++) {
			//get every single number
			int index = Character.getNumericValue(digits.charAt(i));
			//loop queue, mix all element with the string of that singal number, then remove original element.
			while (list.peek().length() == i) {
				String cur = list.remove();
				for (char ch : map.get(index).toCharArray())
					list.add(cur + ch);
			}
		}
		return list;

	}
}
