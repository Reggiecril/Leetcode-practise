package rotatedDigits;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 
	 * @param N
	 * @return
	 */
	public int rotatedDigits(int N) {
		int count = 0;
		for (int i = 1; i <= N; i++) {
			int number = i;
			boolean flag = false;
			while (number > 0) {
				int last = number % 10;
				if (flag) {
					if (last != 2 && last != 5 && last != 6 && last != 9 && last != 0 && last != 1 && last != 8) {
						flag = false;
						break;
					}
				} else {
					if (last == 2 || last == 5 || last == 6 || last == 9)
						flag = true;
					else if (last != 0 && last != 1 && last != 8) {
						flag = false;
						break;
					}
				}
				number /= 10;
			}
			if (flag)
				count++;
		}
		return count;
	}
}
