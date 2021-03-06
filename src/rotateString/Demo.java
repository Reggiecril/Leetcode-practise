package rotateString;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * We are given two strings, A and B.
	 * 
	 * A shift on A consists of taking string A and moving the leftmost character to
	 * the rightmost position. For example, if A = 'abcde', then it will be 'bcdea'
	 * after one shift on A. Return True if and only if A can become B after some
	 * number of shifts on A.
	 * 
	 * @param A
	 * @param B
	 * @return
	 */
	public boolean rotateString(String A, String B) {
        return A.length()==B.length()&&(A+A).contains(B);

	}
	public static void main(String []args) {
		Demo demo=new Demo();
		System.out.println(demo.rotateString("abcde", "cdeab"));
	}
}
