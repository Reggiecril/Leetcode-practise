package jumpGame;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given an array of non-negative integers, you are initially positioned at the
	 * first index of the array.
	 * 
	 * Each element in the array represents your maximum jump length at that
	 * position.
	 * 
	 * Determine if you are able to reach the last index.
	 * 
	 * 
	 * @param nums
	 * @return
	 */
	public boolean canJump(int[] nums) {
		int length = nums.length - 1;
		int index = length - 1;
		for (int i = index; i >= 0; i--) {
			if (i + nums[i] >= length)
				length = i;
		}
		return length == 0;
	}
}
