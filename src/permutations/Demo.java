package permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * @author reggie
 */
public class Demo {
    /**
     * Given a collection of distinct integers, return all possible permutations.
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        backtracking(list,new ArrayList<>(),nums);
        return list;
    }
    private void backtracking(List<List<Integer>> outList,List<Integer> inList, int []nums){
        if(inList.size() ==nums.length){
            outList.add(new ArrayList<>(inList));
        }else {
            for (int i = 0; i < nums.length ; i++) {
                if (inList.contains(nums[i])) continue;
                inList.add(nums[i]);
                backtracking(outList, inList, nums);
                inList.remove(inList.size()-1);
            }
        }
    }
}
