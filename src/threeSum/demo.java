package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author reggie
 *
 */
public class demo {
	/**
	 * 
	 * Given an array nums of n integers, are there elements a, b, c in nums such
	 * that a + b + c = 0? Find all unique triplets in the array which gives the sum
	 * of zero.
	 * 
	 * Given array nums = [-1, 0, 1, 2, -1, -4],
	 * 
	 * A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]
	 * 
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> lastList = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int left = i + 1, right = nums.length - 1, target = i;
			while (left < right) {
				if (nums[left] + nums[right] + nums[target] == 0) {
					List<Integer> firstList = new ArrayList<Integer>();
					firstList.add(nums[target]);
					firstList.add(nums[left]);
					firstList.add(nums[right]);
					lastList.add(firstList);

					while (left < right && nums[left] == nums[left + 1])
						left++;
					while (left < right && nums[right] == nums[right - 1])
						right--;

					left++;
					right--;
				} else if (nums[left] + nums[right] + target < 0) {
					left++;
				} else {
					right--;
				}
			}
		}

	// List<List<Integer>> lastList = new ArrayList<List<Integer>>();
	// for (int i = 0; i < nums.length; i++) {
	// for (int j = i + 1; j < nums.length; j++) {
	// for (int k = j + 1; k < nums.length; k++) {
	// if (nums[i] + nums[j] + nums[k] == 0) {
	// List<Integer> firstList = new ArrayList<Integer>();
	// firstList.add(nums[i]);
	// firstList.add(nums[j]);
	// firstList.add(nums[k]);
	// Collections.sort(firstList);
	// if (!lastList.contains(firstList))
	// lastList.add(firstList);
	// }
	// }
	// }
	// }
	return lastList;

	}

	public static void main(String[] args) {

		demo d = new demo();
		int[] nums = { 1,-1,-1,0 };
		d.threeSum(nums);

		for (int i = 0; i < d.threeSum(nums).size(); i++)
			System.out.println(d.threeSum(nums).get(i).toString());

	}
}
