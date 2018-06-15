package climbingStairs;

public class Demo {
	/**
	 * You are climbing a stair case. It takes n steps to reach to the top.
	 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	 * Note: Given n will be a positive integer.
	 * @param n
	 * @return
	 */
	public int climbStairs(int n) {
		int []num=new int[n];
		if(n>0) {
			for(int i=0;i<n;i++) {
				if(i==0)
					num[i]=1;
				else if(i==1)
					num[i]=2;
				else
					num[i]=num[i-1]+num[i-2];
			}
		}
		return num[n-1];
	}
	public static void main(String[] args) {
		Demo demo=new Demo();
		System.out.println(demo.climbStairs(11));
	}

}
