package reverseInteger;

public class Demo {

	
	 public int reverse(int x) {
		 try {
		        String[] num=String.valueOf(x).split("");
		        int count=num.length;
		        String []afterNum=new String[num.length];
		        for(int i=0;i<num.length;i++) {
		        	if(num[0].equals("-")) {
		        		if(i+1==num.length)
		        			break;
		        		afterNum[0]="-";
		        		afterNum[i+1]=num[count-1];
		        	}else
		        		afterNum[i]=num[count-1]; 
		        	count--;
		        }
		        String last = "";
		        for(String line:afterNum)
		        	last+=line;
		        int lastNum=Integer.valueOf(last);
		        return lastNum;
	        }catch(RuntimeException re) {
	        	return 0;
		 }
	        
	        	
		
		 
	 }
	public static void main(String[] args) {
		Demo demo=new Demo();
	
		System.out.println(demo.reverse(964351));

	}

}
