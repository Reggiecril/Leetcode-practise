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
			return nums[0];
		}else {
			subLength = (nums.length - 1) / 2;
		}
		int total = 0;
		for (int x = 0; x <= nums.length - subLength; x++) {
			int singal = 0;
			
			for (int i = 0; i < subLength; i++) {
				singal += nums[x+i];
			}
			if(x==0)
				total=singal;
			if(total<=singal) {
				total=singal;
			}else {
				continue;
			}
		}


		return total;

	}
	 public int maxSubArray1(int[] nums) {
	   	    int subLength=(int)(nums.length/2);
	        int max=0;
	        if(nums.length!=0&&nums!=null){
	        	
	            if(nums.length==1)
	                return nums[0];
	            if(nums.length==2) {
	            	 for(int i=0;i<nums.length;i++){
	     
	 	                int total=0;
	 	                for(int j=0;j<1;j++){
	 	                    total+=nums[i+j];
	 	                }
	 	                
	 	                if(i==0)
	 	                	max=total;
	 	                else if(max<total)
	 	                    max=total;
	 	            }
	            	 return max;
	            }
	            for(int i=0;i<nums.length-subLength;i++){
	                int total=0;
	                for(int j=0;j<subLength;j++){
	                    total+=nums[i+j];
	                }
	                if(max<total)
	                    max=total;
	            }
	        }
	        
			return max;
	        
	    }
	public static void main(String[] args) {
		Demo demo = new Demo();

		int[] nums = {-2,-1};
		System.out.println(demo.maxSubArray1(nums));
	}

}
