package validPalidrome;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 
	 * @param s
	 * @return
	 */
	public boolean isPalidrome(String s) {
		char[] charS = s.toCharArray();
		int left = 0;
		int right = charS.length - 1;
		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(charS[left])) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(charS[right])) {
				right--;
			}
			if (Character.toLowerCase(charS[left]) == Character.toLowerCase(charS[right])) {
				left++;
				right--;
			} else
				return false;

		}
		return true;
		
		//return new StringBuilder(s.replaceAll("[^A-Za-z0-9]","").toLowerCase()).reverse().toString().equals(s.replaceAll("[^A-Za-z0-9]",""));
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.isPalidrome("A man, a plan, a canal: Panam2a"));
	}
}
