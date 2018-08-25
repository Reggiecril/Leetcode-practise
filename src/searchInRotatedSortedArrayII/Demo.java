package searchInRotatedSortedArrayII;

import java.util.Arrays;

public class Demo {
    /**
     * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
     *
     * (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).
     *
     * You are given a target value to search. If found in the array return true, otherwise return false.
     *
     * Example 1:
     *
     * Input: nums = [2,5,6,0,0,1,2], target = 0
     * Output: true
     * @param nums
     * @param target
     * @return
     */
        public boolean search(int[] nums, int target) {
            if(nums.length==0||nums==null)return false;
            if(nums.length==1)return nums[0]==target;
//            int left=0,right=nums.length-1;
//            Arrays.sort(nums);
//            while(left<=right){
//                int mid=(right+left)/2;
//                if(nums[mid]<target){
//                    left=mid+1;
//                }else if(nums[mid]>target){
//                    right=mid-1;
//                }else{
//                    return true;
//                }
//            }
//            return false;
//
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target)return true;
            }
            return false;
        }

}
