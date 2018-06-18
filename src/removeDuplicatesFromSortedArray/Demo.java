package removeDuplicatesFromSortedArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
	
	/**
	 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
	 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
	 * 
	 * Given nums = [1,1,2],
	 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
	 * It doesn't matter what you leave beyond the returned length.
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {
		//when nums is not null
		 if(nums.length!=0&&nums!=null){
	            int count=0;
	            //loop
	            for(int i =0;i<nums.length;i++){
	                //loop to meet a new number then increase count
	            	if(nums[count]!=nums[i])
	                {
	                    count++;
	                    nums[count]=nums[i];
	                }
	            }
	            return count+1;
	        }else{
	            return 0;
	        }
		
	}
	
	
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.removeDuplicates(new int[]{1,2,3,3,4});
	}

}
