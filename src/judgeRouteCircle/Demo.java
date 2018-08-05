package judgeRouteCircle;

import java.util.HashMap;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Initially, there is a Robot at position (0, 0). Given a sequence of its
	 * moves, judge if this robot makes a circle, which means it moves back to the
	 * original place.
	 * 
	 * The move sequence is represented by a string. And each move is represent by a
	 * character. The valid robot moves are R (Right), L (Left), U (Up) and D
	 * (down). The output should be true or false representing whether the robot
	 * makes a circle.
	 * 
	 * @param moves
	 * @return
	 */
	public boolean judgeCircle(String moves) {
		if (moves.length() == 0 || moves == null)
			return false;
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('R', 0);
		map.put('L', 0);
		map.put('U', 0);
		map.put('D', 0);
		char[] ch = moves.toCharArray();
		for (char c : ch) {
			map.put(c, map.get(c) + 1);
		}
		int R = map.get('R');
		int L = map.get('L');
		int U = map.get('U');
		int D = map.get('D');
		if (R == L && U == D)
			return true;
		else
			return false;
	}
}
