package numberOf1Bits;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Write a function that takes an unsigned integer and returns the number of '1'
	 * bits it has (also known as the Hamming weight).
	 *  Input: 11 Output: 3
	 * Explanation: Integer 11 has binary representation
	 * 00000000000000000000000000001011
	 * 
	 * @param n
	 * @return
	 */
	public int hammingWeight(int n) {
		//initalze weight
		int weight = 0;
		//loop 32bits
		//right move n, adjust if last bits is 1;weight ++,else nothing;
		for (int i = 0; i < 32; i++) {
			if ((n & 1) == 1)
				weight++;
			n = n >> 1;
		}
		return weight;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();

	}

}
