package longestCommonPrefix;

public class Demo {
	/**
	 * Write a function to find the longest common prefix string amongst an array of strings.
	 * If there is no common prefix, return an empty string "".
	 * Input: ["flower","flow","flight"]
	 * Output: "fl"
	 * @param strs
	 * @return
	 */
	  public String longestCommonPrefix(String[] strs) {
		  String prefix="";
	        for(int i=0;i<strs.length;i++) {
	        	if(i==0) {
	        		prefix=strs[i];
	        	}else {
	        		String[] spilt1=prefix.split("");
	        		String[] spilt2=strs[i].split("");
	        		prefix="";
	        		for(int j=0;j<spilt2.length;j++) {
	        			try {
	        				if(spilt1[j].equals(spilt2[j]))
	        					prefix+=spilt1[j];
	        				else
	        					break;
	        			}catch(Exception e) {
	        				break;
	        			}
	        				
	        		
	        			
	        		}
 	        	}
	        }
		  
		  return prefix;
	    }
	public static void main(String[] args) {
		Demo demo=new Demo();
		String []strs= {"flower","flow","flight"};
		System.out.println(demo.longestCommonPrefix(strs));
	}

}
