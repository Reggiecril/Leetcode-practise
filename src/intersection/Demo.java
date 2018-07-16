package intersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given two arrays, write a function to compute their intersection. Given nums1
	 * = [1, 2, 2, 1], nums2 = [2, 2], return [2].
	 * 
	 * 
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					if (!list.contains(nums1[i]))
						list.add(nums1[i]);
				}
			}
		}
		int[] newInt = new int[list.size()];
		for (int o = 0; o < newInt.length; o++) {
			newInt[o] = list.get(o);
		}

		return newInt;
	}
}
