package majorityElement;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given an array of size n, find the majority element. The majority element is
	 * the element that appears more than ⌊ n/2 ⌋ times.
	 * 
	 * You may assume that the array is non-empty and the majority element always
	 * exist in the array.
	 * 
	 * Input: [2,2,1,1,1,2,2] Output: 2
	 * 
	 * 
	 * 
	 * 
	 * @param nums
	 * @return
	 */

	public int majorityElement(int[] nums) {
		//because the majority element has more then half length of array
		//use count to record.
		//when duplicate number, count +=1
		//when different number, count-=1
		//when count==0;means different number = duplicate
		int major = nums[0], count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (count == 0)
				major = nums[i];
			if (nums[i] == major)
				++count;
			else
				--count;
		}
		return major;
		
		//Arrays.sort(nums);
		//return nums[nums.length/2];
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		int[] nums = new int[] { 2, 5, 3, 5, 5, 4, 5, 5, 6, 5, 8, 5, 9, 5, 2, 5, 2, 5, 4, 3 };
		System.out.println(demo.majorityElement(nums));
	}

}
