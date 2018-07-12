package threeSumClosest;

import java.util.Arrays;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given an array nums of n integers and an integer target, find three integers
	 * in nums such that the sum is closest to target. Return the sum of the three
	 * integers. You may assume that each input would have exactly one solution.
	 * 
	 * 
	 * Given array nums = [-1, 2, 1, -4], and target = 1.
	 * 
	 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int threeSumClosest(int[] nums, int target) {
		if (nums.length == 0 || nums == null)
			return 0;
		int closest = 128;
		int count = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int left = i + 1, right = nums.length - 1, first = i;
			while (left < right) {
				int sum = nums[left] + nums[right] + nums[first];
				if (sum == target) {
					return target;
				} else if (sum < target) {
					left++;
				} else {
					right--;
				}
				if (count == 0) {
					closest = sum;
					count++;
				} else {
					if (Math.abs(sum - target) < Math.abs(closest - target))
						closest = sum;
				}
			}
		}
		return closest;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
	}
}
