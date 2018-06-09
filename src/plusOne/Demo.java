package plusOne;

public class Demo {
	/**
	 * 
	 * 
	 * Given a non-empty array of digits representing a non-negative integer, plus
	 * one to the integer. The digits are stored such that the most significant
	 * digit is at the head of the list, and each element in the array contain a
	 * single digit. You may assume the integer does not contain any leading zero,
	 * except the number 0 itself. Input: [1,2,3] Output: [1,2,4] Explanation: The
	 * array represents the integer 123.
	 * 
	 * @param digits
	 * @return
	 */
	public int[] plusOne(int[] digits) {
		if (digits != null && digits.length > 0) {
			int length = digits.length - 1;

			for (int i = length; i >= 0; i--) {

				if (digits[i] != 9) {
					digits[i]++;
					break;
				} else {
					digits[i] = 0;
				}

			}

			if (digits[0] != 0) {
				int[] newInt = new int[length + 1];
				newInt[0] = 1;
				for (int i = 0; i < length + 1; i++) {
					newInt[i + 1] = digits[i];
				}
			}
			return digits;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		int[] nu = { 9 };
		System.out.println(demo.plusOne(nu));
	}

}
