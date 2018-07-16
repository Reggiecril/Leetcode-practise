package reverseVowelsOfAString;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Write a function that takes a string as input and reverse only the vowels of
	 * a string.
	 * 
	 * Given s = "hello", return "holle".
	 * 
	 * 
	 * @param s
	 * @return
	 */
	public String reverseVowels(String s) {
		// String[] split=s.split("");
		// Stack<String> stack=new Stack<String>();
		// for(int i=0;i<split.length;i++){
		// if(split[i].equals("a")||split[i].equals("i")||split[i].equals("o")||split[i].equals("u")||split[i].equals("e")||split[i].equals("A")||split[i].equals("I")||split[i].equals("O")||split[i].equals("U")||split[i].equals("E")){
		// stack.push(split[i]);
		// split[i]="0";
		// }
		// }
		// String string="";
		// for(int i=0;i<split.length;i++){
		// if(split[i]=="0"){
		// split[i]=stack.pop();
		//
		// }
		// string +=split[i];
		// }
		// return string;
		List<Character> list = new ArrayList<>();
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');
		list.add('A');
		list.add('E');
		list.add('I');
		list.add('O');
		list.add('U');

		char[] ch = s.toCharArray();
		int left = 0;
		int right = ch.length - 1;
		while (left < right) {
			while (left < right && !list.contains(ch[left]))
				left++;
			while (left < right && !list.contains(ch[right]))
				right--;
			if (ch[left] != ch[right]) {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
			}
			left++;
			right--;
		}
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.reverseVowels("hello"));
	}
}