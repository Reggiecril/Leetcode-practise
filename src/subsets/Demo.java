package subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    /**
     * Given a set of distinct integers, nums, return all possible subsets (the power set).
     *
     * Note: The solution set must not contain duplicate subsets.
     *
     * Example:
     *
     * Input: nums = [1,2,3]
     * Output:
     * [
     *   [3],
     *   [1],
     *   [2],
     *   [1,2,3],
     *   [1,3],
     *   [2,3],
     *   [1,2],
     *   []
     * ]
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outList=new ArrayList<>();
        Arrays.sort(nums);
        sub(outList,new ArrayList<>(),nums,0);

        return outList;
    }
    private void sub(List<List<Integer>> outList,List<Integer> inList,int []nums,int index){
        outList.add(new ArrayList<>(inList));
        for(int i=index;i<nums.length;i++){
            inList.add(nums[i]);
            sub(outList,inList,nums,i+1);
            inList.remove(inList.size()-1);
        }

    }
}
