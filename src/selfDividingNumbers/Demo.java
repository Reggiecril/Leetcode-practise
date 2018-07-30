package selfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * A self-dividing number is a number that is divisible by every digit it
	 * contains.
	 * 
	 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 ==
	 * 0, and 128 % 8 == 0.
	 * 
	 * Also, a self-dividing number is not allowed to contain the digit zero.
	 * 
	 * Given a lower and upper number bound, output a list of every possible self
	 * dividing number, including the bounds if possible.
	 * 
	 * Input: left = 1, right = 22 Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15,
	 * 22]
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		while (left <= right) {
			int number = left;
			boolean flag = true;
			while (number > 0 && flag) {
				int divide = number % 10;
				if (divide == 0 || left % divide != 0) {
					flag = false;
				} else {
					number /= 10;
				}
			}
			if (flag)
				list.add(left);
			left++;
		}
		return list;
	}
}
