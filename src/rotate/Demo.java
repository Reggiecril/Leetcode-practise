package rotate;

public class Demo {
	/**
	 * Given an array, rotate the array to the right by k steps, where k is
	 * non-negative.
	 * 
	 * 
	 * Input: [1,2,3,4,5,6,7] and k = 3 Output: [5,6,7,1,2,3,4] Explanation: rotate
	 * 1 steps to the right: [7,1,2,3,4,5,6] rotate 2 steps to the right:
	 * [6,7,1,2,3,4,5] rotate 3 steps to the right: [5,6,7,1,2,3,4]
	 * 
	 * @param nums
	 * @param k
	 */
	public void rotate(int[] nums, int k) {
		int[] newNum = new int[k];
		if (nums == null || nums.length == 0)
			return;

		if (k > nums.length)
			k = k % nums.length;
		int length = nums.length - k;

		for (int x = 0; x < k; x++)
			newNum[x] = nums[length + x];
		for (int i = length - 1; i >= 0; i--) {
			nums[i + k] = nums[i];
		}
		for (int j = 0; j < k; j++) {
			nums[j] = newNum[j];
		}
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		demo.rotate(nums, k);
		for (int i : nums)
			System.out.println(i);
	}
}
