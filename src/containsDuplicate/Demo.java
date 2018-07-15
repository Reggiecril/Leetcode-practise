package containsDuplicate;

import java.util.Arrays;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given an array of integers, find if the array contains any duplicates.
	 * 
	 * Your function should return true if any value appears at least twice in the
	 * array, and it should return false if every element is distinct.
	 * 
	 * Input: [1,1,1,3,3,4,3,2,4,2] Output: true
	 * 
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicate(int[] nums) {
		if (nums.length == 0 || nums == null)
			return false;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}
}
