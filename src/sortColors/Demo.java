package sortColors;

public class Demo {
    /**
     * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
     *
     * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
     *
     * Note: You are not suppose to use the library's sort function for this problem.
     *
     * Example:
     *
     * Input: [2,0,2,1,1,0]
     * Output: [0,0,1,1,2,2]
     *
     * @param nums
     */
    public void sortColors(int[] nums) {
        int start=0,end=nums.length-1;
        for(int i=0;i<=end;i++){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[start];
                nums[start++]=temp;
            }else if(nums[i]==2){
                int temp1=nums[i];
                nums[i--]=nums[end];
                nums[end--]=temp1;
            }
        }
    }
}
