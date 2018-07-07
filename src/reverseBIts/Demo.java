package reverseBIts;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Reverse bits of a given 32 bits unsigned integer.
	 * 
	 * Input: 43261596 
	 * Output: 964176192 
	 * Explanation: 43261596 represented in binary
	 * as 00000010100101000001111010011100, return 964176192 represented in binary
	 * as 00111001011110000010100101000000.
	 * 
	 * @param n
	 * @return
	 */
	public int reverseBits(int n) {
		int res = 0;
		//loop 32bits
		//loop n for first to last,
		// get last number to adjust if the number is 1,yes to move 'res' one bits and assign 1,no to move 'res' one bits;
		//then remove the last bits of n, to next loop
		for (int i = 0; i < 32; i++) {
			//
			if ((n & 1) == 1) {
				res = (res << 1) + 1;
			} else {
				res = res << 1;
			}
			n = n >> 1;
		}
		return res;

	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.reverseBits(43261596));
	}

}
