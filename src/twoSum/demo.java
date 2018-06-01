package twoSum;
/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * @author reggie
 *
 */
public class demo {
    public int[] twoSum(int[] nums, int target) {
        int []number=new int[2];
        for(int i=0;i<nums.length;i++){
        	boolean isTarget=false;
            for(int j=0;j<nums.length;j++){
            	if(j!=i) {
	                if(nums[i]+nums[j]==target){
	                	
	                	isTarget=true;
	                    number[0]=i;
	                    number[1]=j;
	                }
            	}
            }
            
            if(isTarget)
            break;
            
        } return number;
    }
public static void main(String []args) {
	demo c=new demo();
	int[] nums = {2, 7, 11, 15};
	int[] nums1 = {3,2,4};
	
	int target = 9;
	int []number=c.twoSum(nums, target);
	int []number1=c.twoSum(nums1, 6);
	for(int i:number)
		System.out.println(i);
	System.out.println("+++++++++++++++++++++++++++++++");
	for(int i:number1)
		System.out.println(i);
}
}