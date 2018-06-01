package reverseInteger;

public class Demo {

	/**
	 * Given a 32-bit signed integer, reverse digits of an integer.
	 * Input: 123
	 * Output: 321
	 * @param x
	 * @return
	 */
	
	 public int reverse(int x) {
		 try {
			 	double n=Math.signum(x);
			 	String negitive="";
			 	
			 	
		        String num=String.valueOf(Math.abs(x));
		        StringBuilder sb=new StringBuilder();
		        sb.append(num);
		        int lastNum=0;
		        if(n<0)
		        	lastNum=-Integer.valueOf(sb.reverse().toString());
		        else
		        	lastNum=Integer.valueOf(sb.reverse().toString());
		        return lastNum;
	        }catch(RuntimeException re) {
	        	return 0;
		 }
	        
	        	
		
		 
	 }
	public static void main(String[] args) {
		Demo demo=new Demo();
	
		System.out.println(demo.reverse(-964351));

	}

}
