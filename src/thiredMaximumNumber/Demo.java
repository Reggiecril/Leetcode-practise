package thiredMaximumNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo {
    public int thirdMax(int[] nums) {
        if(nums.length==0||nums==null)return 0;

        Arrays.sort(nums);
        Set<Integer> set=new HashSet<>();
        for(int i=nums.length-1;i>=0;i--){
            if(set.size()==3)
                break;
            else set.add(nums[i]);
        }
        if(set.size()<3)
            return nums[nums.length-1];
        else{
            Object[] in=set.toArray();
            return (int)in[0];
        }
    }
}
