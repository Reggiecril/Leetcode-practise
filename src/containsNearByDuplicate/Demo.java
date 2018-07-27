package containsNearByDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null||nums.length==0)
            return false;
//        for(int i=0;i<nums.length;i++){
//            for(int j=1;j<=k;j++)
//                if((i+j)<nums.length&&nums[i]==nums[i+j])return true;
//            
//        }
//        return false;
        
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k) set.remove(nums[i-k-1]);
            if(set.contains(nums[i]))
                return true;
            else set.add(nums[i]);
        }
        return false;
    }
	public static void main(String []args) {
		Demo demo=new Demo();
		System.out.println(demo.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
	}
}
