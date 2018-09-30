package relativeRank;

import java.util.Arrays;
import java.util.HashMap;

public class Demo {
    public String[] findRelativeRanks(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        String []res=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);

        if(nums.length>0){
            res[map.get(nums[nums.length-1])]="Gold Medal";
        }
        if(nums.length>1){
            res[map.get(nums[nums.length-2])]="Silver Medal";
        }
        if(nums.length>2){
            res[map.get(nums[nums.length-3])]="Bronze Medal";
        }
        if(nums.length>3){
            int length=nums.length-3;
            for(int i=0;i<length;i++)
                res[map.get(nums[i])]=String.valueOf(nums.length-i);
        }
        return res;
    }
}
