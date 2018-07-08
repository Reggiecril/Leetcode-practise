package missingNumber;

import java.util.Arrays;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
	 * the one that is missing from the array.
	 * 
	 * Input: [9,6,4,2,3,5,7,0,1] Output: 8
	 * 
	 * @param nums
	 * @return
	 */
	public int missingNumber(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		Arrays.sort(nums);
		int count = 0;
		while (count < nums.length) {
			if (count != nums[count])
				return count;
			count++;
		}
		return count;
	}
}
