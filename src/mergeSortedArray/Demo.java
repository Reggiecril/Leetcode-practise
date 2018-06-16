package mergeSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *Note:
 *The number of elements initialized in nums1 and nums2 are m and n respectively.
 *You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * @author reggie
 *
 */
public class Demo {
	  public void merge(int[] nums1, int m, int[] nums2, int n) {
		  for (int i=m; i<m+n; i++) 
				nums1[i] = nums2[i-m];
			Arrays.sort(nums1);
			System.out.println(Arrays.toString(nums1));
	    
	        
	    }
	public static void main(String[] args) {
			Demo demo=new Demo();
			int[] nums1 = {1,2,3,0,0,0};int m = 3;
			int[] nums2 = {2,5,6};  int n = 3;
			demo.merge(nums1, m, nums2, n);
	}

}
