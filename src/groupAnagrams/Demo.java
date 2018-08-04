package groupAnagrams;

import java.util.Arrays;
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
	 * Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
	 * @param strs
	 * @return
	 */
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> list=new LinkedList<>();
        if (strs == null || strs.length == 0) return list;

		HashMap<String,List<String>> map=new HashMap<>();
		for(String name:strs) {
			char[]ch=name.toCharArray();
			Arrays.sort(ch);
			String value=String.valueOf(ch);
			if(!map.containsKey(value)) {
				map.put(value,new LinkedList<>());
			}
			map.get(value).add(name);
		}
		return new LinkedList<List<String>>(map.values());
	}
}
