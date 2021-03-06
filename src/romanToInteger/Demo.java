package romanToInteger;

import java.util.HashMap;

public class Demo {

	/**
	 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
	 * For example, two is written as II in Roman numeral, just two one's added together. 
	 * Twelve is written as, XII, which is simply X + II. 
	 * The number twenty seven is written as XXVII, which is XX + V + II.
	 * 
	 * Input: "MCMXCIV"
	 * Output: 1994
	 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
	 * @param s
	 * @return
	 */
	
	public int romanToInt(String s) {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
	    String []spilt=s.split("");
	    int total=0;
	    for(int i=spilt.length-1;i>=0;i--) {
	    	if(i==spilt.length-1) {
	    		total+=map.get(spilt[i]);
	    	}else {
	    		if(map.get(spilt[i])>=map.get(spilt[i+1])) {
	    			total+=map.get(spilt[i]);
	    		}else {
	    			total-=map.get(spilt[i]);
	    		}
	    		
	    	}
	    }
		return total;
	}
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.romanToInt("MCMXCIV");

	}

}
