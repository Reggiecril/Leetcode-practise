package lengthOfLastWord;

public class Demo {
    public int lengthOfLastWord(String s) {
    	int length=0;
    	if(s.trim().equals(""))
    		return 0;
    	else{
    		String []line=s.split(" ");
    		length=line[line.length-1].length();
    		return length;
    	}
    }
	public static void main(String[] args) {
		Demo demo=new Demo();
		System.out.println(demo.lengthOfLastWord("Hello World!"));
		
	}

}
