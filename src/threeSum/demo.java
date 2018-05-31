package threeSum;

import java.util.ArrayList;
import java.util.List;

public class demo {
	public List<List<Integer>> threeSum(int[] nums) {
		List<Integer> intList = new ArrayList<>();
		if (nums.length < 3)
			return new ArrayList<>();
		else {
			for (int i : nums)
				intList.add(i);
			List<List<Integer>> lastList = new ArrayList<>();
			for (int q = 0; q < nums.length; q++) {
				for (int w = q + 1; w < nums.length; w++) {
					int start = nums[q];
					int middle = nums[w];
					int end = -(start + middle);
					if (start == 0 && middle == 0 && end == 0) {
						List<Integer> array = new ArrayList<>();
						array.add(nums[q]);
						array.add(nums[w]);
						array.add(end);
						lastList.add(array);
						return lastList;
					}

					if (intList.contains(end)) {
						if (end != start && end != middle) {
							if(start!=0&&middle!=0&&end!=0) {
							if (lastList.size() == 0) {
								List<Integer> array = new ArrayList<>();
								array.add(start);
								array.add(middle);
								array.add(end);
								lastList.add(array);
							} else {
								int xe = 0;
								for (int i = 0; i < lastList.size(); i++) {
									List<Integer> singalList = lastList.get(i);
									if (singalList.contains(start) && singalList.contains(middle)
											&& singalList.contains(end)) {
										xe = 0;
										continue;
									} else if (lastList.size() == 2) {
										continue;
									} else {
										xe = 1;
										List<Integer> array = new ArrayList<>();
										array.add(nums[q]);
										array.add(nums[w]);
										array.add(end);
										lastList.add(array);

									}
									System.out.println(xe);
								}

							}
						}
						}
					}

				}
			}

			return lastList;
		}
	}

	public static void main(String[] args) {

		demo d = new demo();
		int[] nums = { 0, 0, 0 };
		d.threeSum(nums);

		for (int i = 0; i < d.threeSum(nums).size(); i++)
			System.out.println(d.threeSum(nums).get(i).toString());

	}
}
