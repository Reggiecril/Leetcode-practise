package excelSheetColumnNumber;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a column title as appear in an Excel sheet, return its corresponding
	 * column number.
	 * 
	 * A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28
	 * 
	 * Input: "ZY" Output: 701
	 * 
	 * @param s
	 * @return
	 */
	public int titleToNumber(String s) {
		//In case if null pointer
		if (s.length() == 0 || s == null)
			return 0;
		int total = 0;
		//loop s to get every char and calculate 
		for (int i = 0, j = s.length(); i < s.length(); i++, j--) {
			total += (int) (Math.pow(26, j - 1)) * ((int) (s.charAt(i) - 'A' + 1));
		}

		return total;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.titleToNumber("ZY"));
	}

}
