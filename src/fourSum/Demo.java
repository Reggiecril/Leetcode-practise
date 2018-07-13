package fourSum;

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
	 * 
	 * Given an array nums of n integers and an integer target, are there elements
	 * a, b, c, and d in nums such that a + b + c + d = target? Find all unique
	 * quadruplets in the array which gives the sum of target.
	 * 
	 * Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
	 * 
	 * A solution set is: [ [-1, 0, 0, 1], [-2, -1, 1, 2], [-2, 0, 0, 2] ]
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int left = j, middle = j + 1, right = nums.length - 1, first = i;
				while (middle < right) {
					int sum = nums[left] + nums[middle] + nums[right] + nums[first];
					if (sum == target) {
						List<Integer> newList = new ArrayList<>();
						newList.add(nums[first]);
						newList.add(nums[left]);
						newList.add(nums[middle]);
						newList.add(nums[right]);
						if (!list.contains(newList))
							list.add(newList);
						middle++;
						right--;
					} else if (sum < target) {
						middle++;
					} else {
						right--;
					}
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.fourSum(new int[] { -3, -1, 0, 2, 4, 5 }, 2));
	}
}
