package shortestDistanceToACharacter;

import java.util.Arrays;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 
	 * @param S
	 * @param C
	 * @return
	 */
	public int[] shortestToChar(String S, char C) {
		if (S.length() == 0 || S.equals("") || C == ' ')
			return new int[0];
		int[] num=new int[S.length()];
		int first =0;
		for(int i=0;i<S.length();i++) {
			int point=S.substring(i).indexOf(C)!=-1?S.substring(i).indexOf(C)+i:-1;
			if(i==0)
				first=point;
			if(point>first)
			{
				num[i]=Math.min(Math.abs(first-i), Math.abs(point-i));
				if(num[i]==Math.abs(point-i))
					first=point;
			}else {
				num[i]=Math.abs(first-i);
			}
		}
		return num;
		
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(Arrays.toString(demo.shortestToChar("abaa", 'b')));
	}
}
