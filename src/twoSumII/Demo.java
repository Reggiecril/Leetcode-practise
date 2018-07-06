package twoSumII;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given an array of integers that is already sorted in ascending order, find
	 * two numbers such that they add up to a specific target number.
	 * 
	 * The function twoSum should return indices of the two numbers such that they
	 * add up to the target, where index1 must be less than index2.
	 * 
	 * 
	 * Input: numbers = [2,7,11,15], target = 9 Output: [1,2] 
	 * Explanation: The sum
	 * of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
	 * 
	 * @param numbers
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] numbers, int target) {
		int[] newNum = new int[2];
		if (numbers.length != 0 && numbers != null) {
			//find the minimum
			for (int min = 0; min < numbers.length - 1; min++) {
				//find the maximum
				for (int max = numbers.length - 1; max > 0; max--) {
					if (numbers[max] + numbers[min] > target) {
					} else if (numbers[max] + numbers[min] < target)
						break;
					else {
						newNum[0] = min;
						newNum[1] = max;
						return newNum;
					}

				}
			}

		}
		return newNum;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		int[] numbers = new int[] { 2, 7, 11, 15 };
		for (int i : demo.twoSum(numbers, 9))
			System.out.println(i);
	}

}
