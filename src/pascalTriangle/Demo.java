package pascalTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a non-negative integer numRows, generate the first numRows of Pascal's
	 * triangle.
	 * Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
	 * 
	 * @param numRows
	 * @return
	 */
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> outArray = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> inArray = new ArrayList<>();
			for (int j = 0; j < i + 1; j++) {
				if (j == 0)
					inArray.add(1);
				else if (j == i) {
					inArray.add(1);
				} else {
					inArray.add(outArray.get(i - 1).get(j) + outArray.get(i - 1).get(j - 1));
				}
			}
			outArray.add(inArray);
		}
		return outArray;
	}
}
