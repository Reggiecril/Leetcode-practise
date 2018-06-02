package searchInsertPosition;

public class Demo {
	/**
	 * 
	 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
	 * Input: [1,3,5,6], 5
	 * Output: 2
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchInsert(int[] nums, int target) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			try {

				if (nums[i] < target && target <= nums[i + 1]) {
					j = i+1;
					break;
				} else {
					continue;
				}
			} catch (Exception e) {
				return nums.length;
			}
		}
		return j;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		int[] nums = { 1, 3, 5, 6 };
		System.out.println(demo.searchInsert(nums, 7));
	}

}
