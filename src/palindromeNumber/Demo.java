package palindromeNumber;
/**
 * 
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * Input: 121
 * Output: true
 * @author reggie
 *
 */
public class Demo {
	 public boolean isPalindrome(int x) {
		 try {
			 if(Math.signum(x)<0)
			 return false;
			 boolean pail=false;
			 String number=String.valueOf(Math.abs(x));
		     StringBuilder sb=new StringBuilder();
		     sb.append(number);
		     int resr=Integer.valueOf(sb.reverse().toString());
		     if(resr==x)
		    	 pail=true;
		     else
		    	 pail=false;
		 
		 return pail;
		 }catch(NumberFormatException nfe){
			 return false;
		 }
		 
	 }
	public static void main(String []args) {
		Demo demo=new Demo();
		System.out.println(demo.isPalindrome(121));
	}
}
