package combinationSum;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a set of candidate numbers (candidates) (without duplicates) and a
	 * target number (target), find all unique combinations in candidates where the
	 * candidate numbers sums to target.
	 * 
	 * The same repeated number may be chosen from candidates unlimited number of
	 * times.
	 * 
	 * Note:
	 * 
	 * All numbers (including target) will be positive integers. The solution set
	 * must not contain duplicate combinations.
	 * 
	 * Example 1:

Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
Example 2:

Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
	 * 
	 * @param candidates
	 * @param target
	 * @return
	 */
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> outList = new ArrayList<>();
		combination(candidates, 0, target, new ArrayList<>(), outList);

		return outList;
	}

	private void combination(int[] num, int start, int target, List<Integer> inList, List<List<Integer>> outList) {

		if (target < 0) {
			return;
		} else if (target == 0) {
			outList.add(new ArrayList<>(inList));
		} else {
			for (int i = start; i < num.length; i++) {
				inList.add(num[i]);
				combination(num, i, target - num[i], inList, outList);
				inList.remove(inList.size() - 1);
			}
		}

	}
}
