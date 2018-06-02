package validParentheses;

public class Demo {

	 public boolean isValid(String s) {
	       String a = s;
			for (int i = 0; i < s.length(); i++) {
				a = a.replace("[]", "");
				a = a.replace("()", "");
				a = a.replace("{}", "");
			}

			if (a.isEmpty())
				return true;
			else
				return false;

	    }
	
	public static void main(String []args) {
		Demo demo=new Demo();
		demo.isValid("");
	}
}
