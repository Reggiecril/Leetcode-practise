package maximumSubarray;

import java.util.Arrays;

public class Demo {
	/**
	 * 
	 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
	 * @param nums
	 * @return
	 */
	public int maxSubArray(int[] nums) {
		int subLength = 0;
		if (nums.length % 2 == 0) {
			subLength = nums.length / 2;
		} else if(nums.length==1){
			subLength=nums.length;
			return nums[1];
		}else {
			subLength = (nums.length - 1) / 2;
		}
		int total = 0;
		for (int x = 0; x < nums.length - subLength; x++) {
			int singal = 0;
			for (int i = 0; i < subLength; i++) {
				singal += nums[x+i];
			}
			if(total<=singal) {
				total=singal;
			}else {
				continue;
			}
		}


		return total;

	}

	public static void main(String[] args) {
		Demo demo = new Demo();

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(demo.maxSubArray(nums));
	}

}
