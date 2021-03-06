package maximizeDistanceToClosestPerson;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 
	 * In a row of seats, 1 represents a person sitting in that seat, and 0
	 * represents that the seat is empty.
	 * 
	 * There is at least one empty seat, and at least one person sitting.
	 * 
	 * Alex wants to sit in the seat such that the distance between him and the
	 * closest person to him is maximized.
	 * 
	 * Return that maximum distance to closest person.
	 * 
	 * 
	 * Input: [1,0,0,0,1,0,1] Output: 2 Explanation: If Alex sits in the second open
	 * seat (seats[2]), then the closest person has distance 2. If Alex sits in any
	 * other open seat, the closest person has distance 1. Thus, the maximum
	 * distance to the closest person is 2.
	 * 
	 * @param seats
	 * @return
	 */
	public int maxDistToClosest(int[] seats) {
		int length = seats.length;
		int max = 0;
		int i = 0;
		while (i < length) {
			while (i < length && seats[i] == 1)
				i++;
			int j = i;
			while (i < length && seats[i] == 0)
				i++;
			if (j == 0 || i == length)
				max = Math.max(max, i - j);
			else
				max = Math.max(max, (i - j + 1) / 2);

		}
		return max;
	}
}
