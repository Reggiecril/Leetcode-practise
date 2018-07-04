package singleNumber;

public class Demo {
	/**
	 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
	 * Input: [2,2,1]
	 * Output: 1
	 * @param nums
	 * @return
	 */
	 public int singleNumber(int[] nums) {
	        int a=0;
	        for(int i:nums)
	            a=a^i;
	        return a;
	    }
}
