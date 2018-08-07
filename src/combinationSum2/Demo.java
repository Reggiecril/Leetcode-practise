package combinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a collection of candidate numbers (candidates) and a target number
	 * (target), find all unique combinations in candidates where the candidate
	 * numbers sums to target.
	 * 
	 * Each number in candidates may only be used once in the combination.
	 * 
	 * Note:
	 * 
	 * All numbers (including target) will be positive integers. The solution set
	 * must not contain duplicate combinations.
	 * 
	 * Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]
	 * 
	 * @param candidates
	 * @param target
	 * @return
	 */
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(candidates);
		combination2(list, new ArrayList<>(), target, candidates, 0);
		return list;
	}

	private void combination2(List<List<Integer>> outList, List<Integer> inList, int target, int[] num, int index) {
		if (target < 0) {
			return;
		} else if (target == 0) {
			outList.add(new ArrayList<>(inList));
		} else {
			for (int i = index; i < num.length; i++) {
				if (i > index && num[i] == num[i - 1])
					continue;
				inList.add(num[i]);
				combination2(outList, inList, target - num[i], num, i + 1);
				inList.remove(inList.size() - 1);
			}
		}
	}

}
