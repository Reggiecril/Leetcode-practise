package guessNumberHigherOrLower;

import java.util.Random;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * We are playing the Guess Game. The game is as follows:
	 * 
	 * I pick a number from 1 to n. You have to guess which number I picked.
	 * 
	 * Every time you guess wrong, I'll tell you whether the number is higher or
	 * lower.
	 * 
	 * You call a pre-defined API guess(int num) which returns 3 possible results
	 * (-1, 1, or 0):
	 * 
	 * -1 : My number is lower 1 : My number is higher 0 : Congrats! You got it!
	 * 
	 * n = 10, I pick 6.
	 * 
	 * Return 6.
	 * 
	 * @param n
	 * @return
	 */
	public int guessNumber(int n) {
		int before = n, now = 0;
		while (now <= before) {
			int number = now + (before - now) / 2;
			if (guess(number) == 0)
				return number;
			else if (guess(number) == 1)
				now = number + 1;
			else
				before = number - 1;
		}
		return now;
	}
	Random random=new Random();
	int ren=random.nextInt();
	public int guess(int number) {
		if(ren>number)
			return -1;
		else if(ren<number)
			return 1;
		else 
			return 0;
	}
}
